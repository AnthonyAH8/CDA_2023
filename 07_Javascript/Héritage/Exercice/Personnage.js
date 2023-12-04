
export default class Personnage{
    constructor(nom, vie, force){
        this.nom = nom;
        this.vie = vie;
        this.force = force
    }

    attaquer(cible) {
        const degats = this.force;
        cible.vie -= degats;
        console.log(`${this.nom} attaque ${cible.nom} et lui inflige ${degats} points de dégâts.`);
      }
    }
