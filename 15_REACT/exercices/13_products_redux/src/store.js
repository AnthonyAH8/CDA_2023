import { configureStore } from "@reduxjs/toolkit";
import productsSlice from "./components/Product/ProductsSlice";

export default configureStore({
    reducer: {
        product: productsSlice,
    },
});