import { useDispatch } from 'react-redux';
import { deleteProduct, toggleProduct } from './ProductsSlice';

const ProductItem = ({ product }) => {
  const dispatch = useDispatch();

  const handleDelete = () => {
    dispatch(deleteProduct(product.id));
  };

  const handleEdit = () => {
    const updatedProduct = dispatch(toggleProduct(updatedProduct));
  };

  return (
    <div>
      <p>{product.name}</p>
      <button onClick={handleDelete} className='btn btn-primary mx-2'>Modifier le produit</button>
      <button onClick={handleEdit}className='btn btn-danger mx-2'>Supprimer le produit</button>
    </div>
  );
};

export default ProductItem;