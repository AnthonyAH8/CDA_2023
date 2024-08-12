import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'
import authService from '../services/authService';

export default function Register() {

    const navigate = useNavigate();
    const [data, setData] = useState({
      username: "",
      email: "",
      password: "",
      roles: "ROLE_USER"
    });

    const change = (e) => {
      const { name, value } = e.target;
      setData(previousState => ({
        ...previousState,
        [name]: value
      }));
    };

    const submit = async (e) => {
      e.preventDefault();
      try {
        const { username, email, password, roles } = data;
        await authService.register(username, email, password, roles);
        navigate("/login");
      } catch (err) {
        console.log(err);
      }
    }

  return (
    <div className="container mt-5">
      <h2>Inscription</h2>
      <form onSubmit={submit}>
        <div className="mb-3">
          <label htmlFor="username" className="form-label">Nom</label>
          <input
            type="text"
            className="form-control"
            id="username"
            name="username"
            value={data.username}
            onChange={change}
            required
          />
        </div>
        <div className="mb-3">
          <label htmlFor="email" className="form-label">Email</label>
          <input
            type="email"
            className="form-control"
            id="email"
            name="email"
            value={data.email}
            onChange={change}
            required
          />
        </div>
        <div className="mb-3">
          <label htmlFor="password" className="form-label">Mot de passe</label>
          <input
            type="password"
            className="form-control"
            id="password"
            name="password"
            value={data.password}
            onChange={change}
            required
          />
        </div>
        <div className="mb-3">
          <label htmlFor="roles" className="form-label">Rôle</label>
          <select
            className="form-control"
            id="roles"
            name="roles"
            value={data.roles}
            onChange={change}
            required
          >
            <option value="ROLE_USER">Utilisateur</option>
            <option value="ROLE_ADMIN">Administrateur</option>
          </select>
        </div>
        <button type="submit" className="btn btn-primary">S'inscrire</button>
      </form>
    </div>
  )
}
