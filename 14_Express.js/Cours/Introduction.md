# Express.js

## Introduction

### Qu'est-ce qu'Express.js ?

Express.js est un framwork web minimaliste, rapide et flexible, conçu pour simplifier le développement d'application web et d'API avec Node.js. Il fournit une structure légère mais puissante pour construire des applications robustes et scalables en utilisant JavaScript côté serveur.

### Principales caractéristiques

**Minimalisme:** Express adopte une approche minimaliste, laissant aux développeurs la liberté de choisir et d'intégrer des modules tiers selon leurs besoins spécifiques.

**Middleware:** Un concept clé d'Express est l'utilisation de middleware. Ces fonctions interviennent dans le cycle de vie des requêtes, permettant de gérer dees tâches telles que l'authentification, la gestion des sessions, la compression, etc. 

**Routage:** Express simplifie la définition des routes et la gestion des requêtes HTTP, facilitant la création des points d'entrée pour différentes parties de l'application.

**Templates:** Express supporte divers moteurs de template pour la génération dynamique de contenu HTML tels que EJS, HandeBars ou Pug (Jade).

**Gestion des erreurs:** Express fournit des mécanismes efficaces pour la gestion des erreurs, facilitant le débogage et l'amélioration de la robustesse des applications.

**RESTful Routing:** Encourage la conception d'API RESTful facilitant la création de routes pour les opérations CRUD.

L'application d'Express repose sur les fonctionnalités offertes par Node.js, notamment la gestion des requêtes HTTP, la manipulation des évènements et le modèle non bloquant. Par conséquent, il n'est pas possible d'utiliser Express en dehors de l'écosystème Node.js.

### Express.js & Node.js

**Node.js** est un environnement qui permet d'utiliser le langage javascript côté serveur, ce qui est traditionnellement réservé aux navigateurs.
Ce principe rapide et évolutif, capable de gérer les opérations asynchrones permettra de mettre en place le framework express.js.
Le fait d'utiliser Node permet plusieurs avantages essentiels côté serveur:

- Equivalence de langage : Node.js permet l'utilisation du même langage pour le développement des 2 côtés, client et serveur, simplifiant la synchronisation et le partage de code entre les deux.

- Modularité : Node necourage l'utilisation de modules permettant aux développeurs de construire des applications modulaires, faciles à maintenir et à étendre.

- Asynchronisme: Utilise des opérations asynchrones non bloquantes, ce qui le rend adapté aux applications nécessitant une manipulation simultanée de nombreuses connexions. 

- Scalabilité : Conçu pour être évolutif horizontalement, permettant de gérer efficacement un grand nombre de connexions simultanées.

- Applications en temps réel: Ecellente prise en charge des applications en temps réel, telles que les chats en direct, les jeux en ligne et les tableaux de bord suivi en temps réel. 

Bien entende, Express.js n'est pas le seul framwork dans le développement web qui repose sur Node.js (Kao.js, Hapi.js, Nest.js, Adonis.js).

### Feuille de route: commancer avec Express.js

1. ***Installation***

Utiliser npm pour installer Express dans le projet: `npm install express`

2. ***Création d'une application Express***

Initialiser une application Express avec quelques lignes de code:

```js
const express = require('express');
const app = express();

app.get('/', (req, res) => {
    res.send('Hello World')
});

app.listen(3000, () => {
    console.log('Serveur is running on port 3000')
})
```

3. ***Middleware et routage***

Utiliser le middleware pour gérer les requêtes et définir des routes pour structurer l'application.

4. ***Templates et vues***

Intégrer un moteur de template pour générer du contenu dynamique.

5. ***Extension avec d'autres modules***

Explorer et ajouter des modules supplémentaires en fonction des besoins du projet. 