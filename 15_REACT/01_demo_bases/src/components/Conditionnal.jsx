import React from 'react';

const Conditionnal = () => {
    let age = 18
    let firstname = 'Anthony'

    if (age >= 18) {
        return (
            <>
                <p>Bonjour, {firstname}!</p>
            </>
        );
    } else {
        return (
            <p>Bonjour, j'ai moins de 18 ans...</p>
        )
    }
}
export default Conditionnal;