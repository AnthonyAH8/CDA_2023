import Chat from "./chat.js";

const newCat = new Chat("Toto", 4, "Grey", "Persian", "yes")

console.log(newCat)

const newCat2 = new Chat("Titi", 1, "Ginger", "stray", "yes")

console.log(newCat2)

let cats = [];

document.addEventListener("DOMContentLoaded", () => {

function ajouterChat(){
    let nom = document.getElementById("nom").value;
    let age = document.getElementById("age").value;
    let color = document.getElementById("color").value;
    let race = document.getElementById("race").value;
    let purr = document.getElementById("purr").value;

    let cat = {
        nom : nom,
        age :age,
        color : color,
        race : race,
        purr : purr
    }

    cats.push(cat)

    afficherChat()
}

function afficherChat(){
    let tbody = document.querySelector("tbody");
    tbody.innerHTML = "";

    for(let i = 0; i < cats.length; i++){
        let tr = document.createElement("tr");
        let nom = document.createElement("td");

        nom.textContent = cats[i].nom
        tr.appendChild(nom)

        let age = document.createElement("td")
        age.textContent = cats[i].age
        tr.appendChild(age)

        let color = document.createElement("td")
        color.textContent = cats[i].color
        tr.appendChild(color)

        let race = document.createElement("td")
        race.textContent = cats[i].race
        tr.appendChild(race)

        let purr = document.createElement("td")
        purr.textContent = cats[i].purr
        tr.appendChild(purr)
        tbody.appendChild(tr)
    }
}
})