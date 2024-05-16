USE demo_jdbc;

-- CREATE TABLE Person(
-- 	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
--     firstname VARCHAR(100),
--     lastname VARCHAR(100)
-- );

-- CREATE TABLE Film(
-- 	id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
--     titre VARCHAR(100),
--     realisateur VARCHAR(100),
--     dateSortie VARCHAR(100),
--     genre VARCHAR(100)
-- );

-- CREATE TABLE Animaux(
-- 	id_animaux INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
--     nom VARCHAR(50),
--     race VARCHAR(50),
--     description VARCHAR(255),
--     age INT NOT NULL
-- )

USE demo_jdbc;

-- CREATE TABLE categorie (
--     id_categorie INT AUTO_INCREMENT PRIMARY KEY,
--     nom_categorie VARCHAR(50) NOT NULL
-- );

-- CREATE TABLE ingredient (
--     id_ingredient INT AUTO_INCREMENT PRIMARY KEY,
--     nom_ingredient VARCHAR(50) NOT NULL
-- );

CREATE TABLE etape (
    id_etape INT AUTO_INCREMENT PRIMARY KEY,
    description_etape TEXT NOT NULL,
    recette_id INT,
    FOREIGN KEY (recette_id) REFERENCES recette(id_recette)
);

CREATE TABLE commentaire (
    id_commentaire INT AUTO_INCREMENT PRIMARY KEY,
    description TEXT NOT NULL,
    recette_id INT,
    FOREIGN KEY (recette_id) REFERENCES recette(id_recette)
);

CREATE TABLE recette (
	id_recette INT AUTO_INCREMENT PRIMARY KEY,
	nom VARCHAR(50) NOT NULL,
	tempsPrep INT,
	tempsCuisson INT,
	difficulte INT,
	categorie_id INT,
	FOREIGN KEY (categorie_id) REFERENCES categorie(id_categorie)
);

CREATE TABLE recette_ingredient (
    recette_id INT,
    ingredient_id INT,
    PRIMARY KEY (recette_id, ingredient_id),
    FOREIGN KEY (recette_id) REFERENCES recette(id_recette),
    FOREIGN KEY (ingredient_id) REFERENCES ingredient(id_ingredient)
);
