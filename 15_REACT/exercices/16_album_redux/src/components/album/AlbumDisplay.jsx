import { useState, useEffect } from "react";
import { useDispatch, useSelector } from "react-redux";
import axios from "axios";

const AlbumDisplay = () => {
    const [albums, setAlbums] = useState([]);
    // const dispatch = useDispatch();
    // const user = useSelector(state => state.auth.user);
    // const token = localStorage.getItem('token')

    useEffect(() => {
        axios.get(`https://m2i-cda-c0875-default-rtdb.europe-west1.firebasedatabase.app/eAlbum`)
            .then(response => {
                if (Array.isArray(response.data)) {
                    setAlbums(response.data);
                    console.log(response.data);
                }
            })
            .catch(error => {
                console.log(error);
            });
    }, []);

    return (
        <div className="grid justify-center items-center text-center my-4 border">
            <h3>Liste des albums</h3>
            <div>
                {albums.map((album, key) => (
                    <div key={key}>
                        {album.title && <p>Title: {album.title}</p>}
                        {album.releaseDate && <p>Release Date: {album.releaseDate}</p>}
                        {album.artist && <p>Artist: {album.artist}</p>}
                        {album.score && <p>Score: {album.score}</p>}
                        {album.coverURL && <img src={album.coverURL} alt={`${album.titre}`} />}
                    </div>
                ))}
            </div>
        </div>
    );
};

export default AlbumDisplay;
