import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
// import './App.css'
import SignForm from './components/auth/SignForm'
import 'bootstrap/dist/css/bootstrap.min.css';
import RecipeHeader from './components/recipes/recipeHeader'
import AddRecipe from './components/recipes/addRecipe';

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <RecipeHeader />
      <SignForm />
      <AddRecipe/>
    </>
  )
}

export default App
