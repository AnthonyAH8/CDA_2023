import { createAsyncThunk, createSlice } from "@reduxjs/toolkit";
import axios from 'axios'

export const PokemonAction = createAsyncThunk(
    "pokemon/PokemonAction",
    async () => {
        const response = await axios.get('https://tyradex.vercel.app/api/v1/gen/1');
        const data = await response.data;

        return data;
    }
);

const pokemonSlice = createSlice({
    name: "pokemons",
    initialState: {
        pokemons: [],
        isLoading: false,
    },
    extraReducers: (builder) => {
        builder.addCase(PokemonAction.pending, (state) => {
            state.isLoading = true
        });
        builder.addCase(PokemonAction.fulfilled, (state, action) => {
            state.isLoading = false;
            state.albums = action.payload;
          });
    }
});

export default pokemonSlice.reducer;