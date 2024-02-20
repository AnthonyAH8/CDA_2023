import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Contacts from './components/Contacts'
import Tablecontacts from './components/TableContacts'

function App() {
  const [contacts, setContacts] = useState([])
  const addContact = (newContact) => {
    setContacts([...contacts, newContact])
  }

  return (
    <>
      <Contacts addContact={addContact}/>
      <Tablecontacts contacts={contacts}/>
    </>
  )
}

export default App;
