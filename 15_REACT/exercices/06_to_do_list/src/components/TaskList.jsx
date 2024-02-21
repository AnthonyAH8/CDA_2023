import React, { useState } from 'react';

const TaskList = ({ tasksList, taskDelete }) => {

  

    const [tasks, setTasks] = useState([]);

  return (
    <div className='bg-dark text-white d-grid justify-content-center rounded p-2 mt-3'>
      <h2 >Liste des tâches</h2>
      <ul>
        {tasks.map((task, index) => (
          <li key={index}>
            <p>Nom de la tâche: {task.name}</p>
            <p>Description de la tâche: {task.description}</p>
            <p>Date : {task.date}</p>
            <p>Statut de la tâche: {task.completed ? 'Faite' : 'A faire'}</p>
            <button onClick={() => taskDelete(task.id)}>Supprimer tâche</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default TaskList;