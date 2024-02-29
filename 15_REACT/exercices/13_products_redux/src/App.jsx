import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
// import './App.css'
import ProductList from './components/Product/ProductList'
import 'bootstrap/dist/css/bootstrap.min.css'
import AddProduct from './components/Product/AddProduct'

function App() {


  return (
    <>
      <ProductList/>
      <AddProduct/>
    </>
  )
}

export default App
