// let firstName, lastName, age;

// firstName = prompt("Prénom :");
// lastName = prompt("Nom :");
// age = prompt("Age : ")

// console.log(`Bonjour, ${firstName} ${lastName} ${age} ans`);
// alert(`Bonjour, ${firstName} ${lastName} ${age} ans`)

// ---------------------------------------

// let nb1, nb2, result;

// nb1 = parseInt(prompt("Veuillez donner un nombre positif :"))
// nb2 = parseInt(prompt("Veuillez donner un second nombre positif :"))
// result = nb1 + nb2
// console.log(`Le résultat de ${nb1} + ${nb2} = ${result}`)
// alert(`Le résultat de ${nb1} + ${nb2} = ${result}`)

// ------------------------------------------ (Number = Transtypage (cast))

// let hauteur, rayon, pi, volume;

// rayon = parseFloat(prompt("Veuillez saisir un rayon:"));
// hauteur = parseFloat(prompt("Veuillez saisir une hauteur:"));
// volume = ((Math.PI * (rayon ** 2) * hauteur) / 3).toFixed(3);

// alert(`Le volume d'un cone droit avec le rayon ${rayon} et la hauteur ${hauteur} est de ${volume} cm³`); (chaine interpolée)

// -----------------------------------------------

// alert(((Math.PI * Number(prompt("Veuillez saisir un rayon:")) ** 2) * Number(prompt("Veuillez saisir une hauteur:")) / 3 ).toFixed(3));

// -----------------------------------------------

// let age;

// age = Number(prompt("Veuillez saisir votre âge"));
// alert((age >= 18));

// ---------------------------------------------------


// let temp;

// temp = Number(prompt("Veuillez entrer une température de l'eau"));
// if (temp < 0) {
//     console.log("L'eau est à l'état solide")
// } else if(temp >=0 && temp <=100){
//     console.log("L'eau est à l'état liquide")
// } else{
//     console.log("L'eau est à l'état gazeux")
// }

// console.log(temp > 100 ? "L'eau est à l'état gazeux" : (temp < 0 ? "L'eau est à l'état solide" : "L'eau est à l'état liquide"));

// -----------------------------------------------------

// let age, salaire, experience

// age = Number(prompt("Age : "));
// salaire = Number(prompt("Salaire demandé : "));
// experience = Number(prompt("Années d'experience :"));

// if(age < 30) {
//     alert("Trop jeune! Minimum 30 ans");
// } else if (experience < 5) {
//     alert("Pas assez d'expérience! 5 ans d'expérience minimum");
// } else if(salaire >= 40000){
//     alert("Salaire demandé trop élevé! 40000 euros net max");
// } else{
//     alert("Candidature valable !");
// }

// ----------------------------------------------------------


// let random = Math.floor((Math.random() * 100));
// console.log(random);

// let reponse;

// do{
//     reponse = Number(prompt("Saisir un nombre entre 0 et 100"))
// }while (reponse !== random);

// ---------------------------------------------------------------

// for(let number = 0; number < 10; number++){
//     if(number === 0){
//         console.log("Je commence à compter")
//     };
//     console.log(number)
// }
// console.log("Fin du compte !")

// let nb = 0;

// while(nb < 10){
//     console.log(nb);
//     nb++;
// }

// ------------------------------------------------------------

// for( let matiere = 1; matiere < 4; matiere++){
//     console.log(`Chapitre ${matiere}`)
//     for( let chapter = 1; chapter < 4; chapter++){
//         console.log(`Partie ${matiere}.${chapter}`)
//     }
// }

// ----------------------------------------------------------------

// let pipe = "|";
// let tiret = "-";
// let resultat = "";
// let number;

// for(number = 1; number <= 10; number++){
//     console.log(`\nTable de ${number} :`)
//     for( let number2 = 1; number2 <= 10; number2++){
//         console.log(`${number} X ${number2} =  ${number2 * number}`);
//     }
// }

// --------------------------------------------------------------------(tableau)

// console.log(`${pipe} 1 ${pipe} 2 ${pipe} 3 ${pipe} 4 ${pipe} 5 ${pipe} 6 ${pipe} 7 ${pipe} 8 ${pipe} 9 ${pipe} 10`);
// console.log(`--------------------------------------------`);
// for ( let i = 1; i <= 10; i++) {
//     for( let j= 1 ; j <= 10; j++){
//         resultat += `${j  * i} \t`
//     }
//     resultat += `\n`
// }
// console.log(resultat);


