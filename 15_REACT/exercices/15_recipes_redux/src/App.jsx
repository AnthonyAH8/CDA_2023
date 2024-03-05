import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
// import './App.css'
import SignForm from './components/auth/SignForm'
import 'bootstrap/dist/css/bootstrap.min.css';
import RecipeHeader from './components/recipes/recipeHeader'
import AddRecipe from './components/recipes/addRecipe';
import RecipeItem from './components/recipes/recipeItem';
import RecipeList from './components/recipes/recipesList';

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <RecipeHeader />
      <SignForm />
      <AddRecipe/>
      <RecipeItem/>

    </>
  )
}

export default App
