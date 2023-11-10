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

1. **:hover** : Cette pseudo-classe permet de cibler un élément lorsque la souris le survole (ex: changement de couleur d'un lien lorsque la souris survole le lien).

2. **:active** : Cette pseudo-classe cible un élément au moment où il est activé, généralement lorsque l'utilisateur clique dessus. On peut l'utiliser après un effet de clic visuel. 

3. **:focus** : Cible un élément lorsqu'il obtient un focus, généralement après avoir été cliqué ou lors de la navigation au clavier. Il est couramment utilisé pour styliser les champs de formulaire lorsqu'ils sont sélectionnées.

#### Les pseudos-classes de lien

1. **:link**: Cible les liens non visités, les liens vers lesquels le l'utilisateur n'a pas encore navigué.

2. **:visited**: Cible les liens déjà visités par l'utilisateur.

### Les pseudo-classes de position

1. **:first-child** : On va cibler le premier élément enfant par rapport à un parent. On ppeut l'utiliser pour ajouter des styles spéciaux au premier élement d'une liste par exemple. 

2. **:last-child** : Utilise le dernier élément enfant d'un parent. 

3. **: nth-child(*n*)** : On va mettre l'enfant qu'on va cibler en fonction de sa position définie entre parenthèses. On peut utiliser des formules comme `nth-child(odd)` ou `nth-child(even)`.

### Les pseudo-classes de formulaires

1. **:checked** : Cible les élements d'entrée (comme les cases à cocher ou les boutons radio) qui sont cochés ou sélectionnés.

2. **:disabled** : Cible les éléments d'entrée qui sont désactivés.


## Les propriétés CSS

Le CSS offre un large éventail de propriétés pour contrôler l'apparence et la mise en page des éléments HTML. Voici quelques unes des propriétés les plus utilisées.

### Les propriétés de texte

1. **`font-family` :** Cette propriété permet de spéciafier la faimille de police utilisées pour afficher du texte dans un élément HTML. Elle peut être définie avec une liste de nom de police, séparés par des virgules, pour spécifier des alternatives en cas d'indisponibilité de la première police.

2. **`font-size`**: Cette propriété détermine la taille de la police utilisée pour le texte à l'intérieur d'un élément. Elle peut être définie en pixels (px), points (pt), en pourcentage (%), ou d'autres unités de mesures (em, rem).

3. **`font-weight` :** Cette propriété détermine l'épaisseur de la police utilisée pour le texte à l'intérieur d'un élément. Elle peut être définie avec des valeurs telles que `normal`, `bold`, `bolder`, `lighter`, ou des numériques pour des épaisseurs spécifiques.

4. **`font-style` :** Cette propriété permet de définir le style de la police, tel que `normal` (par défaut), `italic`, ou `oblique`.

5. **`color` :** Cette propriété définit la couleur du texte à l'intérieur d'un élément HTML. Vous pouvez utiliser des noms de couleurs, des codes hexadécimaux, ou des valeurs `rgb` pour définir la couleur.

6. **`line-height` :** La propriété `line-height` contrôle la hauteur de ligne, c'est à dire l'espace vertical entre les lignes de texte. Elle peut être définie en tant que valeur numérique ou en pourcentage de la taille de la police. Sa valeur de base est 1.2, on privilégiera une taille entre 1.5 et 1.7 pour une lecture confortable.

7. **`text-align` :** Cette propriété règle l'alignement horizontal du texte à l'intérieur de son parent. Les valeurs courantes sont `left`, `right`, `center` et `justify`.

8. **`text-transform` :** Cette propriété permet de modifier la casse du texte. Vous pouvez l'utiliser pour mettre en majuscules (`uppercase`), en minuscules (`lowercase`), ou pour capitaliser la première lettre de chaque mot (`capitalize`).

9. **`text-decoration` :** Cette propriété contrôle la décoration du texte, telle que les soulignements (`underline`), les surlignements (`overline`), et les mots barrés (`line-through`). Elle peut également être utilisée pour supprimer ces décorations si elles sont mises par défaut en mettant la valeur `none`.


### Les propriétés de mise en page
#### Le box-model

Le box model déctrit comment les éléments HTML sont rendus visuellement dans une page. Ler modèle de page divise chaque élément HTML en plusieurs parties, comme la taille, la marge, la bordure, le rembourrage et le contenu de l'élément.

1. **Le contenu (content)** :

C'est la zone intérieure de l'élément où le contenu réel comme du texte ou des images est affiché. La taille du contenu est déterminée par les propriétés de largeur (width) et de hauteur (height) en CSS.
    - `width`
    - `height`

2. **Remourrage (padding)**: 

Le rembourrage est la partie de transition entre le contenu et la bordure de l'élément. 
 - `padding`

3. **Bordure (border)**: 

La bordure constitue les limites de la boîte. Elle entoure donc le rembourrage de l'élément (ou le contenu directement s'il n'y a pas de rembourrage)

- `border-width`: Définit la largeur de la bordure
- `border-style`: Définit le style de la bordure comme solid (plein), dashed (traits pointillés), dotted (pointillés), double (double bordure)...
- `border-color`: Définit la couleur de la bordure
- `border`: Réunit les 3 commandes précédentes en une seule (border: 1px solid #000)
- `border-radius`: Définit les rayons des coins de l'élément. On peut spécifier un rayon unique pour tous les coins ou des reyons individuels pour chaque coin. 

4 **Marge (margin)**

C'est l'espace autour de la bordure de l'élément, qui sépare cet élément des autres éléments voisins
- `margin`

5. **Largeur totale (total width)**:

C'est la taille totale de l'élément qui compren le contenu, le rembourrage, la bordure et la marge. Elle est calculée en cumulant la largeur de l'ensemble des éléments. 

6. **Autres proriétés**:

- `box-sizing`: Elle permet de définir comment la largeur et la hauteur de l'élément sont calculés. La valeur par défaut est "content-box", ce qui signifie que la largeur et la hauteur ne tiennent compte que du contenu, excluant la padding et la bordure. On peut à la place utiliser "border-box" pour que la largeur et la hauteur tiennent compte du padding et de la bordure. 
- `outline`: Définit un contour autour de l'élément. Contrairement à la bordure, l'outline n'affecte pas la mise en page et ne prend pas d'espace supplémentaire. 
- `box-shadox`: Ajoute une ombre à l'élement, créant un effet de profondeur ou de miseen évidence. 

Le box model est essentiel pur comprendre comment les éléments HTML sont dimensionnés et espacés les uns par rapport aux autres sur une page web. 

### Propriétés de fond

Ces propriétés CSS permettent de personnaliser complètement l'arrière plan d'un élément HTML, en définissant la couleur, l'image, la répétition, sa position, sa taille,... en fonction des besoins de conception.

1. **`background-color`**: Définit la couleur de l'arrière plan d'un élément.

2. **`background-image`**: Définit une image d'arrière plan à utiliser.
    exemple: `backgroud_image:url("./ex.jpg)`

3. **`background-size`**: Permet de définir la taille de l'image de fond. On peut spécifier des dimensions en pixels, en pourcentage ou utiliser des valeurs spéciales comme "cover" (pour couvrir tout l'élément) ou "contain" (pour s'assurer que l'image s'adapte entièrement sans être coupé). 

4. **`background-repeat`**: Contrôle la répétition de l'image par défaut. Les valeurs courantes sont "repeat" (répétition par défaut), "no-repeat" (pas de répétition) et "repeat-x" ou "repeat-y" pour une répétion sur un axe précis.

5. **`background-position`**: Détermine la position initiale de l'image de fond par rapport à son élément. On peut utiliser des valeurs fixes comme "top", "bottom", "left", "right" ou des coordonnées ("50% 25%").

6. **`background-attachement`**: Détermine si l'image de fond défile avec le contenu de l'élément lorsqu'on scrolle. Les valeurs courantes sont "scroll" (défilement normal") et "fixed" (l'image reste en place alors que le reste défile). 

### Contrôles de flux de page (display)

La propriété display détermine comment un élément HTML est rendu dans la misen epage d'une page web. Elle contrôle le comportement de rendu, tel que le fait de rendre un élément sous forme de bloc, de ligne, de grille, de flex... Le choix de la valeur influence la façon dont interagit l'élément avec d'autres éléments et comment il occupe l'espace de la mise en page.

1. **`display:block`**

L'élément est rendu comme un bloc de niveau. Par défaut, il occupe toute la largeur disponible et commence sur une nouvelle ligne.  
La hauteur, la largeur, la marge, le padding et la bordure peuvent être définis.

2. **`display:inline`**

L'élément est rendu comme une ligne de texte, il ne commence pas sur une nouvelle ligne et il occupe seulement l'espace nécessaire à son contenu.  
La hauteur, la largeur, la marge, le padding et la bordure ne peuvent pas être définis.

3. **`display:inline-block`**

L'élément est rendu comme une ligne de texte, il ne commence pas sur une nouvelle ligne et il occupe seulement l'espace nécessaire à son contenu.  
La hauteur, la largeur, la marge, le padding et la bordure peuvent être définis.

4. **`display:none`**

L'élément est complètement masqué et ne prend pas d'espace dans la mise en page.

5. **`display:flex`**

L'élément devient un conteneur flexible, permettant de créer des mises en page responsive en utilisant les propriétés associées au flex.

6. **`display:grid`**

L'élément devient un conteneur de grille, permettant de créer des mise en page basées sur une grille en utilisant des propriétés associées.


Ces valeurs de la prorpiétés display sont essentielles pour contrôler la mise en page et la présentation des éléments HTML dans une page web, en leur donnant différents comportements de rendu en fonction des besoins de conception.  