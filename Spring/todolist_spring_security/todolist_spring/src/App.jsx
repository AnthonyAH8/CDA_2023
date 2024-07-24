import React from 'react';

import {BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Header from './shared/Header';
import Login from './components/Login';
import Register from './components/Register';
import TodosList from './components/TodosList';
import CreateTodo from './components/CreateTodo';
import PrivateRoute from './helpers/privateRoute';

function App() {
  return (
    <Router>
      <Header />
      <Routes>
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/" element={<Login />} />

        {/* <Route path='/todos' element={
          <PrivateRoute>
            <TodosList/>
          </PrivateRoute>
        }
        />
        <Route path='/add' element={
          <PrivateRoute>
            <CreateTodo/>
          </PrivateRoute>
        }/> */}
      </Routes>
    </Router>
  );
}

export default App;

