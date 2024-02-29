import { createSlice } from "@reduxjs/toolkit";

const productsSlice = createSlice({

    name: "product",
    initialState: {
        products: [
            {
                id: 1,
                productname: 'Clavier',
                description: 'Clavier ergonomique pour une utilisation plus facile.',
                price: 40
            },
            {
                id: 2,
                productname: 'Ecran tactile',
                description: "Facilite la programmation de sites web.",
                price: 200
            },
            {
                id: 3,
                productname: 'Stylet',
                description: 'Permet de créer des dessins sur un écran tactile.',
                price: 50
            }
        ],
    },
    reducers:{
        addProduct: (state, action) => {
            const newProduct = {
                productname: action.payload,
                description: action.payload,
                price: action.payload,
                id: Date.now(),
            };
            state.products.push(newProduct);
        },
        deleteProduct: (state, action) => {
            state.products = state.products.filter((product) => product.id !== action.payload);
        },
        toggleProduct: (state, action) => {
            const product = state.products.find((product) => product.id === action.payload.id);
        }
    }
})

export const { addProduct, deleteProduct, toggleProduct} = productsSlice.actions;

export default productsSlice.reducer;