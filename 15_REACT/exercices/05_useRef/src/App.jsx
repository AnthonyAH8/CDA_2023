import './App.css'
import Login from './components/Login'
import { useRef } from 'react'

function App() {

  const handleLogin = (username, password) => {
    console.log("Pseudo: " + username, ", Mot de passe: " + password);
  }

  return (
    <>
      <Login onLogin={handleLogin}/>
    </>
  )
}

export default App;
