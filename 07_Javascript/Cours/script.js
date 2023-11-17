// Interaction:
// alert("Coucou")

// Console:
// console.log("Hello")
// console.error("Hello")
// console.warm("Hello")
// console.info("Hello")
// console.clear()
// console.log("%cHello", "font-size: 32px; background-color: chartreuse;");

// Variables
// var maVariable = "Salut !"
// maVariable = 42;
// console.log(maVariable)

// Constante
// const PI = 3.14159;
// PI = 3.14; Erreur car la constante a déjà été définie
// console.log(PI)

// let
// let maVariableLet;
// console.log(maVariableLet); // Non définie //
// maVariableLet = "Salutations";
// console.log("Type de ma variable : " + typeof maVariableLet + ".")
// maVariableLet = 32 ;
// console.log("Type de ma variable : " + typeof maVariableLet + ".")
// let str = "Chaîne de caractère"
// console.log("Type de ma variable : " + typeof str + ".");
// let nbr = 15
// console.log("Type de ma variable : " + typeof nbr + ".");
// let bool = true
// console.log("Type de ma variable : " + typeof bool + ".");
// let bigint = 10n
// console.log("Type de ma variable : " + typeof bigint + ".");
// let maVariableNull = null
// console.log("Type de ma variable : " + typeof maVariableNull + ".");

// let maValeur;
// maValeur = prompt("Tapez une valeur : ")
// console.log("Type de ma variable : " + typeof maValeur + ".")
// console.log(`Type de ma variable : ${typeof maValeur}` )


// ------------------------------------------------------------------------

// let nb1 = 10, nb2 = 65 , result

// Addition
// result = nb1 + nb2
// console.log(nb1 + "+" + nb2 + "="  + result)

// Soustraction
// result = nb2 - nb1
// console.log(`${nb2} - ${nb1} = ${result}`)

// Multiplication
// result = nb1 * nb2
// console.log(`${nb1} * ${nb2} = ${result}`)

// Division
// result = nb2 / nb1
// console.log(`${nb2} / ${nb1} = ${result}`)

// Modulo
// result = nb2 % nb1
// console.log(`${nb2} % ${nb1} = ${result}`)

// Puissance
// result = nb1 ** nb2
// console.log(`${nb1} ** ${nb2} = ${result}`)

// -------------------------------------------------

// Incrementation

console.log("Les opérateurs d'incrémentation et combinés")

// Incrementation
nb1 = nb1 + 1 // Incrementation classique
console.log(" nb1 vaut : "+ nb1); // 11
// operateur combiné +=
nb1 += 1
console.log(" nb1 vaut : "+ nb1); // 12
// operateur d'incrementation
console.log(nb1++); // 12
console.log(" nb1 vaut : "+ nb1); // 13


// Decrementation
nb1 = nb1 - 1 // Incrementation classique
console.log(" nb1 vaut : "+ nb1); // 12
// operateur combiné -=
nb1 -= 1
console.log(" nb1 vaut : "+ nb1); // 11
// operateur d'incrementation
console.log(nb1--); // 11
console.log(" nb1 vaut : "+ nb1); // 10

console.log("Détail operateurs -- et ++")

// Précision pour les Operateurs ++ et --
console.log(nb1); // 10
// Incrementation puis lecture de la valeur (préincrementation)
console.log(++nb1); // 11
// Decrementation puis lecture de la valeur (predecrementation)
console.log(--nb1); // 10
// lecture de la valeur puis => incrementation (postincrementation)
console.log(nb1++); // 10
console.log(nb1); // 11
// lecture de la valeur puis => decrementation (preincrementation)
console.log(nb1--); // 11
console.log(nb1); // 10