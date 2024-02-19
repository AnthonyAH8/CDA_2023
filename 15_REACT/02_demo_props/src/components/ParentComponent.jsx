import React from 'react';
import ChildComponent from './ChildComponent';

const ParentComponent = () => {
    let maVariable = 'Toto';

    const sayHelloFromParent = () => {
        console.log('Bonjour from parent !');
    }
    return ( 
        <div>
            <h1>Parent Component</h1>
            <ChildComponent maVariable = {maVariable} sayHelloFromParent={sayHelloFromParent}/>
        </div>
     );
}
 
export default ParentComponent;