import { useRouteError, Link } from 'react-router-dom'

const Errorpage = () => {
    const error = useRouteError()
    return ( 
    <>
    <div>
        <Link to={'/'}>Page d'accueil</Link>
    </div>
        <img src="./vqo9n.jpg" alt="" className='rounded mb-2'/>
        <h2>Cette page n'est pas disponible</h2>
        <p className='fs-bold'>Raison : {error.data}</p>
    </> 
    );
}
 
export default Errorpage;