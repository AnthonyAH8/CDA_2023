# Les tableaux et les boutons en HTML

## Les tableaux

Pour construire un tableau, il faut une balise `<table> </table>`. A l'intérieur de cette balaise, il faut spécifier le nombre de lignes que comporte le tableau à l'autre de `<tr> </tr>`

```html
        <table>
            <tr></tr>
            <tr></tr>
            <tr></tr>
            <tr></tr>
        </table>
```

A l'intérieur de ces lignes, on peut placer des en-têtes (headers) avec `<th>` ou des données simples avec `<td>`

```html
        <table>
            <tr>
                <th>Header 1</th>
                <th>Header 2</th>
            </tr>
            <tr>
                <td>Data 1</td>
                <td>Data 2</td>
            </tr>
            <tr>
                <td>Data 3</td>
                <td>Data 4</td>
            </tr>
            <tr></tr>
        </table>
```

Pour le référencement et pour un code plus solide et lisible, on précise grâce aux balises `<thead>, <tbody> et <tfoot>` l'organisation du tableau.

```html
        <table>
            <thead>
                <tr>
                    <th>Header 1</th>
                    <th>Header 2</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>Data 1</td>
                    <td>Data 2</td>
                </tr>
                <tr>
                    <td>Data 3</td>
                    <td>Data 4</td>
                </tr>
            </tbody>
        </table>
```

On peut rajouter un titre au tableau avec la balise `<caption>` après la balise `<table>`.   
Au niveau des attributs, on peut rajouter des attributs de style, mais on évitera de le faire si on utilise du CSS:  
    - `border= "taille_en_px"` (bordure)  
    - `width= "taille_en_px"` (longueur)  
    - `height= "taille_en_px"` (hauteur)  
    - `align= "left, right ou center"` (alignement)  

Si on veut que l'une de nos données prenne plus d'une ligne ou de colonne, on lui appliquera l'attribut `rowspan="nombre"` ou `colspan="nombre"`. 

## Les boutons

Pour créer un bouton en HTML, il faut utiliser une balise `<button>`.  
Il est intéressant de spécifier le type de bouton, grâce à l'attribut `type`:
    - `<button type= "button>` : Il s'agit d'un bouton classique. C'est le choix par défaut si le choix n'est pas spécifié.
    - `<button type= "submit>"` : Utile uniquement au sein d'un formulaire, il envoie le formulaire.
    - `<button type= "reset>"` : Utile également au sein d'un formulaire, il réinitialise les champs de ce formulaire.

Si on veut désactiver un bouton, on lui met l'attribut `disabled`. 