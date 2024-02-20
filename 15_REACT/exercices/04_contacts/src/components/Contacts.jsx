import React, { useEffect, useState } from 'react';

const Contacts = (props) => {

    const [firstname, setFirstname] = useState('');
    const [lastname, setLastname] = useState('');
    const [email, setEmail] = useState('');
    const [newContact, setNewContact] = useState([]);

    const { addContact } = props;

    const addFirstname = (e) => {
        setFirstname(e.target.value);
    }

    const addLastname = (e) => {
        setLastname(e.target.value);
    }

    const addEmail = (e) => {
        setEmail(e.target.value)
    }

    const addNewContact = () => {
        const contactNew = {
            firstname,
            lastname,
            email
        };
        setNewContact(contactNew); 
    }

    useEffect(() => {
        setNewContact(firstname, lastname, email)
    }, [firstname, lastname, email])

    return (
        <>
            <h1>Formulaire d'inscription</h1>
            <form>
                Prénom: <input type="text" value={firstname} onInput={addFirstname} /><br />
                Nom de famille: <input type="text" value={lastname} onInput={addLastname} /><br />
                Email: <input type="text" value={email} onInput={addEmail} /><br />
                <button type='button' onClick={addNewContact}>Valider l'inscription</button>
            </form>
        </>
    );
}

export default Contacts;