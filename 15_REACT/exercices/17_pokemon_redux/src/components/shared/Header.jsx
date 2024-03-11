import { Link } from "react-router-dom";

const Header = () => {
    return (
        <div className="d-flex justify-content-around w-auto align-items-center my-2">
            <Link to={'/'}>
                <img src="https://upload.wikimedia.org/wikipedia/commons/9/98/International_Pok%C3%A9mon_logo.svg" alt="logo_pokemon" width={200} />
            </Link>
            <a href="https://www.pokemon.com/fr/" className="text-decoration-none text-black">Home</a>
            <div className="d-flex align-items-center align-center flex-column">
                <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Pokebola-pokeball-png-0.png/769px-Pokebola-pokeball-png-0.png" alt="" width={30} />
                <p>Mon Pokédex</p>
            </div>
            <div className="d-flex align-items-center align-center gap-2">
                <button className="btn btn-primary">Clear</button>
                <button className="btn btn-danger">Show</button>
            </div>
        </div>
    );
}

export default Header;