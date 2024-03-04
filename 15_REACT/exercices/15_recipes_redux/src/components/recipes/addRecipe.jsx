import { useRef, useState } from "react";
import { useDispatch, useSelector } from "react-redux";
import { addRecipe } from "./recipeSlice";
import { BASE_DB_URL } from "../../firebaseConfig";
import axios from "axios";

const AddRecipe = () => {
  const dispatch = useDispatch();
  const titleRef = useRef();
  const instructionRef = useRef();
  const cooktimeRef = useRef();
  const preptimeRef = useRef();
  const [ingredients, setIngredients] = useState([]);
  const user = useSelector((state) => state.auth.user);

  const handleIngredientChange = (e) => {
    setIngredients((prevIngredients) => [...prevIngredients, e.target.value]);
  };

  const recipeSubmit = (e) => {
    e.preventDefault();

    const newRecipe = {
      id: Date.now(),
      title: titleRef.current.value,
      instruction: instructionRef.current.value,
      cooktime: cooktimeRef.current.value,
      preptime: preptimeRef.current.value,
      ingredients: ingredients,
    };

    if (user.idToken) {
      axios
        .post(`${BASE_DB_URL}recipes.json?auth=${user.idToken}`, newRecipe)
        .then((response) => {
          console.log(response.data);
          dispatch(addRecipe(newRecipe));
          titleRef.current.value = "";
          instructionRef.current.value = "";
          cooktimeRef.current.value = "";
          preptimeRef.current.value = "";
          setIngredients([]);
        })
        .catch((error) => {

          console.error("Error adding recipe:", error);
        });
    }
  };

  return (
    <div className="card d-flex justify-content-center align-items-center w-full p-5 m-5">
      <form action="" onSubmit={recipeSubmit}>
        <h3 className="text-center mb-3">Ajouter une recette</h3>
        <div className="d-flex justify-content-center align-items-center flex-column gap-3 ">
          <div className="d-flex justify-content-center flex-column align-items-center">
            <label htmlFor="recipeName" className="mx-2">Nom de la recette: </label>
            <input type="text" ref={titleRef} className="rounded form-control"/>
          </div>
          <div className="d-flex justify-content-center flex-column align-items-center">
            <label htmlFor="instruction" className="mx-2">Instructions: </label>
            <input type="text" ref={instructionRef} className="rounded form-control"/>
          </div>
          <div className="d-flex justify-content-center flex-column align-items-center">
            <label htmlFor="cooktime" className="mx-2">Temps de cuisson: </label>
            <input type="number" ref={cooktimeRef} className="rounded form-control"/>
          </div>
          <div className="d-flex justify-content-center flex-column align-items-center">
            <label htmlFor="preptime" className="mx-2">Temps de préparation: </label>
            <input type="number" ref={preptimeRef} className="rounded form-control"/>
          </div>
          <div className="d-flex justify-content-center flex-column align-items-center">
            <label htmlFor="ingredients" className="mx-2">Ingrédients: </label>
            <input type="text" onChange={handleIngredientChange} className="rounded form-control"/>
          </div>
          <div>
            <button type="submit" className="btn btn-success">Ajouter recette</button>
          </div>
        </div>
      </form>
    </div>
  );
};

export default AddRecipe;

// const myRecipe: Recipe = {
//     id: "123",
//     title: "Delicious Dish",
//     instructions: "Cook it, eat it!",
//     cookTime: 30,
//     prepTime: 15,
//     ingredients: [
//       { id: 1, name: "Ingredient 1" },
//       { id: 2, name: "Ingredient 2" },
//       // Add more ingredients as needed
//     ],
//   };