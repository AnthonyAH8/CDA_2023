# LE NoSQL

## Introduction

Le terme NoSQL (Not Only SQL) fait référence à une classe de système de GBD qui diffèrent des BDD relationnelles traditionnelles. 
Les DBB NoSQL sont conçues pour répondre à des besoins spécifiques, tels que la gestion des grandes quantités de données non structurées ou semi-structurées, la mise à l'échelle horizontale facile, la flexibilité de schéma et une meilleure performance dans certains scénarios. 

Les caractéristiques générales des BDD NoSQL incluent:

- **Schéma flexible**: Elles permettent de stocker des données sans avoir à définir un schéma fixe à l'avance. Cela offre une flexibilité accrue pour traiter particulièrement les données évolutives ou diverses. 

- **Evolutivité horizontale**: Elles sont conçues pour évoluer facilement en ajoutant de nouveaux serveurs au lieu d'augmenter les ressources d'un serveur existant. Cela falicite la gestion de volumes de données massives. 

- **Gestion de données non-structurées ou semi-structurées**: Les BDD NoSQL peuvent gérer des types de données variés, tels que les documents, des paires clé-valeurs, des graphiques ou des colonnes offrant une flexibilité accrue par rapport aux BDDR qui sont basées sur un modèle tabulaire. 

- **Haute performance dans des cas spécifiques**: Les BDDNR peuvent offrir des performances supérieures à celles des BDDR, en particulier lorsqu'il s'agit de lectures ou d'écritures parallèles. 

## SQL ou NoSQL ?

Voici quelques critères à considérer lors du choix entre SQL et NoSQL:

1. **Structure de données**
Utiliser SQL si les données sont principalement tabulaires et interconnectées avec des relations complexes. 
Utiliser NoSQL si on a besoin d'un schéma flexible.

2. **Schémas**
SQL a un schéma strict où la structure doit être définie à l'avance. Les modifications de schéma d'ampleur peuvent être difficiles.
En NoSQL, on peut ajouter de nouveaux champs sans avoir à définir un schéma rigide à l'avance.

3. **Transactions ACID**
Si la priorité est la cohérence des données et ma garantie des transactions, SQL peut être le choix approprié.
Le NoSQL, en particulier sous la forme clé-valeur, va sacrifier les propriétés ACID pour améliorer la performance et l'évolutivité.

4. **Complexité des requêtes**
SQL excelle dans les requêtes complexes qui impliquent des relations entre de nombreuses tables. 
Le NoSQL va être plus approprié pour des requêtes courtes et simples sur des ensembles de données massifs.

Exemples d'utilisation:
SQL est souvent utilisé dans des applications où la structure des données est stable et bien définie comme les applications bancaires/financières, les systèmes de gestion de stocks...
NoSQL est couramment utilisé dans des applications nécessitant cette fameuse mise à l'échelle horizontale, telles que les réseaux sociaux, les applications de suivi en temps réel, les applications Big Data, etc...

## Introduction à Mongo DB

MongoDB est une BDD NoSQL (Not Only SQL) la plus populaire orientée document, conçue pour stocker, interroger et gérer des données de manière flexible et scalable. 

**1.Modèle de données** 

MongoDB stocke les données sous forme de documents en format BSON (Binary JSON), très similaire au JSON. Chaque document peut contenir des champs de différents types et la structure des documents peut varier d'un enregistrement à l'autre.

**2.Collections et documents** 

Les documents MongoDB sont regroupés dans des collections, qui sont équivalentes à des tables dans le monde des BDDR. Cependant, contrairement aux tables SQL, les collections ne nécessitent pas un schéma fixe.

**3.Langage de requête** 

MongoDB utilise un langage de requête appelé MongoDB Query Language (MQL) pour interagir avec la BDD. Les opérations de lecture, écriture, mise à jour et suppression sont effectuées à l'aide de commandes MongoDB.

