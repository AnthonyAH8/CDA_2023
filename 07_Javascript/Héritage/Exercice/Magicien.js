import Personnage from "./Personnage.js";

export default class Magicien extends Personnage {
    constructor(nom, vie, force, mana){
        super(nom, vie, force)
        this.mana = mana
    }

    attaquer(cible){
        const degats = 20
        cible.vie -= degats
        console.log(`Le ${this.nom} attaque ${cible.nom} et lui inflige ${degats} points de dégâts. Il lui reste donc ${cible.vie + this.mana} de vie`);
    }

    soigner(){
        return this.vie += this.mana
    }
}