// console.log(`${pipe} 1 ${pipe} 2 ${pipe} 3 ${pipe} 4 ${pipe} 5 ${pipe} 6 ${pipe} 7 ${pipe} 8 ${pipe} 9 ${pipe} 10`);
// console.log(`--------------------------------------------`);
// for (number = 1; number <= 10; number++) {
//     console.log(`${pipe} ${1*number}${pipe} ${2*number}${pipe} ${3*number}${pipe} ${4*number}${pipe} ${5*number}${pipe} ${6*number}${pipe} ${7*number}${pipe} ${8*number}${pipe} ${9*number}${pipe} ${10*number}${pipe}`);
//     console.log(`----------------------------------------`);
// }

// let nbLignes = parseInt(prompt("Entrez la hauteur du triangle"));

// let etoiles = "*";
// let espaces = " ";
// let nbEspaces = nbLignes - 1;
// for (let ligne = 1; ligne <= nbLignes; ligne++) {   
//     console.log(`${espaces.repeat(nbEspaces)}${etoiles}`);
//     etoiles += "**";     
//     nbEspaces --;
// }


// ---------------------------------------------------------------

// let epaisseur = 0.0001;
// let compteur = 0;
// do{ 
//    epaisseur*=2
//    compteur++
// } while(epaisseur < 400)
// console.log(compteur)

// let epaisseurMax = 400;
// let count = 0;
// do{ 
//     epaisseurMax/=2
//     count++
//  } while(epaisseurMax > 0.0001)
//  console.log(compteur)

// --------------------------------------------------------------------

// let population = Number(prompt("Nombre d'habitants :"));
// let taux = Number(prompt("Pourcentage d'accroissement :"));
// let populationGoal = Number(prompt("Nombre d'habitants visé :"));
// let nombre = 0;
// taux = 1 + (taux / 100);

// while(population <= populationGoal){
//     population = taux * population
//     nombre++;
// }
// console.log(`La population initiale dépasse la population visée à partir de l'année ${nombre} avec un taux de ${taux}%.`);


// -------------------------------------------------------------------------------

// let number = parseInt(prompt("Saisir un nombre entier :"));

// while(isNaN(number) && number > 0){
//     number = parseInt(prompt("Erreur, veuillez saisir un nombre entier :"))
// }

// for(let entier = 1; entier  < number / 2+1; entier++){
//     let somme  = entier;
//     let chaine = `${number} = ${entier}`;
//     for(let j = entier + 1; j < number / 2+1; j++){
//         somme += j;
//         chaine += ` + ${j}`;
//         if (somme > number)
//             break;
//         else if(somme === number){
//             console.log(chaine);
//             break;
//         }
//     }
// }

// -------------------------------------------------------------------------------------

// function hello(){
//     alert("Hello world!")
// }
// hello();

// function helloSomeone(name) {
//     alert(`Hello ${name}`);
// }
// helloSomeone("Toto");

// function sum(a,b) {
//     return a + b
// }
// console.log(sum(1,2))

// function firstLetter(word){
//     return word.charAt(0)
// }
// console.log(firstLetter("Toto"));

// ----------------------------------------------------------------------------

// function identity(firstName= "jOhN", lastName= "dOe"){
//     return `${firstName.charAt(0).toUpperCase() + firstName.slice(1).toLowerCase()} ${lastName.charAt(0).toUpperCase() + lastName.slice(1).toLowerCase()}`
// }
// console.log(identity())

// ----------------------------------------------------------------------------------

// function substraction(a,b){
//     console.log(`Je soustrais ${b} à ${a}`);
//     return a - b
// } 
// console.log(substraction(2,1))

// --------------------------------------------------------------------------------------

// function quelleHeure(heure ="12h00"){
//     console.log(`Il est ${heure}`);
// }
// quelleHeure();
// quelleHeure("14h00")

// function quelleHeure(heure ="12h00"){
//     return heure
// }
// console.log(quelleHeure());
// console.log(quelleHeure("14h00"));

// ----------------------------------------------------------------

// const ask = (question, yes, no) =>{if (confirm(question)){yes()}else{no()}}

// ask("Do you agree?",
// () => {
//     alert("You agreed.");
//     },
//     () => {
//         alert("You canceled the execution.")
//     }
// );

// ----------------------------------------------------------------------

// function palindrom(mot){
//     let longueur = Math.floor(mot.length / 2)
//     for (let i = 1; i < longueur / 2; i++){
//         if(mot.charAt(i) !== mot.charAt(mot - 1 - i)){
//             return false;
//         }
//     }return true
// }

// console.log(palindrom("azerty"));
// console.log(palindrom("kayak"));

// --------------------------------------------

