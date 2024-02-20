import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';

const Tablecontacts = (props) => {
    const [contacts, setContacts] = useState([
        {
            firstname: 'Titi',
            lastname: 'Dupont',
            email: 'titi.dupont@gmail.com'
        }
    ]);


    return (
        <>
            <h1>Liste des contacts</h1>
            <table className='table table-striped table-dark'>
                <thead>
                    <tr>
                        <th>Prénom</th>
                        <th>Nom</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    {contacts.map((contact, index) => (
                        <tr key={index}>
                            <td>{contact.firstname}</td>
                            <td>{contact.lastname}</td>
                            <td>{contact.email}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </>
    );
}

export default Tablecontacts;

