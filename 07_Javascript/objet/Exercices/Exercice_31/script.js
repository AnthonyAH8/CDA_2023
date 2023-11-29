import Person from "./person.js";

let personnes = [];

let p1 = new Person("toto", "titi", "01/01/2000");
let p2 = new Person("Doe", "John", "08/11/1965");
let p3 = new Person("Paul", "LePoulpe", "01/02/2003");

personnes.push(p1);
personnes.push(p2);
personnes.push(p3);

console.log(personnes);
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

form.addEventListener("submit",(event) => {

  event.preventDefault();

  let nom = form.nom.value;
  let prenom = form.prenom.value;
  let dateNaissance = form.dateNaissance.value;

  let personne = new Person(nom, prenom, dateNaissance);

  ajouterPersonne(personne);

});
