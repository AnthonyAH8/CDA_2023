import { useDispatch } from "react-redux";
import { addProduct } from "./ProductsSlice";
import { useState } from "react";

const AddProduct = () => {

    const dispatch = useDispatch();
    const [newProduct, setNewProduct] = useState({
        productname: '',
        description: '',
        price: ''
    });

    const add = () => {
        dispatch(
            addProduct({
                ...newProduct,
                id: Date.now(),
            })
        );
        setNewProduct({
            productname: "",
            description: "",
            price: "",
        });
    };

    return (
        <>
            <h2 className="text-center my-5">Nouveau produit</h2>
            <div className="d-flex justify-content-center align-items-center flex-row">
                <input
                    type="text"
                    placeholder="Entrez un nouveau produit"
                    value={newProduct.productname}
                    onChange={e => setNewProduct({ ...newProduct, productname: e.target.value })}
                />
                <button onClick={add} className="btn btn-primary mx-2">Ajouter Produit</button>
            </div>
        </>
    );
}

export default AddProduct;
