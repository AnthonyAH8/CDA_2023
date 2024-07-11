import React, { useState } from 'react'


function Candidate() {

  const [formData, setFormData] = useState({
    name: "",
    identificationNumber: "",
    address: "",
    phoneNumber: "",
    email: "",
    birthDate: "",
    rating: "",
    observation: "",
    skill: "",
    technicalArea: "",
    jobInterviewDate: ""
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
      const response = await fetch('http://localhost:8080/candidate', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(formData),
      });
      if (response.ok) {
        const data = await response.json();
        setSubmitStatus('Création réussie')
        setFormData({
          name: "",
          identificationNumber: "",
          address: "",
          phoneNumber: "",
          email: "",
          birthDate: "",
          rating: "",
          observation: "",
          skill: "",
          technicalArea: "",
          jobInterviewDate: ""
        })
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
    <div className='container mt-3'>
      <h1>Liste des candidats</h1>
      <form onSubmit={handleSubmit} className='form form-control d-flex flex-column'>
        <div className='my-2'>
          <label htmlFor="name">Nom de l'employé(e) : </label>
          <input type="text" id="name" name='name' className='mx-2' value={formData.name} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="identificationNumber">Numéro identifiant : </label>
          <input type="text" id='identificationNumber' name='identificationNumber' value={formData.identificationNumber} onChange={handleChange} className='mx-2'/>
        </div>
        <div className='my-2'>
          <label htmlFor="address">Adresse : </label>
          <input type="text" id='address' name='address' value={formData.address} onChange={handleChange} className='mx-2'/>
        </div>
        <div className='my-2'>
          <label htmlFor="phoneNumber">Numéro de téléphone : </label>
          <input type="text" id='phoneNumber' name='phoneNumber' value={formData.phoneNumber} onChange={handleChange} className='mx-2'/>
        </div>
        <div className='my-2'>
          <label htmlFor="email">Email : </label>
          <input type="text" name="email" id="email" className='mx-2' value={formData.email} onChange={handleChange}/>
        </div>
        <div className='my-2'>
          <label htmlFor="dateOfBirth">Date de naissance : </label>
          <input type="date" name="dateOfBirth" id="dateOfBirth" className='mx-2' value={formData.dateOfBirth} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="rating">Note : </label>
          <input type="number" name='rating' id='rating' value={formData.rating} onChange={handleChange} className='mx-2'/>
        </div>
        <div className='my-2'>
          <label htmlFor="observation">Observation : </label>
          <input type="text" name="observation" id="observation" className='mx-2' value={formData.observation} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="skill">Skills : </label>
          <input type="text" name="skill" id="skill" className='mx-2' value={formData.skill} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="technicalArea">Secteur : </label>
          <input type="text" name="technicalArea" id="technicalArea" className='mx-2' value={formData.technicalArea} onChange={handleChange} />
        </div>
        <div className='my-2'>
          <label htmlFor="jobInterviewDate">Date d'entretien : </label>
          <input type="date" name="jobInterviewDate" id="jobInterviewDate" className='mx-2' value={formData.jobInterviewDate} onChange={handleChange} />
        </div>
        <button type="submit" className='btn btn-success my-2 mx-2'>Ajouter candidat</button>
        {submitStatus && <p>{submitStatus}</p>}
      </form>
    </div>
  )
}

export default Candidate;