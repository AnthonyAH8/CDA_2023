import React, { useState } from 'react';

function Employee() {
  const [formData, setFormData] = useState({
    name: '',
    identificationNumber: '',
    address: '',
    phoneNumber: '',
    email: '',
    dateOfBirth: '',
    contractStart: '',
    contractEnd: '',
    occupation: '',
    password: '',
    admin: '', 
    salary: '',
    observation: ''
  });

  const [submitStatus, setSubmitStatus] = useState(null);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await fetch('http://localhost:8080/employees', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(formData),
      });

      if (response.ok) {
        const data = await response.json();
        setSubmitStatus('Création réussie!');
        setFormData({
          name: '',
          identificationNumber: '',
          address: '',
          phoneNumber: '',
          email: '',
          dateOfBirth: '',
          contractStart: '',
          contractEnd: '',
          occupation: '',
          password: '',
          admin: '',
          salary: '',
          observation: ''
        });
      } else {
        console.error('Erreur');
        setSubmitStatus('Erreur dans la connexion.');
      }
    } catch (error) {
      console.error('Erreur:', error);
      setSubmitStatus('Erreur.');
    }
  };

  return (
    <div className='container'>
      <h1>Liste des employés</h1>

      <form onSubmit={handleSubmit} className='form form-control d-flex flex-column' method='post'>
        <div className='my-2'>
          <label htmlFor="name">Nom de l'employé(e) : </label>
          <input type="text" id="name" name='name' className='mx-2' value={formData.name} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="identificationNumber">Numéro identifiant :</label>
          <input type="text" name="identificationNumber" id="identificationNumber" className='mx-2' value={formData.identificationNumber} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="address">Adresse : </label>
          <input type="text" name="address" id="address" className='mx-2' value={formData.address} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="phoneNumber">Numéro de téléphone :</label>
          <input type="text" name="phoneNumber" id="phoneNumber" className='mx-2' value={formData.phoneNumber} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="email">Email : </label>
          <input type="text" name="email" id="email" className='mx-2' value={formData.email} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="dateOfBirth">Date de naissance : </label>
          <input type="date" name="dateOfBirth" id="dateOfBirth" className='mx-2' value={formData.dateOfBirth} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="contractStart">Date de début de contrat : </label>
          <input type="date" name="contractStart" id="contractStart" className='mx-2' value={formData.contractStart} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="contractEnd">Date de fin de contrat : </label>
          <input type="date" name="contractEnd" id="contractEnd" className='mx-2' value={formData.contractEnd} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="occupation">Occupation : </label>
          <input type="text" name="occupation" id="occupation" className='mx-2' value={formData.occupation} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="password">Mot de passe : </label>
          <input type='password' name="password" id="password" className='mx-2' value={formData.password} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <fieldset>
            <legend>Rôle admin:</legend>
            <input type="radio" name="admin" id="yes" value="yes" checked={formData.admin === 'yes'} onChange={handleChange} />
            <label htmlFor="yes">Oui</label>
            <input type="radio" name="admin" id="no" value="no" checked={formData.admin === 'no'} onChange={handleChange} />
            <label htmlFor="no">Non</label>
          </fieldset>
        </div>
        <div className='my-2'>
          <label htmlFor="salary">Salaire : </label>
          <input type="number" name="salary" id="salary" step='0.01' min="0"  className='mx-2' value={formData.salary} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="observation">Observation : </label>
          <input type="text" name="observation" id="observation" className='mx-2' value={formData.observation} onChange={handleChange} />
        </div>
        <button type="submit" className='btn btn-success my-2 mx-2'>Ajouter Employé</button>
        {submitStatus && <p>{submitStatus}</p>}
      </form>
    </div>
  );
}

export default Employee;
