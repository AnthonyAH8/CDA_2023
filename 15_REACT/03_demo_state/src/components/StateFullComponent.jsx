import React from 'react';
import { PureComponent } from 'react';

class StateFullComponent extends PureComponent {
    constructor(props) {
        super(props);
        this.state = { 
            monPrenom : 'Toto'
         }
    }
    changePrenom(){
        this.setState(previousState => ({...previousState, monPrenom: 'Titi'}))
    }
    render() { 
        return ( 
            <div>
                <h1>StateFull Component</h1>
                <p>Mon prénom: {this.state.monPrenom}</p>
                <button onClick={this.changePrenom.bind(this)}>Changer prénom</button>
            </div>
         );
    }
}
 
export default StateFullComponent;