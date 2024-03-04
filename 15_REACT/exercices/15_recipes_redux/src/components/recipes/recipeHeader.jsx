import { useState } from "react";
import Modal from "../../components/modal/Modal";


const RecipeHeader = () => {

    const [sign, setSign] = useState([])
    const [isOpen, setIsOpen] = useState(false)
    return ( 
        <header className="navbar bg-secondary d-flex justify-content-between w-full px-5 align-items-center text-white mb-3">
            <span className="">&copy; eRecipe</span>
            <button onClick={() => setIsOpen(!isOpen)}> SignIn</button>
            {isOpen && <Modal sign={sign} setSign={setSign}/>}
        </header>
     );
}
 
export default RecipeHeader;