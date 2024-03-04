import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import SignForm from './components/auth/SignForm'
import { useDispatch, useSelector } from 'react-redux'
import TaskForm from './components/task/TaskForm'

function App() {
  const [count, setCount] = useState(0)
  const user = useSelector(state => state.auth.user)
  const dispatch = useDispatch()

  return (
    <>
    {
      user ?
      <TaskForm/>
      :
      <SignForm/>
    }
    </>
  )
}

export default App;
