import React, { useState } from 'react'
import {useNavigate} from "react-router-dom"
import {todoService} from '../services/todoService';

function CreateTodo() {

    const [todo, setTodo] = useState({
        title: "",
        description: "",
        isCompleted: false
    })
    const navigate = useNavigate();

    const handleChange = (e) => {
      const { title, value } = e.target;
        setProduct(previousState => ({
            ...previousState,
            [title]: value
        }));
    }

    const handleSubmit = async (e) => {
      e.preventDefault()
      try{
        await todoService.createTodo(todo)
        setTodo({title: '', description: '', isCompleted: false})
        navigate("/todos")
      }catch(err){
          console.log(err);
      }
    }

  return (
    <div className="container mt-5">
        <h2>Créer un nouveau produit</h2>
        <form onSubmit={handleSubmit}>
            <div className="mb-3">
                <label htmlFor="productName" className="form-label">Nom</label>
                <input 
                    type="text" 
                    className="form-control" 
                    id="productName" 
                    name="name" 
                    value={product.name} 
                    onChange={handleChange} 
                />
            </div>
            <div className="mb-3">
                <label htmlFor="productPrice" className="form-label">Prix</label>
                <input 
                    type="number" 
                    className="form-control" 
                    id="productPrice" 
                    name="price" 
                    value={product.price} 
                    onChange={handleChange} 
                />
            </div>
            <button type="submit" className="btn btn-primary">Créer</button>
        </form>
    </div>
  )
}

export default CreateTodo