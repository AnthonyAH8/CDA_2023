import { useRef, useState } from "react"
import { useDispatch } from "react-redux"
import { deleteRecipe, updateRecipe } from "./recipeSlice" 

const RecipeItem = (props) => {

    const dispatch = useDispatch()
    const recipe = props.recipe
    const [update, setUpdate] = useState(false)
    const titleRef = useRef()
    const instructionRef = useRef();
    const cooktimeRef = useRef();
    const preptimeRef = useRef();
    const [ingredients, setIngredients] = useState([]);

    const updateRecipe = () => {
        const newTitle = titleRef.current.value
        const newInstruction = instructionRef.current.value
        const newCooktime = cooktimeRef.current.value
        const newPreptime = preptimeRef.current.value
        const newIngredients = ingredients

        const updatedRecipe = {

            id: recipe.id,
            title: newTitle,
            instruction: newInstruction,
            cooktime: newCooktime,
            preptime: newPreptime,
            ingredients: newIngredients
        }

        dispatch(updateRecipe(updatedRecipe))
        setUpdate(!update)

    }


    return (
        <>
            {
                update ?
                <div>
                    <input type="text" className="form-control" ref={titleRef} defaultValue={recipe.title}/>
                </div>
                :
                <div>

                </div>
            }
        </>
    );
}

export default RecipeItem;