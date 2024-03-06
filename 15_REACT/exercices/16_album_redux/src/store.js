import { configureStore } from "@reduxjs/toolkit";
import authSlice from "./components/auth/authSlice";
import AlbumSlice from "./components/album/AlbumSlice";

const store = configureStore({
    reducer: {
        auth: authSlice,
        albums: AlbumSlice
    }
})

export default store