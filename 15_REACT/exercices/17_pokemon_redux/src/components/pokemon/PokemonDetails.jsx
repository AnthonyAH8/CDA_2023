import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import Header from "../shared/Header";

const PokemonDetails = () => {
    const [pokemon, setPokemon] = useState(null);
    const { id } = useParams();

    useEffect(() => {
        axios.get(`https://tyradex.vercel.app/api/v1/pokemon/${id}`)
            .then(response => {
                setPokemon(response.data);
                // console.log(response.data);
            })
            .catch(error => {
                console.error(error);
            });
    }, [id]);

    return (
        <>
        <Header/>
            {
                pokemon && (
                    <div className="d-flex w-full justify-content-around align-items-center mt-5">
                        <div>
                            <img src={pokemon.sprites?.shiny} className="rounded align-items-center" width={500} height={500} />
                        </div>
                        <div>

                            <p className="text-center mt-2 fw-semibold">Nom: {pokemon.name?.fr}</p>
                            <p className="text-center fw-semibold">Numéro pokédex: {pokemon.pokedex_id}</p>
                            <p className="text-center fw-semibold">XP: {pokemon.stats.hp}</p>
                            <p className="text-center fw-semibold">Taille: {pokemon.height}</p>
                            <p className="text-center fw-semibold">Poids: {pokemon.weight}</p>
                            <div>
                                {
                                    pokemon.types.map(p => (
                                        <p>Type: {p.name}</p>
                                    ))
                                }
                            </div>
                            <div>
                                {
                                    pokemon.talents.map(p => (
                                        <p className="">Talent: {p.name}</p>
                                    ))
                                }
                            </div>
                        </div>
                    </div>
                )
            }
        </>
    );
}

export default PokemonDetails;