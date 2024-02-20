import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Multiplication from './components/Multiplication'

function App() {
  

  return (
    <>
      <Multiplication answer={15}/>
    </>
  )
}

export default App
