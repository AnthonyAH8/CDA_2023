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

-- Mettez à jour le prix du jeu avec l'ID 3 (Les Aventuriers) pour le fixer à 35 €
UPDATE Games
SET price = 35
WHERE id = 3;

-- Supprimez le jeu avec l'ID 2 (Dixit) de la table "Jeux".
DELETE FROM Games
WHERE game_name = 'Dixit';

-- Sélectionnez tous les noms de catégories distinctes
SELECT * FROM Categories;

-- Montrez les catégories avec des noms commençant par "A" ou "S"
SELECT *
FROM Categories
WHERE categorie_name LIKE 'A%' OR categorie_name LIKE 'S%';

-- Quelles catégories ont un ID entre 2 et 5 inclus ?
SELECT *
FROM Categories
WHERE id BETWEEN 2 AND 5;

-- Combien de catégories différentes existent ?
SELECT count(id)
FROM Categories;

-- Quelle est la catégorie ayant le nom le plus long ?
SELECT MAX(LENGTH(categorie_name)) AS max_length_category_letters
FROM Categories;

-- Montrez le nombre de jeux dans chaque catégorie.
SELECT COUNT(Categories.id), categorie_name
FROM Categories
INNER JOIN Games ON Categories.id = Games.id_categorie
GROUP BY categories.id;

--  Affichez les catégories triées par ordre alphabétique inversé
SELECT categorie_name
FROM Categories
ORDER BY categorie_name DESC;


-- Games

-- Sélectionnez tous les noms de jeux distincts
SELECT * FROM Games;

-- Montrez les jeux avec un prix entre 25 et 40
SELECT * FROM Games
WHERE price BETWEEN 25 AND 40;

-- Quels jeux appartiennent à la catégorie avec l'ID 3 ?
SELECT * FROM Games
WHERE id_categorie = 3;

-- Combien de jeux ont une description contenant le mot "aventure" ?
SELECT * FROM Games
WHERE game_description LIKE '%aventure%';

-- Quel est le jeu le moins cher ?
SELECT game_name, MIN(price)
FROM Games;


-- Montrez la somme totale des prix de tous les jeux.
SELECT SUM(price) FROM Games;

--  Affichez les jeux triés par ordre alphabétique des noms en limitant les résultats à 
-- 5.
SELECT game_name 
FROM Games
ORDER BY game_name ASC LIMIT 5; 

-- Sélectionnez tous les prénoms des clients distincts.
SELECT * FROM Customers;

-- Montrez les clients dont l'adresse contient "Rue" et dont le numéro de téléphone 
-- commence par "+1".
SELECT * FROM Customers
WHERE adress LIKE '%Rue%' AND phone LIKE '+1%';

-- Quels clients ont un nom commençant par "M" ou "R" ?
SELECT * FROM Customers
WHERE last_name LIKE 'M%' OR last_name LIKE'R%';


--  Combien de clients ont une adresse e-mail valide (contenant "@") ?
SELECT * FROM Customers
WHERE mail LIKE '%@%';


-- Quel est le prénom le plus court parmi les clients ?
SELECT MIN(first_name) FROM Customers;

-- Montrez le nombre total de clients enregistrés.
SELECT Count(last_name) FROM Customers;

-- Affichez les clients triés par ordre alphabétique des noms de famille, mais en 
-- excluant les premiers 3
SELECT * 
FROM Customers
ORDER BY last_name ASC
LIMIT 15 OFFSET 3;

-- Sélectionnez les noms des clients, noms de jeux et date de commande pour 
-- chaque commande passée
SELECT last_name, date_order, game_name
FROM Customers
INNER JOIN Commandes ON Customers.id = Commandes.id_client
INNER JOIN Games ON Customers.id = Games.id;

-- Sélectionnez les noms des clients et le montant total dépensé par chaque client. 
-- Triez les résultats par montant total décroissant.
SELECT last_name, price, id_client
FROM Customers
INNER JOIN Games ON Customers.id = Games.id
INNER JOIN Commandes ON Customers.id = Commandes.id_client
ORDER BY price ASC;

-- Sélectionnez les noms des jeux, noms de catégories et prix de chaque jeu.
SELECT game_name, categorie_name, price
FROM Categories
INNER JOIN Games ON Categories.id = Games.id_categorie;

-- Sélectionnez les noms des clients, date de commande et noms de jeux pour 
-- toutes les commandes passées
SELECT last_name, date_order, game_name
FROM Customers
LEFT JOIN Commandes ON Customers.id = Commandes.id_client
LEFT JOIN Games ON Customers.id = Games.id;

-- Sélectionnez les noms des clients, nombre total de commandes par client et 
-- montant total dépensé par client. Incluez uniquement les clients ayant effectué 
-- au moins une commande
SELECT last_name, price, id_client
FROM Customers
LEFT JOIN Games ON Customers.id = Games.id
LEFT JOIN Commandes ON Customers.id = Commandes.id_client
WHERE id_client > 0;