// function compterLettreA(chaine){;
//     let count = 0;
//     for (let i = 0; i <= chaine.length ; i++) {
//         if(chaine[i] === 'a' || chaine[i] === 'A'){
//           count ++
//         }
//     } return count;
//     }
// console.log(compterLettreA("abba"));
// console.log(compterLettreA("mixer"));


// ----------------------------------------

// let tab = [
//     "Pomme",
//     "Orange",
//     "Frites",
//     false,
//     0.5,
//     4
// ]
// tab.push("fricadelle");
// console.log(tab[2])
// console.table(tab)


// # Exercice 21

// - Vous devez créer un tableau qui contiendra 10 valeurs.
// - Faites en sorte que l’utilisateur puisse saisir les 10 valeurs afin de les stocker dans le tableau.
// - Enfin procédez à l’itération de son contenu afin de l’afficher dans la console
// - Effectuer l’affichage des résultats dans la console comme indiqué dans l'exemple ci-dessous.
// - Pour aller plus loin créez une fonction permettant de le remplir automatiquement avec des nombres aléatoires


let tableau = [];
let message = "";

for (let i = 1; i <= 10; i++) {
    let numberTableau = Number(prompt("Veuillez saisir des chiffres entre 1 et 100 :"));
    if (isNaN(numberTableau)) {
        alert("Valeur invalide, veuillez réessayer.");
    } else {
        tableau.push(numberTableau);
    }
        
}

for (let i = 0; i < tableau.length; i++) {
    const tab = `\t`
    message += `${tab * i}${tableau[i]} \n`
}
console.log(message);

// function remplirTableau() {
//     let number = Math.floor(Math.random() * 100);
//     tableau.push(number);
//   }
//   console.log(remplirTableau())


// --------------------------------------------------------------

// # Exercice 22
// - Demander à l’utilisateur le nombre de chiffre que comportera un tableau
// - Le programme générera aléatoirement des nombres entre 1 et 50 pour remplir les cellules de ce tableau.
// - Enfin votre programme vérifiera s’ils sont pair ou impair puis les affichera sous cette forme :
// ```
// Le nombre 30 est   pair.
// Le nombre 31 est impair.
// Le nombre  5 est impair.
// Le nombre 12 est   pair.
// ```

// let choix = prompt("Saisir un nombre inférieur à 50 :");

// let tableau = [];

// for (let i = 0; i < choix; i++) {
//   let nombre = Math.floor(Math.random() * 50) + 1;
//   tableau.push(nombre);
// }

// for (let nombre of tableau) {
//   if (nombre % 2 == 0) {
//     console.log(`Le nombre ${nombre} est impair`);
//   } else {
//     console.log(`Le nombre ${nombre} est pair`);
//   }
    // if (nombre < 10 && nombre % 2 == 0) {
    //     console.log(`Le nombre ${nombre} est impair`);
    // } else{
    //     console.log(`Le nombre  ${nombre} est  pair`);
    // }
// }

// --------------------------------------------

// # Exercice 23

//   - Via l'utilisation d'une variable de type <b>tableau</b>, vous devrez réaliser un logiciel permettant à l'utilisateur d'entrer une <b>série de notes</b>, dont le nombre possible à entrer sera soit (au choix de l'utilisateur) :
//     - saisie avant la saisie de notes
//     - permissif et pourra aller jusqu'à entrer une note négative qui stoppera la saisie des notes.
//   - Une fois la <b>saisie des notes terminée</b>, l'utilisateur aura à sa disposition un <b>affichage</b> lui permettant d'avoir la <b>note max</b>, la <b>note min</b> ainsi que la <b>moyenne</b> (possible de faire un menu pour choisir)
//   - Pour les menus à choix, l'utilisation d'un switch est conseillée

// let notes = [];

// let nbNotes = Number(prompt("Saisir un nombre de notes à entrer :"));
// let maxNotes = 0;
// let minNotes = 20;
// let moyenne = 0;

// for (let i = 0; i < nbNotes; i++) {
//     let note = Number(prompt("Saisir des notes entre 0 et 20 :"))
//     if (note < 0) {
//         alert("Mauvaise saisie")
//     } else if(note >= 0 && note <= 20){
//         notes.push(note)
//     }else{
//         alert("Mauvaise saisie, veuillez réessayer")
//     }
//     if(note > maxNotes){
//         maxNotes = note
//     }
//     if(note < minNotes){
//         minNotes = note
//     }

//     let somme = 0
//     somme += notes[i]
//     moyenne /= notes.length
    
// }
// console.log(`La plus grande note est ${maxNotes}`);
// console.log(`La plus petite note est ${minNotes}`);
// console.log(`La moyenne des notes est de ${numAverage(moyenne)}`);
// console.table(notes);

