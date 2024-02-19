import React from 'react';
import classes from './FirstComponent.module.css';
import img from '../assets/images/800px-Caninos-RFVF.png'
import TableRow from './TableRow';
import PersonsTable from './PersonsTable';

const FirstComponent = () => {
    let maVariable = "Jean";
    let pokemon = 'Caninos';
    let age = 24;
    const maFonction = () => {
        return `Bonjour ${pokemon}.`
    }
    return (  
        <div>
            <h1 className={classes.paragrapheRouge}>Mon premier composant.</h1>
            <p>Bonjour, je m'appelle {maVariable} et j'ai {age} ans.</p>
            <p>{maFonction()}</p>
            <img src={img} alt="caninos" className={classes.caninos}/>
            <table>
                <thead>
                    <tr>
                        <th>A</th>
                        <th>B</th>
                        <th>C</th>
                    </tr>
                </thead>
                <tbody>
                    <TableRow/>
                    <TableRow/>
                    <TableRow/>
                </tbody>
            </table>
            <PersonsTable/>
        </div>
    );
}
 
export default FirstComponent;