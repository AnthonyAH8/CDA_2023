// const path = require('path');
const fs = require ('fs')

// // Bien sûr ! Voici un exercice qui combine plusieurs fonctionnalités du module `path` de Node.js. L'objectif est de manipuler des chemins de fichiers pour créer une structure de répertoires, résoudre des chemins, et extraire des informations spécifiques à partir de chemins de fichiers.

// // **Exercice : Gestion de fichiers et répertoires**

// // 1. Créez un fichier "rapport.txt" que vous laisserez vide et que vous stockerez dans un dossier que vous appelerez "documents".

// // 2. Créez un script Node.js qui effectue les tâches suivantes :


// //    - Utilisez la méthode `path.join` pour créer le chemin complet vers un fichier nommé "rapport.txt" dans un répertoire "documents" qui se trouve dans le répertoire utilisateur.

// const file = path.join('CDA_2023','14_Express.js', 'Exercices', 'Documents', 'fichier.txt');

// console.log('file : ' + file);


// //    - Utilisez la méthode `path.resolve` pour obtenir le chemin absolu du fichier "rapport.txt" créé précédemment.

// const resolve = path.resolve(file);

// console.log('resolve : ' + resolve);

// //     - Utilisez la méthode `path.extname` pour vérifier si le fichier a une extension ".txt".

// const extname = path.extname(resolve) === '.txt';
// console.log(extname);

// // //    - Utilisez la méthode `path.dirname` pour obtenir le répertoire du fichier "rapport.txt".

// const dirname = path.dirname(resolve);
// console.log('dirname : '+ dirname);

// // //    - Utilisez la méthode `path.basename` pour extraire le nom du fichier (sans l'extension) à partir du chemin absolu.

// const basename = path.basename(resolve);
// console.log('basename : ' + basename);

// //    - Utilisez la méthode `path.parse` pour obtenir un objet avec les détails du chemin du fichier "rapport.txt" (répertoire, base, nom, extension, etc.).

// // const normalize = path.normalize(resolve);
// const parse = path.parse(resolve);
// console.log(parse);

// //    - Utilisez la méthode `path.normalize` pour créer un chemin normalisé à partir de segments relatifs.

// const normalize = path.normalize(resolve)
// console.log('normalize : '+ normalize);

// // 3. Affichez les résultats de chaque étape dans la console.

// // 4. Exécutez le script et vérifiez si les résultats sont conformes aux attentes.

// -----------------------------------------------------------------------------------------------------------------------------------------------------------------------

