# Introduction au CSS

## Qu'est-ce que le CSS ?

Le CSS (Cascading Style Sheet) est un lagnage de feuille de style utilisé pour décrire la présentation d'un document HTML. Il permet de contrôler l'apparence, la mise en page et le design des éléments HTMl sur une page web. 

## Pourquoi utiliser le CSS ?

- Séparation des préoccupations : Le CSS permet de séparer la structure HTML du style, ce qui améliore la maintenabilité et la réutilisation du code. 
- Contrôle visuel: Il offre un contrôle précis sur la couleur, la taille, la police, la mise en page et d'autres aspects visuels d'une page web contrairement au HTML.
- Adaptabilité: Le CSS permet de créer des designs réactifs pour s'adapter à différentes tailles d'écran et dispositifs. 


## La syntaxe de base du CSS

```css
    sélecteur{
        propriété :valeur;
    }
```

- Selecteur: Cible les éléments HTML auxquelson souhaite appliquer des styles.
- Propriété: Spécifie ce qu'on souhaite changer (ex: couleur texte).
- Valeur : Définit la valeur de la propriété (ex: red).

Si on souhaite transformer les titres h1, en texte rouge:

```css
    h1{
        color :red;
    }
```

## Insertions de style dans le HTML

### Inline CSS 

L'inline CSS consiste à définir directement les styles  dans l'élément HTML lui-même à l'aide de  l'attribut `style`.

<p style="color: #aaa000">Hello world</p>


### Internal CSS

Le style intégré consiste à incorporer les styles CSS dans l'en-tête de la page HTML à l'aide de la balise "style". 

```html
    <!DOCTYPE html>
        <html>
            <head>
                <style>
                    h1{
                        color :red;
                    }
                </style>
            </head>
            <body>
                <h1>Mon titre est en rouge</h1>
            </body>
        </html>
```

### External CSS

Le style externe consiste à placer des styles CSS dans un fichier séparé qui possède l'extension `.css`, puis à lier ce fichier à la page HTML à l'aide de la balise `<link>` dans l'en-tête (head) du HTML.

```html
    <!DOCTYPE html>
        <html>
            <head>
                <link brel="stylesheet" type="text/css" href="./styles.css">
            </head>
            <body>
                <h1>Mon titre est en rouge</h1>
            </body>
        </html>
```

## Sélecteurs et priorités

### Sélecteurs CSS

Les sélecteurs sont des motifs qui ciblent des éléments HTML spécifiques pour leur appliquer des styles. 

 - Sélecteurs de type (p, h1, div, ...).
 - Sélecteurs de classe (`.class`)
 - Sélecteurs d'identifiant (`#id`)
 - Sélecteurs de relation (` nav > a`, `div + p`)


<hr>

 ### Priorités

Lorsqu'on utilise plusieurs règles pour styliser un élément HTML, il est essentiel de comprendre comment la priorité des styles est déterminée.  
3 facteurs :

#### Facteur d'importance
L'importance des styles est évaluée en fonction de leur origine. Voici comment l'importance est classée de la plus élevée à la plus faible:  

- `!important`: Les règles CSS qui utilisent !important ont la priorité absolue, elles seront appliquées même si d'autres styles sont déclarés après.  

```css
    h1{
        color :red !important;
    }
```

- `style`: Les styles inline (définis directement dans l'élément HTML) ont une priorité plus élevée que les autres styles. 

- Styles intégrés au document: Vient ensuite le style injecté en interne dans l'en-tête (head).

- Styles dans un fichier CSS externe: Ils sont moins prioritaires que les deux précédents.

#### Spécificités de sélecteur

La spécificité du sélecteur détermine laquelle des règles CSS est appliquée lorsque plusieurs règles ciblent le même élément.

- **Sélecteur d'identifiant**: Chaque identifiant ciblé dans le sélecteur ajoute 100 points de priorité à la spécificité.

- **Sélecteur de classe**: Chaque classe ciblée dans le sélecteur ajoute 10 points de spécificité.

- **Sélecteur de type**: Chaque élément HTML ciblé dans le sélecteur de type a une spécificité de base de 1. 

- **Sélecteur de relation**: Les sélecteurs de relation tels que ( > (enfant direct) ou + (voisin direct)) n'affectent pas directement la spécificité.

```css
    p{
        color :blue;
    }

    p#unique{
        color :green;
    }

    p.special{
        color :red;
    }

 => Couleur verte appliquée
```

#### Ordre de déclaration

Si deux règles ont strictement la même importance et la même spécificité, l'ordre de déclaration détermine quelle règle sera appliquée. C'est la règle déclarée en dernier dans le code qui l'emporte. 

```css

    p{
        color :green;
    }

    p{
        color :red;
    }

 => Couleur rouge appliquée
```

En comprennant ces 3 aspects de la priorité des styles, on peut résoudre plus facilement les conflits de style et garantir que les pages web s'affichent correctement. 

### Les pseudos-classes

Les pseudos-classes en CSS sont des sélecteurs spéciaux qui permettent de cibler les éléments HTML en fonction de leur état ou de leur position dabs la structure ou document. Elles sont précédées des deux points (`:`) dans les règles CSS.

#### Les pseudos-classes de base

1. **:hover**: Cette pseudo-classe permet de cibler un élément lorsque la souris le survole (ex: changement de couleur d'un lien lorsque la souris survole le lien).

2. **:active**: Cette pseudo-classe cible un élément au moment où il est activé, généralement lorsque l'utilisateur clique dessus. On peut l'utiliser après un effet de clic visuel. 

3. **:focus**: Cible un élément lorsqu'il obtient un focus, généralement après avoir été cliqué ou lors de la navigation au clavier. Il est couramment utilisé pour styliser les champs de formulaire lorsqu'ils sont sélectionnées.

#### Les pseudos-classes de lien

1. **:link**: Cible les liens non visités, les liens vers lesquels le l'utilisateur n'a pas encore navigué.

2. **:visited**: Cible les liens déjà visités par l'utilisateur.

