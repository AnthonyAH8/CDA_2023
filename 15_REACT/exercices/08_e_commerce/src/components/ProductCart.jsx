import React from 'react';

const ProductCart = ({ cart, setCart }) => {
  const calculateTotal = () => {
    return cart.reduce((total, product) => total + product.prix, 0);
  };

  return (
    <div>
      {cart.length > 0 && (
        <div className='d-flex flex-column border border-secondary-subtle mb-5 px-4 py-3 rounded-2'>
          <h2>Contenu du panier:</h2>
          {cart.map(product => (
            <div key={product.id} className='my-3'>
              <p>{product.productname}</p>
               <p>Prix :{product.prix} €</p>
              <button onClick={() => setCart(cart.filter(item => item.id !== product.id))} className='btn btn-danger'>Supprimer</button>
            </div>
          ))}
          <p className='my-3'>Total panier: {calculateTotal()} €</p>
        </div>
      )}
    </div>
  );
};

export default ProductCart;