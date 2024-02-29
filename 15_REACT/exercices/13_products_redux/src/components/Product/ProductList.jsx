import { useSelector } from "react-redux";
import ProductItem from "./ProductItem";

const ProductList = () => {

    const products = useSelector(state => state.product.products)
    return (
        <div className="d-flex flex-wrap flex-column">
            <h2 className="text-center my-5">Liste de produits</h2>
            <div className="d-flex justify-content-center flex-wrap gap-5">
                {products.map(product => (
                    <div className="d-flex text-center card align-items-center p-3 border border-dark w-25 my-3">
                        <p>{product.id}</p>
                        <p>Produit: {product.productname}</p>
                        <p>Description: {product.description}</p>
                        <p>Prix: {product.price} €</p>
                        <ProductItem key={product.id} product={product} />
                    </div>
                ))}
            </div>
        </div>
    );
}

export default ProductList;