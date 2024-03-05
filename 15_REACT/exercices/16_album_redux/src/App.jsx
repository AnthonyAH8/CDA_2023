import { useState } from 'react'
import './App.css'
import SignForm from './components/auth/SignForm'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <SignForm/>
    </>
  )
}

export default App
