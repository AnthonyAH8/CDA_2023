import { useRef } from "react";

const Login = ({onLogin}) => {

    const usernameRef = useRef();
    const passwordRef = useRef();


    const handleLogin = () => {
        const username = usernameRef.current.value;
        const password = passwordRef.current.value;
        onLogin(username, password);
    }

    return ( 
        <>
            <label htmlFor="username"> Pseudo : </label>
            <input type="text" ref={usernameRef}/>
            <label htmlFor="password"> Mot de passe : </label>
            <input type="password" ref={passwordRef}/>
            <button onClick={handleLogin}>Se connecter</button>
        </>
     );
}
 
export default Login;