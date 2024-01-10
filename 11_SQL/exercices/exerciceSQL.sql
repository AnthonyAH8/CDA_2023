CREATE DATABASE IF NOT EXISTS tabletoptreasures_database;
USE tabletoptreasures_database;

CREATE TABLE Customers(
	id INT AUTO_INCREMENT PRIMARY KEY,
    last_name VARCHAR(50) NOT NULL,
    first_name VARCHAR(50) NOT NULL,
    mail VARCHAR(100) NOT NULL,
    adress VARCHAR(100) NOT NULL,
    phone VARCHAR(20)
);

CREATE TABLE Games(
	id INT AUTO_INCREMENT PRIMARY KEY,
    game_name VARCHAR(50) NOT NULL,
    game_description VARCHAR(100) NOT NULL,
    price INT,
    id_categorie INT NOT NULL,
    FOREIGN KEY (id_categorie) REFERENCES Categories(id) 
);

SELECT * FROM Customers;

CREATE TABLE Categories(
	id INT AUTO_INCREMENT PRIMARY KEY,
    categorie_name VARCHAR(50)
);

CREATE TABLE Commandes(
	id INT AUTO_INCREMENT PRIMARY KEY,
    id_client INT NOT NULL,
    date_order DATETIME NOT NULL,
    livraison_adress VARCHAR(100) NOT NULL,
    statut VARCHAR(50),
    FOREIGN KEY (id_client) REFERENCES Customers(id)
);

SHOW TABLES;

SET SQL_SAFE_UPDATES = 0;

INSERT INTO Customers(last_name, first_name, mail, adress, phone)
VALUES
	('Dubois', 'Marie', 'marie.dubois@example.com', '123 Rue de la Libération, Ville', '+1234567890'),
	('Lefebvre', 'Thomas', 'thomas.lefebvre@example.com', '456 Avenue des Roses, Ville', '+9876543210'),
	('Martinez', 'Léa', 'lea.martinez@example.com', '789 Boulevard de la Paix, Ville', '+2345678901'),
	('Dupuis', 'Antoine', 'antoine.dupuis@example.com', '567 Avenue de la Liberté, Ville', '+3456789012'),
	('Morin', 'Camille', 'camille.morin@example.com', '890 Rue de l''Avenir, Ville', '+4567890123'),
	('Girard', 'Lucas', 'lucas.girard@example.com', '234 Avenue des Champs, Ville', '+5678901234'),
	('Petit', 'Emma', 'emma.petit@example.com', '123 Rue des Étoiles, Ville', '+6789012345'),
	('Sanchez', 'Gabriel', 'gabriel.sanchez@example.com', '345 Boulevard du Bonheur, Ville', '+7890123456'),
	('Rossi', 'Clara', 'clara.rossi@example.com', '678 Avenue de la Joie, Ville', '+8901234567'),
	('Lemoine', 'Hugo', 'hugo.lemoine@example.com', '456 Rue de la Nature, Ville', '+9012345678'),
	('Moreau', 'Eva', 'eva.moreau@example.com', '789 Avenue de la Créativité, Ville', '+1234567890'),
	('Fournier', 'Noah', 'noah.fournier@example.com', '234 Rue de la Découverte, Ville', '+2345678901'),
	('Leroy', 'Léa', 'lea.leroy@example.com', '567 Avenue de l''Imagination, Ville', '+3456789012'),
	('Robin', 'Lucas', 'lucas.robin@example.com', '890 Rue de la Création, Ville', '+4567890123'),
	('Marchand', 'Anna', 'anna.marchand@example.com', '123 Boulevard de l''Innovation, Ville', '+5678901234');

INSERT INTO Games(game_name, game_description, price, id_categorie)
VALUES
('Catan', 'Jeu de stratégie et de développement de colonies', 30, 1),
('Dixit', 'Jeu d''association d''images', 25, 2),
('Les Aventuriers', 'Jeu de plateau d''aventure', 40, 3),
('Carcassonne', 'Jeu de placement de tuiles', 28, 1),
('Codenames', 'Jeu de mots et d''indices', 20, 2),
('Pandemic', 'Jeu de coopération pour sauver le monde', 35, 3),
('7 Wonders', 'Jeu de cartes et de civilisations', 29, 1),
('Splendor', 'Jeu de développement économique', 27, 2),
('Horreur à Arkham', 'Jeu d''enquête et d''horreur', 45, 3),
('Risk', 'Jeu de conquête mondiale', 22, 1),
('Citadelles', 'Jeu de rôles et de bluff', 23, 2),
('Terraforming Mars', 'Jeu de stratégie de colonisation de Mars', 55, 3),
('Small World', 'Jeu de civilisations fantastiques', 32, 1),
('7 Wonders Duel', 'Jeu de cartes pour 2 joueurs', 26, 2),
('Horreur à l''Outreterre', 'Jeu d''aventure horrifique', 38, 3);


SELECT * FROM Customers;
SELECT * FROM Categories;



INSERT INTO Categories(categorie_name)
VALUES
	('Stratégie'),
	('Familial'),
	('Aventure');
    
INSERT INTO Commandes(id_client, date_order, livraison_adress, statut)
VALUES
	(1, "2024-01-10", '123 Rue de la Libération, Ville', 'En Cours de livraison'),
    (8, "2024-01-10", '345 Boulevard du Bonheur, Ville', 'En Cours de préparation'),
    (12, "2024-01-10", '234 Rue de la Découverte, Ville', 'Livraison dans la journée');

UPDATE Games
SET price = 35
WHERE id = 3;

DELETE FROM Games
WHERE game_name = 'Dixit';

SELECT * FROM Categories;

SELECT *
FROM Categories
WHERE categorie_name LIKE 'A%' OR categorie_name LIKE 'S%';

SELECT *
FROM Categories
WHERE id BETWEEN 2 AND 5;

SELECT count(id)
FROM Categories;

SELECT MAX(LENGTH(categorie_name)) AS max_length_category_letters
FROM Categories;

SELECT categorie_name
FROM Categories
ORDER BY categorie_name DESC;


-- Games
SELECT * FROM Games;


SELECT * FROM Games
WHERE price BETWEEN 25 AND 40;

SELECT * FROM Games
WHERE id_categorie = 3;