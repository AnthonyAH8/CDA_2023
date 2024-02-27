const Form = () => {

    const setStorage = () => {
        localStorage.setItem('token', 'mon_token')
    }

    return ( 
        <>
            <h2>Page d'authentification</h2>
            <button onClick={setStorage}>Identification</button>
        </>
     );
}
 
export default Form;