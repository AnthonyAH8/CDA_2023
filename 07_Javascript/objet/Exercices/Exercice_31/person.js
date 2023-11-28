export default class Person {
    constructor(nom, prenom, dateNaissance) {
      this.#nom = nom;
      this.#prenom = prenom;
      this.#dateNaissance = dateNaissance;
    }
  
    get nomComplet() {
      return this.#prenom + " " + this.#nom;
    }

    set prenom(prenom) {

      if (prenom !== "donné") {
        this.#prenom = prenom;
      } else {
        console.log("Prénom donné interdit");
      }
    }
  }