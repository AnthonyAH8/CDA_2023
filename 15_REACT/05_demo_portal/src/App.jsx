import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Modal from './components/Modal/Modal'

function App() {
  const [isOpen, setIsOpen] = useState(false)
  return (
    <>
    <h1>Bienvenue</h1>
    <button onClick={() => setIsOpen(!isOpen)}>Cliquez ici!</button>
      {isOpen && <Modal>Test</Modal>}
    </>
  )
}

export default App
