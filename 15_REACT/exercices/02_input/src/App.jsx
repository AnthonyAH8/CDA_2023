import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import FullName from './component/FullName'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <FullName/>
    </>
  )
}

export default App
