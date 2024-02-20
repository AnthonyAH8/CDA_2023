import React from 'react';
import { useEffect } from 'react';
import { useState } from 'react';


const Multiplication = (props) => {

    const [numberA, setNumberA] = useState(0);
    const [numberB, setNumberB] = useState(0);
    const [product, setProduct] = useState(false);

    const{answer} = props;

    const firstNumber = (e) => {
        setNumberA(e.target.value);
    }

    const secondNumber = (e) => {
        setNumberB(e.target.value);
    }

    useEffect(() => {
        setProduct(numberA * numberB === answer);
    }, [numberA, numberB, answer]);

    return ( 
        <div>
            <input type="number" value={numberA} onInput={firstNumber} />
            <input type="number" value={numberB} onInput={secondNumber}/>
            <p>{product? `La multiplication des deux nombres fait bien ${answer}`: `La multiplication des deux nombres ne fait pas ${answer}`}</p>
        </div>
     );
}
 
export default Multiplication;