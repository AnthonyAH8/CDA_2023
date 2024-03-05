import { useDispatch, useSelector } from "react-redux";
import RecipeItem from "./recipeItem";
import axios from "axios";
import { useEffect, useState } from "react";
import { BASE_DB_URL } from "../../firebaseConfig";

const RecipeList = () => {
    const [recipes, setRecipes] = useState([]);
    const dispatch = useDispatch();

    useEffect(() => {
        axios.get(`${BASE_DB_URL}/recipes.json`)
            .then(response => {
                setRecipes(response.data);
                console.log(response.data);
                
                dispatch(RecipeList(response.data));
            })
    }, []);

    return ( 
        <>
            <div>
                {recipes.map((recipe, index) => (
                    <RecipeItem recipe={recipe} key={index}/>
                ))}
            </div>
        </>
     );
}

export default RecipeList;

