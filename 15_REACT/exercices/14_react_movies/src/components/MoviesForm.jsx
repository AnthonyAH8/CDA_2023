import React, { useState } from 'react';
import axios from 'axios';

const MoviesForm = () => {
  const [formData, setFormData] = useState({
    title: '',
    description: '',
    director: '',
    releaseDate: '',
  });

  const handleChange = (e) => {
    setFormData({
      ...formData,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await axios.post('mongodb://localhost:27017', formData);
      setFormData({
        title: '',
        description: '',
        director: '',
        releaseDate: '',
      });
    } catch (error) {
      console.error('Erreur lors de la création/modification du film', error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <label>
        Titre:
        <input type="text" name="title" value={formData.title} onChange={handleChange} />
      </label>

      <label>
        Description:
        <textarea name="description" value={formData.description} onChange={handleChange} />
      </label>

      <label>
        Réalisateur:
        <input type="text" name="director" value={formData.director} onChange={handleChange} />
      </label>

      <label>
        Date de sortie:
        <input type="text" name="releaseDate" value={formData.releaseDate} onChange={handleChange} />
      </label>

      <button type="submit">Soumettre</button>
    </form>
  );
};

export default MoviesForm;