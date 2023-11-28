import Person from "./person.js";

let personnes = [];

let p1 = new Person("toto", "titi", "01/01/2000");
let p2 = new Person("Doe", "John", "08/11/1965");
let p3 = new Person("Paul", "LePoulpe", "01/02/2003");

personnes.push(p1);
personnes.push(p2);
personnes.push(p3);

console.log(personnes);

console.log(p1.nomComplet); 


p2.prenom = "donné";
p2.prenom = "Jean"; 
console.log(p2.nomComplet);
let form = document.getElementById("form-person");
let table = document.getElementById("table-person");


function ajouterPersonne(personne) {
  personnes.push(personne);

  let tr = document.createElement("tr");

  let tdNom = document.createElement("td");
  tdNom.textContent = personne._nom;
  let tdPrenom = document.createElement("td");
  tdPrenom.textContent = personne._prenom;
  let tdDateNaissance = document.createElement("td");
  tdDateNaissance.textContent = personne._dateNaissance;

  tr.appendChild(tdNom);
  tr.appendChild(tdPrenom);
  tr.appendChild(tdDateNaissance);

  table.querySelector("tbody").appendChild(tr);
}

form.addEventListener("submit", function(e) {

  e.preventDefault();

  let nom = form.nom.value;
  let prenom = form.prenom.value;
  let dateNaissance = form.dateNaissance.value;

  let personne = new Person(nom, prenom, dateNaissance);

  ajouterPersonne(personne);

});

// # Exercice 31

// Réaliser un programme via le JAvascript (et un module) permettant de créer des personnes (nom, prénom, date de naissance) et de les ajouter dans un tableau de personnes. 

// Pour ce faire, vous devrez, dans un fichier, avoir votre définition de classe (Person) qui sera exportée afin de la rendre disponible dans votre fichier de module principal. 

// Dans le fichier de module principal se trouverons le tableau de personnes, les créations d'objet de type Person ainsi que l'affichage en console du tableau de personnes rempli préalablement.

// La classe devra réaliser le mécanisme de l'encapsulation en rendant inaccessible ses champs privés et en forçannt le passage par un getter / setter afin d'obtenir en dehors de celle-ci les champs. 

// Pour les tester, au niveau du getter, on va réaliser un getter retournant le nom complet de la personne. Au niveau du setter, il devra être impossible de mettre en prénom à la personne un prénom donné.

// Bonus: Faire l'ensemble des manipulations via l'HTML et la manipulation du DOM (peuplage d'un tableau visuellement présent dans la page finale)