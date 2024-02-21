import React, { useRef } from "react";

const Task = ({ onTask }) => {
  const taskNameRef = useRef();
  const taskDescriptionRef = useRef();
  const taskDateRef = useRef();

  const addTask = () => {
        const addTodo = {
            id: Date.now(),
            taskName: taskNameRef.current.value,
            description: taskDescriptionRef.current.value,
            date: taskDateRef.current.value
        }

    onTask(addTodo);

    taskNameRef.current.value = "";
    taskDescriptionRef.current.value = "";
    taskDateRef.current.value = "";
  };

    
    return (
        <div className='bg-dark text-white d-grid justify-content-center rounded p-2'>
            <h1 className="fs-4">Ajouter tâche</h1>
            <label htmlFor="taskName">Tâche : </label>
            <input type="text" ref={taskNameRef} className="rounded"/>

            <label htmlFor="taskDescription">Description de la tâche :</label>
            <textarea type="text" ref={taskDescriptionRef} className="rounded"/>

            <label htmlFor="taskDate">Date :</label>
            <input type="date" ref={taskDateRef} className="rounded"/>

            <button className="mt-2 bg-dark border-white text-white" onClick={addTask}>Créer tâche</button>

        </div>
    );
}

export default Task;