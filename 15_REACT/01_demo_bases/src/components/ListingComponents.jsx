import React from 'react';

const ListingComponents = () => {
    const maListe = ['Toto', 'Titi', 'Tata'];
    return (
        <div>
            <h1>Liste des composants</h1>
            <hr />
            <ul>
                {
                    maListe.map((prenom, index) => <li key={index}>{prenom}</li>)
                }
            </ul>
        </div>
    );
}

export default ListingComponents;