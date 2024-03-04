import { createSlice } from '@reduxjs/toolkit';

const recipeSlice = createSlice({
    name: 'recipes',
    initialState: {
        formMode: "",
        recipes: [],
        selectedRecipe: null,
        ingredients: [],
        isLoading: false,
        error: null
    },
    reducers:{
        addRecipe: (state, action) => {
            state.recipes.push(action.payload);
        },
        deleteRecipe: (state, action) => {
            state.recipes = state.recipes.filter((recipe) => recipe.id !== action.payload);
        },
        updateRecipe: (state, action) => {
            const recipe = state.recipes.find((recipe) => recipe.id === action.payload);
        
        }
    }
});

export const { addRecipe, deleteRecipe, updateRecipe } = recipeSlice.actions;
export default recipeSlice.reducer;