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

4. **COmplexité des requêtes**
SQL excelle dans les requêtes complexes qui impliquent des relations entre de nombreuses tables. 
Le NoSQL va être plus approprié pour des requêtes courtes et simples sur des ensembles de données massifs.

Exemples d'utilisation:
SQL est souvent utilisé dans des applications où la structure des données est stable et bien définie comme les applications bancaires/financières, les systèmes de gestion de stocks...
NoSQL est couramment utilisé dans des applications nécessitant cette fameuse mise à l'échelle horizontale, telles que les réseaux sociaux, les applications de suivi en temps réel, les applications Big Data, etc...

## Introduction à Mongo DB
