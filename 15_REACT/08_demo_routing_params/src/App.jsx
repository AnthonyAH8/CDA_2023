import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import { Link } from 'react-router-dom'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
     <Link to={'/projects/1'}>Projet 1</Link>
     <Link to={'/projects/2?mode=1&toto=2'}>Projet 2</Link>
     <Link to={'/projects/3?toto=2'}>Projet 3</Link>
     <Link to={'/projects/4'}>Projet 4</Link>
    </>
  )
}

export default App
