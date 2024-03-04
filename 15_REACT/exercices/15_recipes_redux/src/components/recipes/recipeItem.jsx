import { useState } from "react"
import { useDispatch } from "react-redux"

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
        //  A finir // 
    }


    return (
        <>

        </>
    );
}

export default RecipeItem;