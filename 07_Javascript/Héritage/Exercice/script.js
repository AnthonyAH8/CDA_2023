import Guerrier from "./Guerrier.js";
import Magicien from "./Magicien.js";

let guerrier = new Guerrier("Guerrier", 100, 10, 50)

let magicien = new Magicien("Magicien", 100, 15, 0)

console.log(magicien.vie)
guerrier.attaquer(magicien)
console.log(magicien.vie)

console.log("--------------");

console.log(guerrier.vie)
magicien.attaquer(guerrier)
console.log(guerrier.vie)

console.log(magicien.soigner())