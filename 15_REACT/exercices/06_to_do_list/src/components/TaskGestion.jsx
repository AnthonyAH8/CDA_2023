import React, { useState } from 'react';
import Task from './TaskTodo';
import TaskList from './TaskList';


const TaskGestion = () => {
    const [tasks, setTasks] = useState([]);

    const addTask = (newTask) => {
        setTasks([...tasks, newTask]);
    };

    const handleToggleStatus = (taskId) => {
        setTasks(tasks.find(task => (task.id === taskId ? { ...task, completed: !task.completed } : task)));
    };

    const handleDeleteTask = (taskId) => {
        setTasks(tasks.filter(task => task.id !== taskId))
    }

    return (
        <>
            <Task onTask={addTask} />
            <TaskList tasks={tasks} toggleStatus={handleToggleStatus} deleteTask={handleDeleteTask} />
        </>
    );
}

export default TaskGestion;