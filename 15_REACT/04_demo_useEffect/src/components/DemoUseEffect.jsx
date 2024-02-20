import React, { useEffect, useState } from 'react';

const DemoUseEffect = () => {
    const [ firstname, setFirstname] = useState('')
    const [ lastname, setLastname] = useState('')
    const [ fullname, setFullname] = useState('')

    const firstnameHandler = (e) => {
        setFirstname(e.target.value)
    }

    const lastnameHandler = (e) => {
        setLastname(e.target.value)
    }

    useEffect(() => {
        console.log('Application lancée !');
    }, [])

    useEffect(() => {
        console.log('Changement état');
        setFullname(firstname + ' ' + lastname)
    }, [firstname, lastname])


    return ( 
        <div>
            <input type="text" value={firstname} onInput={firstnameHandler}/>
            <input type="text" value={lastname} onInput={lastnameHandler}/>
            <p>{fullname}</p>
        </div>
     );
}
 
export default DemoUseEffect;