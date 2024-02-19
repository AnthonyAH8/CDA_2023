import React from 'react';
import { useState } from 'react';

const FizzBuzz = () => {
    const [ number, setNumber ] = useState(1);

    const FizzBuzzResult = () => {
        if ( number % 15 === 0 && number != 0){
            return'FizzBuzz'
        } else if (number % 3 === 0 && number != 0){
            return'Fizz'
        } else if (number % 5 === 0 && number != 0){
            return'Buzz'
        } else{
            return number
        } 
    }

    const min = 0;
    const max = 20;

    return (
        <div>
            <h1>FizzBuzz</h1>
            <p>Résultat : {FizzBuzzResult()}</p>
            <button onClick={() => setNumber(number - 1)} disabled = {number === min}>-</button>
            <button onClick={() => setNumber(number + 1)} disabled = {number === max}>+</button>
        </div>
      );
}

export default FizzBuzz;