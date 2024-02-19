
import React, { useState } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';

const PersonsTable = () => {
    const [persons, setPersons] = useState([
        {
            id: 1,
            firstname: 'Titi',
            lastname: 'Dupont'
        },
        {
            id: 2,
            firstname: 'Toto',
            lastname: 'Durant'
        },
        {
            id: 3,
            firstname: 'John',
            lastname: 'Doe'
        },
        {
            id: 4,
            firstname: 'Jane',
            lastname: 'Doe'
        }
    ]);

    const addPerson = () => {
        const newPerson = {
            id: 5,
            firstname: 'Kylian',
            lastname: 'Mbappé'
        };
        setPersons([...persons, newPerson]);
    };

    return (
        <div>
            <h1>Personnes</h1>
            <hr />
            <table className='table table-striped table-dark'>
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Prénom</th>
                        <th>Nom</th>
                    </tr>
                </thead>
                <tbody>
                    {
                        persons.map((person, index) => (
                            <tr key={index}>
                                <td>{person.id}</td>
                                <td>{person.firstname}</td>
                                <td>{person.lastname}</td>
                            </tr>
                        ))
                    }
                </tbody>
            </table>
            <button onClick={addPerson}>Ajouter une nouvelle personne</button>
        </div>
    );
}

export default PersonsTable;