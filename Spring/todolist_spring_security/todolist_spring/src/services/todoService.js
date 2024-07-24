import api from './api';
import authenticationHeader from '../helpers/authenticationHeader';

function todoService() {
  const getAllTodos = () => {
    return api.get("/todos", {headers: authenticationHeader()})
  }

  const createTodo = (todo) => {
    return api.post("/todos/admin/add", {headers: authenticationHeader()})
  }

  const updateTodo = (todoData) => {
    return api.put("/todos/admin/update", todoData, { headers:{
        ...authenticationHeader, "Content-Type": "application/json"
    }})
  }

  const deleteTodo = (todoId) => {
    return api.delete(`todos/admin/delete/${todoId}`, {headers: authenticationHeader()})
  }

}

export default todoService