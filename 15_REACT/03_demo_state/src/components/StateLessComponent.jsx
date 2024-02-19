import React from 'react';
import { useState } from 'react';

const StateLessComponent = () => {
    const [monPrenom, setMonPrenom ] = useState('Toto')
    const [text, setText ] = useState('')

    const changePrenom = () => {
        setMonPrenom('Titi')
    }

    const textInputHandler = (event) => {
        setText(event.target.value)
        console.log(text);
    }
    return ( 
        <div>
                <h1>StateLess Component</h1>
                <p>Mon prénom: {monPrenom}</p>
                <input type="text" value={text} onInput={textInputHandler}/>
                <button onClick={changePrenom}>Changer prénom</button>
            </div>
     );
}
 
export default StateLessComponent;
 