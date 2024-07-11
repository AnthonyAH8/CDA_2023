import React, { useEffect, useState } from 'react'
import axios from 'axios'


function EmployeeList() {

    const [employeeList, setEmployeeList] = useState([])
    const [data, setData] = useState()
    

    useEffect(() => {
        axios.get("http://localhost:8080/rh/employees")
        .then((response) => {
            setData(response.data)
        })
        .catch(error => console.log(error))
    }, [data])

  return (
    <div className='container'>
        <h1>Liste des employés</h1>
        {
            employeeList.length === 0 ? (
            <p>Aucun employé trouvé</p> )
            :
            <ul>
                {
                    employeeList.map(employee =>(
                        <li key={employee.id}>
                            <p>Nom de l'employé : {employee.name}</p>
                            <p>Numéro identifiant employé : {employee.identificationNumber}</p>
                            <p>Adresse : {employee.address}</p>
                            <p>Numéro de téléphone : {employee.phoneNumber}</p>
                            <p>Email : {employee.email}</p>
                            <p>Date de naissance : {employee.dateOfbirth}</p>
                            <p>Date de commencement : {employee.contractStart}</p>
                            <p>Date de fin de contrat : {employee.contractEnd}</p>
                            <p>Poste : {employee.occupation}</p>
                            <p>Rôle : {employee.admin}</p>
                            <p>Salaire : {employee.salary}</p>
                            <p>Observation : {employee.observation}</p>
                        </li>
                    ))
                }
            </ul>
        }
    </div>
  )
}

export default EmployeeList