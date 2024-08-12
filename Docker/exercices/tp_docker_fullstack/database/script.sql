CREATE DATABASE IF NOT EXISTS tp_fullstack;

USE tp_fullstack;

CREATE TABLE IF NOT EXISTS users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100)
);

INSERT INTO users (name, email) VALUES
('toto', 'toto@gmail.com'),
('titi', 'titi@gmail.com');