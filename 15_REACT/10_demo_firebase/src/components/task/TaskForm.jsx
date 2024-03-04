import { useRef } from "react";
import { useDispatch, useSelector } from "react-redux";
import axios from "axios"
import { BASE_DB_URL } from "../../firebaseConfig";
import { addTask } from "./TaskSlice";


const TaskForm = () => {

    const textRef = useRef()
    const user = useSelector(state => state.auth.user)
    const dispatch = useDispatch()

    const handleSubmit = (e) =>{
        e.preventDefault()

        const newTask = {
            id: Date.now(),
            text: textRef.current.value,
            done: false,

        }

        if (user.idToken) {
            axios.post(`${BASE_DB_URL}todolist.json?auth=${user.idToken}`, newTask)
            .then((response) =>{
                console.log(response.data)
                dispatch(addTask(newTask))
            })
        }
    }
    return ( 
        <>
    <form action="" onSubmit={handleSubmit}>
        <input type="text" ref={textRef}/>
    </form>
        </>
     );
}
 
export default TaskForm;