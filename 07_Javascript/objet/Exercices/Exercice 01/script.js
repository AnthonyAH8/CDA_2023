// Réaliser un programme Javascript permettant, au sein d'une page HTML:

// * La saisie des informations d'une personne (nom, prénom et date de naissance)
// * L'ajout de cette personne à un tableau stocké en mémoire au moment de l'appui sur un bouton dans l'HTML 
// * L'affichage en temps réel d'un tableau de personnes celui-ci étant en lien avec le tableau stocké dans la mémoire dans le code Javascript.

// Pour ce faire, pensez à utiliser un sélecteur permettant d'atteindre l'élément de type `<tbody>` de votre tableau. Cet élément devra contenir, pour chaque personne, un `<tr>` possédant plusieurs `<td>` (un par attribut de la personne). 


var personnes = [];

function ajouterPersonne() {
    var nom = document.getElementById("nom").value;
    var prenom = document.getElementById("prenom").value;
    var date = document.getElementById("date").value;

    var personne = {
        nom: nom,
        prenom: prenom,
        date: date
    };

    personnes.push(personne);

    afficherTableau();
}

function afficherTableau() {
    var tbody = document.querySelector("tbody");

    tbody.innerHTML = "";


    for (var i = 0; i < personnes.length; i++) {
        var tr = document.createElement("tr");
        var tdNom = document.createElement("td");
        tdNom.textContent = personnes[i].nom;
        tr.appendChild(tdNom);
        var tdPrenom = document.createElement("td");
        tdPrenom.textContent = personnes[i].prenom;
        tr.appendChild(tdPrenom);

        var tdDate = document.createElement("td");

        tdDate.textContent = personnes[i].date;

        tr.appendChild(tdDate);

        tbody.appendChild(tr);
    }
}