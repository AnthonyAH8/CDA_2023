import React, { useEffect, useState } from 'react';
import { todoService } from '../services/todoService';
import UpdateTodo from './UpdateTodo';

function TodosList() {

  const [todos, setTodos] = useState([]);
  const [error, setError] = useState('');
  const [selectedTodo, setSelectedTodo] = useState(null);

  useEffect(() => {
    loadTodos();
  }, []);

  const loadTodos = () => {
    todoService.getAllTodos()
      .then(response => {
        setTodos(response.data);
      })
      .catch(error => {
        setError('Erreur lors de la récupération des todos.');
      });
  };

  const updateTodo = (todoData) => {
    todoService.updateTodo(todoData)
      .then(() => {
        loadTodos();
        setSelectedTodo(null);
      })
      .catch(error => {
        setError('Erreur pendant la mise à jour du todo');
      });
  };

  const deleteTodo = (todoId) => {
    todoService.deleteTodo(todoId)
      .then(() => {
        loadTodos();
      })
      .catch(error => {
        setError('Erreur lors de la suppression du todo');
      });
  };

  return (
    <div className="container mt-5">
      <h2>Todo List</h2>
      {error && <div className="alert alert-danger" role="alert">
        {error}
      </div>}
      <table className="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Title</th>
            <th scope="col">Description</th>
            <th scope="col">Is Completed</th>
            <th scope="col" className='center'>Actions</th>
          </tr>
        </thead>
        <tbody>
          {todos.map((todo, index) => (
            <tr key={todo.id}>
              <th scope="row">{index + 1}</th>
              <td>{todo.title}</td>
              <td>{todo.description}</td>
              <td>{todo.isCompleted ? 'Yes' : 'No'}</td>
              <td>
                <button className="btn btn-danger mr-4" onClick={() => deleteTodo(todo.id)}>Supprimer</button>
                <button className='btn btn-warning' onClick={() => setSelectedTodo(todo)}>Update</button>
              </td>
            </tr>
          ))}
          {selectedTodo && (
            <UpdateTodo
              todo={selectedTodo}
              onSave={updateTodo}
              onCancel={() => setSelectedTodo(null)}
            />
          )}
        </tbody>
      </table>
    </div>
  );
}

export default TodosList;
