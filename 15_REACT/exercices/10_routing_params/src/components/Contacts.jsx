import { useParams, useSearchParams } from "react-router-dom";

const Contacts = () => {

    const { params } = useParams()
    const [contactParams, setContactParams] = useSearchParams()

    const mode = contactParams.get('mode') ?? 'default'
    return (
        <>
            <h2>Formulaire d'inscription</h2>
            <div className='d-flex flex-column gap-2'>

                <label htmlFor="lastname">Nom: </label>
                <input type="text" />

                <label htmlFor="firstname">Prénom: </label>
                <input type="text" />

                <label htmlFor="email">Mail: </label>
                <input type="text" />

                <label htmlFor="phone">Numéro de téléphone: </label>
                <input type="text" />

                <button className="my-3 rounded btn btn-success">S'inscrire</button>
            </div>
        </>
    );
}

export default Contacts;