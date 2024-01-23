# Node Package Manager (NPM) dans Node.js

## Qu'est-ce que NPM ?

NPM est le gestionnaire de paquets officiel pour Node.js, le moteur JS côté manager. Il permet au développeur d'installer, de partager et de gérer les dépendances des projets Node.js de manière efficace.

## Installation de Node.js et NPM

En installant Node.js, NPM est automatiquement inclus. Node peut être téléchargé à partir du site officiel et une fois installé, NPM est prêt à être utilisé.
On peut vérifier les versions installées à l'aide des commandes `node -v` et `npm -v`.

## Gestion de dépendances

NPM simplifie la gestion des dépendances en permettant aux développeurs d'installer des bibliothèques tierces (packages) nécessaires à leurs projets.
Les dépendaces sont répertoriées dans le fichier `package.json` et NPM les installe de manière hiérarchique dans le répertoire `node_modules`.

## Initialisation du projet

En utilisant la commande NPM init, on peut créer un fichier `package.json` interactivement où ils spécifient des détails tels que le nom du projet, la version, les auteurs, etc.

## Installation de packages

Les packages peuvent être installés localement pour un projet spécifique ou globalement pour une installation globle en utilisant la commande `npm install`.

- Local : `npm install <nom du package>`
- Global : `npm install -g <nom du package>`

Les packages installés globalement peuvent entraîner des problèmes de compatibilité entre les différentes versions du projet car tous les projets utilisent la même instance du package global. Par conséquent, il est généralement recommandé de préférer l'utilisation locale pour les dépendances spécifiques à un projet et l'utilisation globale pour les outils généraux.

## Utilisation des scripts

NPM permet la définition de scripts dans le fichier `package.json`. Ces scripts peuvent être exécutés avec la commande `npm run <nom_du_script>`.
- Exemple: `"scripts": {"start": "node index.js"}`

## Gestion des versions 

NPM facilite la gestion des versions de paquets. Les développeurs peuvent spécifier des versions exactes ou utiliser des modificateurs comme '^' ou '~' pour gérer les mises à jour.

## Publication de packages :

Les développeurs peuvent partager leurs propres packages avec la communauté en les publiant sur le registre public de NPM avec la commande `npm publish`.

## Cotrôle d'accès

NPM offre des fonctionnalités de contrôle d'accès pour les packages privés, permettant aux entreprises de gérer l'accès à leurs modules.

## Et le package lock ?

Le fichier `package-lock.json` est un fichier généré par NPM qui enregistre l'état exact des dépendances d'un projet Node.js à un moment donné. 

1. Reproductibilité des installations: le `package_lock.json` garantit la reproductibilité des installations en enregistrant les versions exactes des dépendances installées, y compris les sous-dépendances. Cela signifie qu'à chaque fois que quelqu'un d'autre ouvre ou installe les dépendances du projet, les versions spécifiées seront utilisées, assurant une cohérence entre les environnements de développement. 

2. Eviter les mises à jour inattendues: Sans le package_lock, npm pourrait installer des versions plus récentes des dépendances lors de l'installation, même si on a spécifié des plages de versions dans le fichhier package-lock. Il s'assure que les versions exactessoient respectées, évitant ainsi les MAJ inattendues.

3. Sécurité : EN enregistrant les versions exactes des dépendances et de leurs sous-dépendances, le package-lock contribue à la sécurité du projet en évitant les vulnérabilités potentielles liées à l'utilisation de versions non spécifiées.

4. Accélération des intallations : Le package-lock permet d'accélérer les installations en évitant de rechercher les versions des dépendances à chaque installation. Les versions sont déjà répertoriées dans le fichier, ce qui accélère le processus d'installation. 

Pour générer ou mettre à jour le package-lock.json, on peut utiliser la commande `npm install`.

=> Le package-lock doit être inclus dans GIT pour assurer une cohérence entre les membres de l'équipe.

Pour installer les modules en tenant compte le package-lock, on peut utiliser la commande `npm ci`.