import axios from "axios";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

const PokemonList = () => {

    const [PokemonList, setPokemonList] = useState([]);

    useEffect(() => {
        const Pokemons = async () => {
            try {
                const response = await axios('https://tyradex.vercel.app/api/v1/gen/1');

                setPokemonList(response.data);
            } catch (error) {
                console.error(error);
            }
        };
        Pokemons();
    }, [])

    return (
        <div className="d-flex flex-wrap flex-column bg-body-tertiary">
            <h1 className="text-center my-5">Liste de Pokémons</h1>
            <div className="d-flex justify-content-center flex-wrap gap-2">
                {
                    PokemonList.map((pokemon) => (
                        <Link to={`${pokemon.pokedex_id}`} className="text-decoration-none" key={pokemon.key}>
                            <div className="d-flex text-center card align-items-center p-3 border border-success my-3 border-opacity-75 text-success">
                                <img src={pokemon.sprites.regular} className="rounded align-items-center" width={200} height={200} />
                                <p className="text-center mt-2 fw-semibold">{pokemon.name.fr}</p>
                                <p className="text-center fw-bold">{pokemon.pokedex_id}</p>
                            </div>
                        </Link>
                    ))
                }
            </div>
        </div>
    );
}

export default PokemonList;
