
import { useDispatch, useSelector } from "react-redux";
import { setAuthMode, setUser } from "./authSlice";
import { useRef } from "react";
import { SIGN_IN_URL, SIGN_UP_URL } from "../../firebaseConfig";
import axios from "axios"


const SignForm = () => {
    const authMode = useSelector(state => state.auth.authMode)
    const dispatch = useDispatch()

    const emailRef = useRef()
    const passwordRef = useRef()

    const submitFormHandler = async (event) => {
        event.preventDefault()

        const email = emailRef.current.value
        const password = passwordRef.current.value

        const credentials = {
            email,
            password,
            returnSecureToken: true
        }

        const URL = authMode === "Se connecter" ? SIGN_IN_URL : SIGN_UP_URL

        axios.post(URL, credentials).then(response => {

        localStorage.setItem("token", response.data.idToken)
        dispatch(setUser(response.data))
        dispatch(setAuthMode(""))
        })
    }

    return ( 
        <div className="grid justify-center items-center w-full text-center my-2">
           <h3 className="text-center">{authMode}</h3>
            <hr />
            <form onSubmit={submitFormHandler}>
                <div>
                    <label htmlFor="email">Email: </label>
                    <input type="email" id="email"  ref={emailRef} className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mb-2"/>
                </div>
                <div>
                    <label htmlFor="password">Password: </label>
                    <input type="password" id="password" ref={passwordRef} className="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline mb-2"/>
                </div>
                <button>{authMode}</button>
            </form>
            <button 
                onClick={() => dispatch(setAuthMode(authMode === "Se connecter" ? "S'inscrire" : "Se connecter"))}>
                    {authMode === "Se connecter" ? "S'inscrire" : "Se connecter"}
            </button>
        </div>
     );
}
 
export default SignForm;