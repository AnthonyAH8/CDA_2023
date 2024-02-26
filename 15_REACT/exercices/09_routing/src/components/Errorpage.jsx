import { useRouteError, Link } from 'react-router-dom'

const Errorpage = () => {
    const error = useRouteError()
    return ( 
    <>
    <div>
        <Link to={'/'}>Page d'accueil</Link>
    </div>
        <img src="./vqo9n.jpg" alt="" className='rounded my-2'/>
        <h2 className='fw-lighter'>Cette page n'est pas disponible</h2>
        <p className='fw-bold'>Raison : {error.data}</p>
    </> 
    );
}
 
export default Errorpage;