**4.Indexation** 

MongoDB prend en charge l'indexation de données, ce qui permet d'accélérer les opérations de recherches en créant des index sur des champs fréquemment utilisés. Cela contribue à améliorer les performances de requêtes. 

**5.Evolutivité** 

MOngoDB est conçu pour l'évolutivité horizontale, ce qui signifie qu'il est facile d'ajouter de nouveaux serveurs pour gérer des charges de travail croissantes. Cela le rend adapté aux applications nécessitant une mise à l'échelle dynamique.

## JSON ou BSON ?

JSON est un format de sérialisation de données en texte lisible par l'homme. 
BSON est sa version binaire étendue, spécialement conçue pour MongoDB, offrant une éfficacité de stockage accrue avec des types de données supplémentaires. MongoDB utilise BSON comme stockage de format natif.

En raison de sa représentation binaire, JSON est plus compact et offre une meilleure eficacité en terme de stockageet de traitement. 

## Collections et documents

**1.Structure**

    - Document: Un document MongoDB est une unité de stockage de données au format BSON. Il est similaire à un objet JSON et peut contenir des paires clés-valeur, des tableaux ainsi que d'autres documents imbriqués.

    - Collection: Une collection MongoDB est un ensemble de documents. Contrairement à une table, elle n'a pas de schéma fixe, chaque document peut avoir une structure différente.

**2.Propriétés**

    - Identifiant unique (id) : Chaque document a un champ spécial appelé '_id' qui doit être unique au sein de la collection. Il peut être généré automatiquement ou spécifié manuellement.

    - Collections sans schéma fixe: Les collections ne nécessitent pas de dclaration de schéma à l'avance. 

## Opérations CRUD dans MongoDB Compass

**1.Insertion (Create)**

Sélectionner la base de données et la collection
Cliquer sur le bouton 'Add Data' >> 'Insert Document'
Saisir les valeurs du nouveau document

**2.Lecture (Read)**

Sélectionner la collection dans Compass.
Utiliser l'interface graphique pour construire des requêtes de recherche avec des filtres.

**3.Mise à jour (Update)**

Au sein de la collection, il faut utiliser le bouton 'Edit' à droite de chaque document.

**4.Suppression (Delete)**

Utiliser le bouton delete pour supprimer un ou plusieurs documents.

## Les filtres

Les filtres dans MongoDB sont utilisés pour spécifier des critères de recherche lors des opérations de lecture et des opérations de suppression et de mise à jour. 
Les filtres permettent de restrindre les résultats en fonction de conditions spécifiques.

**1.Opérateurs de comparaison**

`$eq`= égal  
`$ne`= différent  
`$gt`= supérieur à  
`$lt`= inférieur à  
`$lt`= inférieur à  
`$lte`= inférieur ou égal à  
`$gte`= supérieur ou égal à

```javascript
{first_name: {$eq: 'Jean'}}
```

**2.Opérateurs logiques**

`$and`, `$or`, `$not` sont utilisés pour combiner des conditions.

```javascript
{$and: [{date_of_birth: {$eq: '1998-01-01'}}, {first_name: 'Jean'}]}
```

**3.Opérateurs d'éléments**

Les opérateurs d'éléments tels que 'exists' et 'type' permettent de filtrer les documents en fonction de la présence ou du type d'un champ.

**4.Opérateurs d'éléments dans un tableau**

`$in`, `$nin`, `$all` sont utilisés pour effectuer des requêtes dans des tableaux

```javascript
{first_name: {$in: ["Jean", "Toto"]}}
```

**5.Opérateurs de recherche de texte**

L'opérateur `$text` est utilisé pour effectuer des recherches de texte dans les champs textuels indexés.

**6.Opérateurs d'expressions régulières**

L'opérateur `$regex` permet d'appliquer des expressions régulières dans les filtres.

```javascript
{first_name: {$regex: /^J/}}
```