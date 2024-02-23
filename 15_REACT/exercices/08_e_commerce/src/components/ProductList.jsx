import React from 'react';

const ProductList = ({ products, addToCart }) => {
  return (
    <div>
      <h2 className='my-5'>Produits</h2>
      {products.map(product => (
        <div key={product.id} className='d-grid flex-column border border-secondary-subtle mb-2 px-4 py-3 rounded-2'>
          <h3 className='fw-bold'>{product.productname}</h3>
          <p className='fw-light'>Description: {product.description}</p>
          <p className='fw-bolder'>Prix: {product.prix} €</p>
          <button onClick={() => addToCart(product)} className='btn btn-success rounded-5'>Ajouter au panier</button>
          
        </div>
      ))}
    </div>
  );
};

export default ProductList;