import axios from "axios";
import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import Header from "../shared/Header";
import { Modal, Button } from "react-bootstrap";

const PokemonDetails = () => {
    const [pokemon, setPokemon] = useState(null);
    const { id } = useParams();
    const [showModal, setShowModal] = useState(false);

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

    const handleAddToPokedex = () => {
        setShowModal(true);
    };

    const handleModalClose = () => {
        setShowModal(false);
    };

    const handleConfirmAdd = () => {
        addToPokedex();
        setShowModal(false);
    };

    return (
        <>
            <Header />
            {
                pokemon && (
                    <div className="d-flex w-full align-items-center justify-content-center m-5 gap-5 bg-dark text-white p-3 rounded">
                        <div className="d-flex w-full flex-column border border-success rounded mx-5 p-2">
                            <img src={pokemon.sprites?.shiny} className="rounded p-3" width={600} height={600} />
                            <button className="btn btn-success mx-auto">Ajouter au pokédex</button>
                        </div>
                        <div className="">
                            <p className="d-flex flex-column"><span className="fw-semibold">Nom: </span>{pokemon.name?.fr}</p>
                            <p className="d-flex flex-column"><span className="fw-semibold">XP:</span> {pokemon.stats.hp}</p>
                            <p className="d-flex flex-column"><span className="fw-semibold">Taille:</span> {pokemon.height}</p>
                            <p className="d-flex flex-column"><span className="fw-semibold">Poids:</span> {pokemon.weight}</p>
                            <p className="d-flex flex-column"><span className="fw-semibold">Numéro pokédex:</span> {pokemon.pokedex_id}</p>
                            <div>{pokemon.types.map(p => (<p className="d-flex flex-column"><span className="fw-semibold">Type:</span> {p.name}</p>))}</div>
                            <div>{pokemon.talents.map(p => (<p className="d-flex flex-column"><span className="fw-semibold">Talent:</span> {p.name}</p>))}</div>
                        </div>
                    </div>
                )
            }
        </>
    );
}

export default PokemonDetails;