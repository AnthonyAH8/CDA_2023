import React, { useState, useEffect } from 'react';
import axios from 'axios';

const MoviesList = () => {
    const [movies, setMovies] = useState([]);
    const [searchTerm, setSearchTerm] = useState('');

    useEffect(() => {
        const fetchMovies = async () => {
            try {
                const response = await axios.get('mongodb://localhost:27017/api-movies');
                setMovies(response.data);
            } catch (error) {
                console.error('Erreur lors du chargement des films', error);
            }
        };

        fetchMovies();
    }, []);

    const deleteMovie = async (id) => {
        try {
            await axios.delete(`http://localhost:3001/api/movies/${id}`);
            setMovies(movies.filter((movie) => movie._id !== id));
        } catch (error) {
            console.error('Erreur lors de la suppression du film', error);
        }
    };

    const searchMovies = async () => {
        try {
            const response = await axios.get(`mongodb://localhost:27017/api-movies`);
            setMovies(response.data);
        } catch (error) {
            console.error('Erreur lors de la recherche des films', error);
        }
    };

    return (
        <div className="d-flex flex-wrap flex-column justify-content-center">
            <h1 className='text-center mb-5'>Liste des films</h1>
            <div className='d-flex flex-row justify-content-center align-items-center w-full gap-2'>
                {movies.map((movie) => (
                    <div key={movie._id}
                    >
                        <h3>Titre du film: {movie.title}</h3>
                        <p>Description du film: {movie.description}</p>
                        <p>Réalisateur: {movie.director}</p>
                        <p>Date de sortie: {movie.releaseDate}</p>
                        <button onClick={() => deleteMovie(movie._id)}>Supprimer</button>
                    </div>
                ))}
                <input
                    type="text"
                    placeholder="Rechercher par titre"
                    value={searchTerm}
                    onChange={(e) => setSearchTerm(e.target.value)}
                    className='rounded'
                />
                <button onClick={searchMovies} className='rounded btn btn-success'>Rechercher</button>
            </div>
        </div>
    );
};

export default MoviesList;