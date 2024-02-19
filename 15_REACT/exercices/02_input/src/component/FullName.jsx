import React from 'react';
import { useState } from 'react';

const FullName = () => {

    const [firstname, setFirstname ] = useState('');
    const [lastname, setLastname ] = useState('');

    const addFirstname = (event) => {
        setFirstname(event.target.value)
    };

    const addLastname = (event) => {
        setLastname(event.target.value.toUpperCase())
    };

    return ( 
        <div>
            <h1>Exercice React 2</h1>
            Prénom: <input type="text" name="" id="" onInput={addFirstname}/>
            <br />
            Nom: <input type="text" name="" id="" onInput={addLastname}/>
            <p>Bonjour <strong>{firstname} {lastname}</strong>, bienvenue sur l'application.</p>
        </div>
     );
}
 
export default FullName;