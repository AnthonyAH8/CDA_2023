const BASE_URL = "https://pokeapi.co/api/v2/"
const ID = document.getElementById("IDPokemon")
const pokemonName = document.getElementById("name")
const pokemonHeight = document.getElementById("height")
const pokemonWeight = document.getElementById("weight")
const pokemonAbilities = document.getElementById("abilities")
const pokemonPicture = document.getElementById("pokemonImage")

function listPokemon(data){
    return{
        photo: data.front_default,
        id: data.id,
        username: data.name,
        height: data.height,
        weight: data.weight,
        types: data.types,
        abilities: data.abilities
    };
}

async function getPokemon(name){
    const answerRequest = await fetch(BASE_URL + "pokemon/" + name);
    const data = await answerRequest.json();
    return data
}

const pokemon = await getPokemon("ditto")
const search = [pokemon].map(listPokemon)
console.log(search)

pokemonPicture.textContent = search[0].photo
ID.textContent = search[0].id
pokemonName.textContent = search[0].name
pokemonHeight.textContent = search[0].height
pokemonWeight.textContent = search[0].weight
pokemonAbilities.textContent = search[0].abilities

// # Exercice 34

// Réaliser un programme permettant d'exploiter les fonctionnalités de l'API PokéAPI disponible à cette adresse: 

// ```text
// https://pokeapi.co/
// ```

// Le programme devra permettre plusieurs fonctionnalités:
// * Permettre de chercher un pokémon via son nom
// * Permettre de chercher un pokémon via son numéro de pokédex nationnal (son id)
// * Permettre de visualiser les informations principales du pokémon (Son nom, son poids, sa taille, ses types, ses capacités et son numéro de pokédex nationnal)
// * Il devra être possible de passer directement au pokémon suivant ou précédent dans le pokédex (aller du #27 au #28 par exemple). Cette fonctionnalité devra vérifier si l'on est déjà au premier ou au dernier pokémon afin d'éviter de chercher un pokémon non existant


// --- BONUS (pour les tryhards) ---

// * Il devra être possible de pouvoir accéder à la liste des pokédex de génération, d'en sélectionner un pour ensuite se voir proposer directement les pokémon de cette génération
// * Il devra être possible, au sein de l'affichage, de se voir proposer les évolutions du pokémon actuel
// * Il devra être possible de cliquer sur les types ou les capacités du pokémon pour se voir proposer un listing des pokémon possédant ce type ou cette capacité