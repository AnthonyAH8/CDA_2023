import { Link, Outlet } from "react-router-dom";

const Navbar = () => {
    return ( 
        <>
            <nav>
                <Link to={'/'}>Page d'accueil </Link>
                <Link to={'/form'}>Formulaire</Link>
            </nav>
            <div>
                <Outlet/>
            </div>
            <footer>
                Pied de page
            </footer>
        </>
     );
}
 
export default Navbar;