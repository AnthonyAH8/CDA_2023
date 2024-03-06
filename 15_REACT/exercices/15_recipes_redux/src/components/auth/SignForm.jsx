import { useRef } from "react";
import { useSelector, useDispatch } from "react-redux";
import { SIGN_IN_URL, SIGN_UP_URL } from '../../firebaseConfig';
import { setAuthMode, setUser } from "./authSlice";
import axios from "axios"

const SignForm = () => {

    const authMode = useSelector(state => state.auth.authMode)
    const dispatch = useDispatch()

    const emailRef = useRef()
    const passwordRef = useRef()

    const submitForm = (e) => {
        e.preventDefault()
        const URL = authMode === 'Se Connecter' ? SIGN_IN_URL : SIGN_UP_URL

        const credentials = {
            email: emailRef.current.value,
            password: passwordRef.current.value,
            returnSecureToken: true
        }

        axios.post(URL, credentials).then((response) => {
            localStorage.setItem("token", response.data.idToken)
            dispatch(setUser(response.data))
            dispatch(setAuthMode(""))
        })
    }
    return (
        <div className="card d-flex justify-content-center align-items-center w-full p-5 mx-5">
            <h2 className="text-center mb-3">{authMode}</h2>
            <div className="d-flex justify-content-center flex-column align-items-center">
                <form onSubmit={submitForm}>
                    <div className="d-flex justify-content-center flex-column align-items-center mb-3">
                        <label htmlFor="email">Adresse mail: </label>
                        <input type="text" ref={emailRef} className="rounded form-control" />
                    </div>
                    <div className="d-flex justify-content-center flex-column align-items-center mb-3">
                        <label htmlFor="password">Mot de passe: </label>
                        <input type="password" ref={passwordRef} className="rounded form-control border-teal-600" />
                    </div>
                    <button className="btn btn-warning">{authMode}</button>
                </form>
            </div>
            <button onClick={() => dispatch(setAuthMode(authMode === 'Se Connecter' ? "S'inscrire" : "Se Connecter"))} className="btn btn-primary">{authMode === 'Se Connecter' ? "S'inscrire" : "Se Connecter"}</button>
        </div>
    );
}

export default SignForm;