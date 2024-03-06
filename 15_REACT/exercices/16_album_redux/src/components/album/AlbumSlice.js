import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import { BASE_DB_URL } from "../../firebaseConfig";
import axios from "axios";

export const fetchAlbums = createAsyncThunk("albums/fetchAlbums", async () => {
    const response = await axios.get(`${BASE_DB_URL}eAlbums.json`);
    const albums = [];

    for (const key in response.data) {
        albums.push({ id: key, ...response.data[key] });
    }

    return albums;
});

export const createAlbum = createAsyncThunk(`albums/createAlbum`, async (newAlbum, { getState }) => {
    const state = getState();
    const token = state.auth.token; // Replace with your actual token source
    const response = await axios.post(`${BASE_DB_URL}/eAlbums.json?auth=${token}`, newAlbum);

    return {
        id: response.data.name,
        ...newAlbum,
    };
});

export const editAlbum = createAsyncThunk("albums/updateAlbum", async ({ id, updateAlbum }) => {
    await axios.put(`${BASE_DB_URL}/eAlbums/${id}.json`, updateAlbum);
    return {
        id,
        ...updateAlbum,
    };
});

export const deleteAlbum = createAsyncThunk("albums/deleteAlbum", async (id) => {
    await axios.delete(`${BASE_DB_URL}/eAlbums/${id}.json`);
    return id;
});

const AlbumSlice = createSlice({
    name: "albums",
    initialState: {
        albums: [],
    },
    reducers: {},
    extraReducers: (builder) => {
        builder.addCase(fetchAlbums.fulfilled, (state, action) => {
            state.albums = action.payload;
        });
        builder.addCase(createAlbum.fulfilled, (state, action) => {
            state.albums.push(action.payload);
        });
        builder.addCase(editAlbum.fulfilled, (state, action) => {
            const index = state.albums.findIndex((album) => album.id === action.payload.id);
            if (index !== -1) {
                state.albums[index] = action.payload;
            }
        });
        builder.addCase(deleteAlbum.fulfilled, (state, action) => {
            state.albums = state.albums.filter((album) => album.id !== action.payload);
        });
    },
});

export default AlbumSlice.reducer;