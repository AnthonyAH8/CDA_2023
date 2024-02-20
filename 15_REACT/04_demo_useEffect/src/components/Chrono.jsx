import React, { useEffect, useState } from 'react';

const Chrono = () => {
    const [chrono , setChrono] = useState(0);

    useEffect(() =>{
        let timer = setInterval(() => {
            setChrono(chrono + 1)
        }, 1000)
    })
    return ( 
        <div>
            <p>{chrono}</p>
        </div>
     );
}
 
export default Chrono;