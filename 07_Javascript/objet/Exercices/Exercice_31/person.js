export default class Person {

  #nom;
  #prenom;
  #dateNaissance

    constructor(nom, prenom, dateNaissance) {
      this.#nom = nom;
      this.#prenom = prenom;
      this.#dateNaissance = dateNaissance;
    }
  
    get nomComplet() {
      return this.#prenom + " " + this.#nom + " " + this.#dateNaissance;
    }

    set prenom(prenom) {

      if (prenom !== "quentin") {
        this.prenom = prenom;
      } else {
        console.log(`Prénom ${prenom} interdit`);
      }
    }
  }