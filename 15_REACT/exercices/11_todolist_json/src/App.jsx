import { useEffect, useState } from 'react'
import './App.css'
import axios from "axios"
import 'bootstrap/dist/css/bootstrap.min.css';

const PORT = 'http://localhost:3000/todo'

function App() {
  const [data, setData] = useState(0)
  const [tasks, setTasks] = useState([]);
  const [newTask, setNewTask] = useState('');

  useEffect(() => {
    axios.get(PORT).then((response) => {
      setData(response.data)
    }).catch(error => console.error(error))
  }, [data])

  const addTodo = () => {
    axios.post('http://localhost:3000/todo', { tache: newTask, etat: "En cours" }).then((response) => {
      setTasks(previous => [...previous, response.data])
    }).catch((error) => {
      console.error(error)
    })

    setNewTask('')
  }

  const deleteTodo = () => {
    const todoDelete = data.find(todo => todo.etat === 'Fait');

    if (todoDelete) {
      axios.delete(`http://localhost:3000/todo/${todoDelete.id}`)
        .then(() => console.log(`Tâche avec l'id ${todoDelete.id} a été supprimée avec succès`))
        .catch((error) => {
          console.error(error);
        });
    }
  }

  const updateTodo = (todoId, updatedTodo) => {
      axios.put(`http://localhost:3000/todo/${todoId}`, updatedTodo)
      .then(response => setTasks(tasks.map(todo => (todo.id === todoId ? response.data : todo))))
        .catch(error => console.error(error))
  };

  return (
    <>
      <h1 className='fw-light mb-5'>To Do List</h1>
      <div className='d-inline-block w-full gap-5'>

        <div className='d-flex flex-column w-100'>
          <label>Nouvelle Tâche: </label>
          <input type="text" value={newTask} onChange={(e) => setNewTask(e.target.value.toUpperCase())} className='rounded my-2' />
          <button onClick={addTodo} className='btn btn-success'>Ajouter une tâche</button>
        </div>
      </div>
      {
        data && (
          <ul style={{ listStyleType: 'none' }}>
            {
              data.map((todo) => (
                <>
                  <div className='border border-dark rounded my-4 p-2'>
                    <li key={todo.id} >{todo.tache}</li>
                    <p>Etat : {todo.etat}</p>
                  </div>
                </>
              ))
            }
          </ul>
        )
      }
      <button onClick={updateTodo} className='btn btn-warning mx-2'>Modifier une tâche</button>

      <button onClick={deleteTodo} className='btn btn-danger ml-2'>Supprimer une tâche</button>
    </>
  )
}

export default App
