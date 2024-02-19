import React from 'react';

const ChildComponent = (props) => {
    // let maVariable = props.maVariable;
    // let sayHelloFromParent = props.sayHelloFromParent;

    let {maVariable, sayHelloFromParent} = props;
    
    const sayHello = () => {
        console.log("Bonjour");
        sayHelloFromParent();
    }

    return ( 
        <div>
            <h1>Child Component</h1>
            <p>Ma variable : {maVariable}</p>
            <button onClick={sayHello}>Cliquez ici !</button>
            
        </div>
     );
}
 
export default ChildComponent;