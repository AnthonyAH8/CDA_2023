import { useState } from 'react'
import './App.css'
import ProductCart from './components/ProductCart';
import ProductList from './components/ProductList';
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  const [products, setProducts] = useState([
    {
      id: 1, 
      productname : 'Clavier',
      description : 'Clavier ergonomique pour une utilisation plus facile.',
      prix: 40
    },
    {
      id: 2, 
      productname : 'Ecran tactile',
      description : "Facilite la programmation de sites web.",
      prix: 200
    },
    {
      id: 3, 
      productname : 'Stylet',
      description : 'Permet de créer des dessins sur un écran tactile.',
      prix: 50
    },
    {
      id: 4, 
      productname : 'Souris sans fil',
      description : 'Souris pour le jeu hautes performances.',
      prix: 110
    },
    {
      id: 5, 
      productname : 'Tapis de souris',
      description : 'Un tapis de souris de 360 x 260 mm avec une surface textile lisse',
      prix: 100
    }
  ]);

  const [cart, setCart] = useState([])
  const [isOpen, setIsOpen] = useState(false)

  return (
    <div>
      <h1>Mon site e-commerce</h1>
      <ProductList products={products} addToCart={(product) => setCart([...cart, product])} />
      <button onClick={() => setIsOpen(!isOpen)} className='btn btn-primary my-3'>Panier</button>
      {isOpen && <ProductCart cart={cart} setCart={setCart} />}
    </div>
  )
}

export default App;
