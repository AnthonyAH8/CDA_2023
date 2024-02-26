import { Link, Outlet } from "react-router-dom";

const Navbar = () => {
    return ( 
        <>
            <nav className="navbar bg-dark p-2 rounded my-2">
                <Link to={'/'}>Page d'accueil </Link>
                <Link to={'/about'}>Description </Link>
                <Link to={'/form'}>Formulaire </Link>
            </nav>
            <div>
                <Outlet/>
            </div>
        </>
     );
}
 
export default Navbar;