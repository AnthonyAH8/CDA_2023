
const { log } = require('console');
const fs = require('fs')

// ## Exercice récapitulatif sur le fs

// 1. **Créer un répertoire :** Utiliser `fs.mkdir` pour créer un répertoire appelé "nouveau_repertoire".

// fs.mkdir("C:\\Users\\Administrateur\\Desktop\\CDA_2023\\14_Express.js\\nouveau_repertoire", (error) => {
//     if(error) throw error;
//     console.log("Répertoire créé")
// })

// 2. **Écrire dans un fichier :** Utiliser `fs.writeFile` pour écrire le texte "Contenu du fichier à écrire." dans un fichier appelé "nouveau_fichier.txt".

// fs.writeFile('nouveau_fichier.txt', 'utf8', (error) =>{
//         if(error) throw error;
//         console.log("Le fichier a été créé")
//     })

// fs.writeFile("C:\\Users\\Administrateur\\Desktop\\CDA_2023\\14_Express.js\\nouveau_repertoire\\nouveau_fichier.txt", "Contenu du fichier à écrire", "utf-8", (error) =>{
//     if(error) throw error;
//     console.log("Le fichier a été créé et modifié")
// })

// 3. **Lire le contenu du fichier :** Utiliser `fs.readFile` pour lire le contenu du fichier "nouveau_fichier.txt" et afficher le résultat dans la console.


// fs.readFile("C:\\Users\\Administrateur\\Desktop\CDA_2023\\14_Express.js\\nouveau_repertoire", 'utf-8', (error) =>{
//     if(error) throw error;
//     console.log('Voici le contenu du document:');
// })

// 4. **Lister les fichiers du répertoire :** Utiliser `fs.readdir` pour lister tous les fichiers et répertoires dans le répertoire actuel et afficher le résultat dans la console.

// fs.readdir("C:\\Users\\Administrateur\\Desktop\\CDA_2023\\14_Express.js\\nouveau_repertoire", (error, files) =>{
//     if(error) throw error;
//     console.log(files);
// })

// 5. **Supprimer le fichier :** Utiliser `fs.unlink` pour supprimer le fichier "nouveau_fichier.txt".

// fs.unlink("C:\\Users\\Administrateur\\Desktop\\CDA_2023\\14_Express.js\\nouveau_repertoire\\nouveau_fichier.txt", (error) =>{
//     if (error) throw error;
//     console.log(error);
// })

// 6. **Supprimer le répertoire :** Utiliser `fs.rmdir` pour supprimer le répertoire "nouveau_repertoire".

// fs.rmdir("C:\\Users\\Administrateur\\Desktop\\CDA_2023\\14_Express.js\\nouveau_repertoire", (error) =>{
//     if (error) throw error;
//     console.log("Répertoire supprimé avec succès");
// })
