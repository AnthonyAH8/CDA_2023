import { useRef } from 'react';
import { useDispatch } from 'react-redux'
import { createAlbum, fetchAlbums } from './AlbumSlice';
import axios from "axios";
import {BASE_DB_URL} from '../../firebaseConfig'

const AddAlbumForm = () => {

    const dispatch = useDispatch();
    const token = localStorage.getItem('token')

    const titleRef = useRef();
    const releaseDateRef = useRef();
    const artistRef = useRef();
    const scoreRef = useRef();
    const coverURLRef = useRef();

    const submitNewAlbum = async (e) => {
        e.preventDefault();
        
        const newAlbum = {
            title: titleRef.current.value,
            releaseDate: releaseDateRef.current.value,
            artist: artistRef.current.value,
            score: +scoreRef.current.value,
            coverURL: coverURLRef.current.value,
        }

        axios.post(`${BASE_DB_URL}/eAlbums.json?auth=${token}`, newAlbum).then(response => {
            dispatch(createAlbum({id: response.data.name, ...newAlbum}))
            dispatch(fetchAlbums(""))
            console.log(response.data);
        })
    }
    return ( 
        <>
            <h2 className='text-center p-5'>Ajouter un album</h2>

            <form onSubmit={submitNewAlbum} className='grid justify-center items-center text-center my-4 bg-gray-500 p-4'>
                <div className='rounded w-full py-2 px-3 flex flex-col text-gray-700 items-start'>
                    <label htmlFor="title" className='py-2 text-white'>Nom de l'album :</label>
                    <input type="text" required ref={titleRef} className='p-2 shadow rounded'/>
                </div>
                <div className='rounded w-full py-2 px-3 text-gray-700 flex flex-col items-start'>
                    <label htmlFor="releaseDate" className='py-2 text-white'>Date de sortie :</label>
                    <input type="date" required ref={releaseDateRef} className='p-2 shadow rounded'/>
                </div>
                <div className='appearance-none rounded w-full py-2 px-3 text-gray-700 flex flex-col items-start'>
                    <label htmlFor="artist" className='py-2 text-white'>Artiste(s)</label>
                    <input type="text" ref={artistRef} className='p-2 shadow rounded'/>
                </div>
                <div className='appearance-none rounded w-full py-2 px-3 text-gray-700 flex flex-col items-start'>
                    <label htmlFor="score" className='py-2 text-white'>Notation de l'album (&#9734;) :</label>
                    <input type="number" ref={scoreRef} className='p-2 shadow rounded' min={1} max={5}/>
                </div>
                <div className='appearance-none rounded w-full py-2 px-3 text-gray-700 flex flex-col items-start'>
                    <label htmlFor="cover" className='py-2 text-white'>Image:</label>
                    <input type="text"  ref={coverURLRef} className='p-2 shadow rounded'/>
                </div>
                <div>
                    <button className="bg-cyan-500 rounded px-5 text-gray-50">Ajouter Album</button>
                </div>
            </form>
        </>
     );
}
 
export default AddAlbumForm;
