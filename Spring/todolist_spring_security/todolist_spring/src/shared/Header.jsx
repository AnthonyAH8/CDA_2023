import React from 'react';
import { useNavigate } from 'react-router-dom';
import userDetails from '../helpers/userDetails';
import authService from '../services/authService';

export default function Header() {
  const navigate = useNavigate();
  const details = userDetails();

  const extractBeforeAt = (email) => {
    const index = email.indexOf('@');
    return index !== -1 ? email.substring(0, index) : email;
  };

  const isAdmin = () => {
    return details && details.role === 'ADMIN';
  };

  const isLogged = () => {
    const user = localStorage.getItem('user');
    return !!user;
  };

  const logout = () => {
    authService.logout();
    navigate('/login');
  };

  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <button
        className="navbar-toggler"
        type="button"
        data-toggle="collapse"
        data-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent"
        aria-expanded="false"
        aria-label="Toggle navigation"
      >
        <span className="navbar-toggler-icon"></span>
      </button>

      <div className="collapse navbar-collapse" id="navbarSupportedContent">
        <ul className="navbar-nav mr-auto">
          <li className="nav-item active">
            <a className="nav-link" href="#">
              Home <span className="sr-only">(current)</span>
            </a>
          </li>
          <li className="nav-item">
            <a className="nav-link" href="/todos">Todos</a>
          </li>
          {isAdmin() && (
            <li className="nav-item">
              <a className="nav-link" href="/create-product">Create</a>
            </li>
          )}
        </ul>
        <div className="form-inline my-2 my-lg-0">
          {!isLogged() ? (
            <>
              <li className="nav-item mr-4" style={{ listStyleType: 'none' }}>
                <button
                  className="btn btn-outline-success me-2"
                  onClick={() => navigate('/login')}
                >
                  Connexion
                </button>
              </li>
              <li className="nav-item" style={{ listStyleType: 'none' }}>
                <button
                  className="btn btn-outline-primary"
                  onClick={() => navigate('/register')}
                >
                  Créer un compte
                </button>
              </li>
            </>
          ) : (
            <li className="nav-item" style={{ listStyleType: 'none' }}>
              <span className="navbar-text mr-4">
                Bonjour, {extractBeforeAt(details.email)}
              </span>
              <button className="btn btn-outline-danger" onClick={logout}>
                Deconnexion
              </button>
            </li>
          )}
        </div>
      </div>
    </nav>
  );
}
