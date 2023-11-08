# Les bases du HTML

Le HTML (HyperText Markup Language) est le langage de balisage utilisé pour créer et structurer le contenu d'une page Web. Il s'agit d'une composante fondamentale du WWW permettant au créateur de site web de définir la structure et la présentation des informations affichées dans un navigateur.  
HTML fonctionne en utilisant un système de balises qui décrivent le type de contenu et sa mise en forme. 

## Notions clés

1. **Balises et éléments: (Tags & elements)**

En HTML, le contenu est structuré à l'aide de balises. Les balises sont des éléments entourés de chevrons angulaires (<>). Elles sont utilisées pour définir différents types de contenus tels que les titres, images, liens,...

Si je souhaite inclure des chevrons dans mon texte qui ne soient pas considérés comme une ouverture de balise HTML, je peux utiliser le caractère d'échappement `&` avec les suffixes `lt` *(lesser than)* ou `gt` *(greater than)*.

2. **Balises ouvrantes et fermantes: (opening tags and closing tags)**

La plupart des balises HTML ont une balise ouvrante et une balise fermante pourdélimiter le contenu qu'elles affectent. La balise fermante est différente de la balise ouvrante, la balise fermante a un slash (/) qui se ditue juste avant le nom de l'élément

```html
    <p>Ceci est un paragraphe</p>
```

3. **Balises orphelines ou auto-fermantes: (self_closing tags)**

Il existe cependant quelques exceptions, certaines balises n'ont pas besoin de contenir de texte, on les nomme balises auto-fermantes.  

```html
    <hr/> ou <hr>
    <br/> ou <br>
```

4. **Hierarchisation: (nesting)**

On peut imbriquer les balises les unes dans les autres pour créeer une structure hiérarchique.  
Les balises internes sont comtenues à l'intérieur des balises externes.

```html
    <ul>
        <li>Objet 1</li>
        <li>Objet 2</li>
        <li>Objet 3</li>
    </ul>
```

5. **Attributs:**

les balises peuvent avoir des attributs qui fournissent des informations supplémentaires sur l'élément. Les attributs sont toujours spécifiés à l'intérieur de la balise ouvrante.

```html
    <p title="Informations supplémentaires">Azerty</p>
```

6. **Structure de base:**

Une page HTMl de base commence généralement par une déclaration de type de document (`<!DOCTYPE>`) suivie d'une balise (`HTML`) qui va elle même contenir une balise `<head>` et `<body>`.

```html
    <!DOCTYPE html>
    <html lang="fr">
        <head></head>
        <body></body>
    </html>
```
Le HTML fournit la structure fondamentale d'une page, mais pour définir le style et le comportement, il est souvent utilisé en combinaison avec des langages tels que le CSS pour la mise en page et Javascript pour l'interaction dynamique avec les utilisateurs.

## Balises de base

<h1>Titrage (6 niveaux h1-> h6)</h1>
<p>Paragraphe</p>
<br />Retour à la ligne
<hr />Balise de séparateur

## Les balises de mise en forme

<b>Texte en gras</b> 
<i>Texte en italique</i> 
<u>Texte souligné</u>

On évitera d'utiliser ces 3 balises, on préférera appliquer le style en CSS.

<strong>Indique l'importance d'une partie de texte (gras)</strong>  

<em>Met l'emphase sur une partie du texte (le navigateur appliquera de l'italique)</em>  

<code>On peut entourer du code avec la balise code</code>
<pre>La balise <pre> est similaire à <code> mais elle conserve la mise en forme du texte, y compris les espacements et les sauts de ligne. Cela peut être utile si on a un code HTML bien formaté qu'on souhaite afficher tel quel.</pre>.

## Les liens et les ancres:

La balise `<a>` en HTML est utilisé pour créer des hyperliens, communément appelés liens hypertextes dans une page web.  
Les liens permettent aux utilisateurs de naviguer vers d'autres pages web, de télécharger des fichiers, d'envoyer des mails ou simplement naviguer à l'intérieur d'une même page.

### Syntaxe de base: 

```html
    <a href="https://www.example.com">Cliquez ici pour visiter example.com</a>
```

### Attributs courants de la balise `<a>`:

1. `href` : Cet attirbut spécifie l'URL de la destination vers laquelle le lien pointe. Il peut s'agir d'une URL absolue (https://) ou relative (par rapport à la page actuelle).

2. `target` : Cet attribut détermine comment la page liée sera affichée  
    - `_blank`: Ouvre le lien dans une nouvelle fenêtre ou un nouvel onglet du navigateur.
    - `_self`: Ouvre le lien dans la même fenêtre ou onglet.