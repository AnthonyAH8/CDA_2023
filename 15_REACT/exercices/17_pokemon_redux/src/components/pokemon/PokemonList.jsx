import axios from "axios";
import { useEffect, useState } from "react";
import { Link } from "react-router-dom";
import Header from "../shared/Header";

const PokemonList = () => {

    const [PokemonList, setPokemonList] = useState([]);
    const [search, setSearch] = useState('');

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

    const filter = PokemonList.filter(pokemon =>
        pokemon.types.some(type => type.name.toLowerCase().includes(search.toLowerCase()))
    );

    // const filter = PokemonList.filter((pokemon) =>
//     pokemon.types.map(type => type.name.toLowerCase()).includes(search.toLowerCase())

    return (
        <>
            <Header />
            <div className="d-flex flex-wrap flex-column bg-dark text-white">
                <h1 className="text-center my-5">Liste de Pokémons</h1>
                <input type="text"
                    placeholder="Filtrer par type de pokémon"
                    value={search}
                    onChange={(e) => setSearch(e.target.value)}
                    className="mx-5 rounded-pill p-2"
                    />
                <div className="d-flex justify-content-center flex-wrap gap-2">
                    {PokemonList &&
                        filter.map((pokemon) => (
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
        </>
    );
}

export default PokemonList;

