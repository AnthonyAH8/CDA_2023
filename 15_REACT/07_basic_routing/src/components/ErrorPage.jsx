import { Link, useRouteError } from "react-router-dom";

const ErrorPage = () => {
    const error = useRouteError()
    return ( 
        <>
            <h1>Erreur : {error.status}</h1>
            <p>{error.data}</p>
            <Link to={'/'}>Page d'accueil </Link>
        </>
     );
}
 
export default ErrorPage;