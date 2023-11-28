import Person from "./person.js";

// Création d'un tableau de personnes
let personnes = [];

// Création de quelques objets de type Person
let p1 = new Person("Dupont", "Jean", "01/01/2000");
let p2 = new Person("Durand", "Marie", "02/02/2001");
let p3 = new Person("Martin", "Pierre", "03/03/2002");

// Ajout des personnes dans le tableau
personnes.push(p1);
personnes.push(p2);
personnes.push(p3);

// Affichage du tableau de personnes
console.log(personnes);

// Test du getter nomComplet
console.log(p1.nomComplet); // Jean Dupont

// Test du setter prenom
p2.prenom = "donné"; // Prénom donné interdit
p2.prenom = "Julie"; // Modification du prénom
console.log(p2.nomComplet); // Julie Durand*
let form = document.getElementById("form-person");
let table = document.getElementById("table-person");

// Fonction pour ajouter une personne dans le tableau et dans le DOM
function ajouterPersonne(personne) {
  // Ajout de la personne dans le tableau
  personnes.push(personne);

  // Création d'un élément tr
  let tr = document.createElement("tr");

  // Création des éléments td avec les données de la personne
  let tdNom = document.createElement("td");
  tdNom.textContent = personne._nom;
  let tdPrenom = document.createElement("td");
  tdPrenom.textContent = personne._prenom;
  let tdDateNaissance = document.createElement("td");
  tdDateNaissance.textContent = personne._dateNaissance;

  // Ajout des éléments td dans le tr
  tr.appendChild(tdNom);
  tr.appendChild(tdPrenom);
  tr.appendChild(tdDateNaissance);

  // Ajout du tr dans le tbody du tableau
  table.querySelector("tbody").appendChild(tr);
}

// Gestion de l'événement submit du formulaire
form.addEventListener("submit", function(e) {
  // Empêche le comportement par défaut du formulaire
  e.preventDefault();

  // Récupération des valeurs des champs du formulaire
  let nom = form.nom.value;
  let prenom = form.prenom.value;
  let dateNaissance = form.dateNaissance.value;

  // Création d'un objet de type Person
  let personne = new Person(nom, prenom, dateNaissance);

  // Ajout de la personne dans le tableau et dans le DOM
  ajouterPersonne(personne);

});

// # Exercice 31

// Réaliser un programme via le JAvascript (et un module) permettant de créer des personnes (nom, prénom, date de naissance) et de les ajouter dans un tableau de personnes. 

// Pour ce faire, vous devrez, dans un fichier, avoir votre définition de classe (Person) qui sera exportée afin de la rendre disponible dans votre fichier de module principal. 

// Dans le fichier de module principal se trouverons le tableau de personnes, les créations d'objet de type Person ainsi que l'affichage en console du tableau de personnes rempli préalablement.

// La classe devra réaliser le mécanisme de l'encapsulation en rendant inaccessible ses champs privés et en forçannt le passage par un getter / setter afin d'obtenir en dehors de celle-ci les champs. 

// Pour les tester, au niveau du getter, on va réaliser un getter retournant le nom complet de la personne. Au niveau du setter, il devra être impossible de mettre en prénom à la personne un prénom donné.

// Bonus: Faire l'ensemble des manipulations via l'HTML et la manipulation du DOM (peuplage d'un tableau visuellement présent dans la page finale)
