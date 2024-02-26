import { useState } from 'react'  
import './App.css'
import { Link } from 'react-router-dom'
import 'bootstrap/dist/css/bootstrap.min.css'

function App() {

  const [contacts, setContacts] = useState([
    {
      id: Date.now(),
      lastname: '',
      firstname: '',
      email: '',
      phone: '',
    }
  ])

  return (
    <>
    <h1>Ma liste de contacts</h1>

      <Link to={'/contacts/add'}>Ajouter contact </Link>
      <Link to={'/contacts/edit'}>Modifier contact </Link>
      <Link to={'/contacts/delete'}>Supprimer contact </Link>

    </>
  )
}

export default App
