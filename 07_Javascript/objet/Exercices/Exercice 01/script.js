// Réaliser un programme Javascript permettant, au sein d'une page HTML:

// * La saisie des informations d'une personne (nom, prénom et date de naissance)
// * L'ajout de cette personne à un tableau stocké en mémoire au moment de l'appui sur un bouton dans l'HTML 
// * L'affichage en temps réel d'un tableau de personnes celui-ci étant en lien avec le tableau stocké dans la mémoire dans le code Javascript.

// Pour ce faire, pensez à utiliser un sélecteur permettant d'atteindre l'élément de type `<tbody>` de votre tableau. Cet élément devra contenir, pour chaque personne, un `<tr>` possédant plusieurs `<td>` (un par attribut de la personne). 

const newPersonne = {
    firstname : "John",
    lastname: "Dupont",
    birthday: "22/02/1968"
}

const firstname = document.querySelector("td#firstname")
const lastname = document.querySelector("td#lastname")
const birthday = document.querySelector("td#birthday")

// document.querySelector("button#addPerson").addEventListener("click", () =>{
//     const addTD = document.querySelector("td");
//     if(addTD){
//         const newTD = document.createElement("td");
//         newTD.textContent = addTD.value
//     }
// })

console.log(newPersonne)