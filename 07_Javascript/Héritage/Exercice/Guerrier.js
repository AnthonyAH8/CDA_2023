import Personnage from "./Personnage.js";
import Magicien from "./Magicien.js";

export default class Guerrier extends Personnage{
    constructor(nom, vie, force, armure){
        super(nom, vie, force)
        this.armure = armure
    }

    attaquer(cible){
        const armure = 50
        const degats = 20 
        cible.vie += armure
        cible.vie -= degats
        console.log(`Le ${this.nom} attaque ${cible.nom} et lui inflige ${degats} points de dégâts. Il lui reste donc ${cible.vie} de vie`);

    }

    vie(){
        return this.vie + this.armure
    }
}
