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
<pre>La balise <pre> est similaire à <code> mais elle conserve la mise en forme du texte, y compris les espacements et les sauts de ligne. Cela peut être utile si on a un code HTML bien formaté qu'on souhaite afficher tel quel.</pre>.</pre></code>

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

### Les liens internes

La balise `a` peut également être utilisée pour créer des liens internes à une même page, généralement pour permettre aux utilisateurs de sauter vers différentes parties de la page.  
Pour cela, on va relier notre base `a` à un identifiant:

```html
    <a href="#section2"> Aller à la section 2</a>


    <h2 id="section2">Section 2</h2>
```

### Autres utilisations

1. **Téléchargememnt de fichiers**

L'attribut `download` indique au navigateur que le lien doit être téléchargé au lieu d'être affiché

```html
    <a href="./mon-fichier.pdf"> Télécharger le fichier PDF</a>
```

2. **Liens pour courriel**

Pour envoyer vers un courriel, on spécifie dans le chemin `mailto`

```html
    <a href="mailto:contact@example.com">Envoyer un email</a>
```

### Conseils:

- Il faut s'assurer que les liens soient clairs et descriptifs pour les utilisateurs.
- Bérifier que les URLS soient valides et fonctionnels.
- Ajouter des attributs title pour fournir un texte alternatif (accessiblité) lorsque le texte du lien n'est pas suffisamment descriptif.

La balise `a` est l'un des élements les plus importants pour la navigation et l'interaction dans une page web, elle offre de nombreuses possibilités por améliorer l'xp des utilisateurs


## Types d'éléments et flux de page (display)

En HTML, les éléments sont classés en 2 catégories principales : les éméments en ligne (inline elements) et les éléments de bloc (block-level elements). Ces catégories définissent comme les élements sont affichés et comment ils interagissent les uns avec les autres dans une page web. 

1. **Elements de bloc (block-level elements)**

    Les élements de bloc sont des éléments HTML qui créent des boîtes de contenu distinctes dans la page. Ils commencent sur une nouvelle ligne et s'étendent sur toute la largeur disponible de leur conteneur (sauf s'ils ont une largeur spécifiée ou définie en CSS).  
    Les élements de bloc sont souvent utilisés pour structurer la mise en page d'une page web.
    Par exemple, on a `div, p, h1, ul, li, table,...`.  
    On peut appliquer des styles comme la largeur, la longueur, la hauteur, les marges et les rembourrages et les personnaliser.

2. **Elements en ligne (inline elements)**

    Les élements en ligne sont des éléments HTML qui ne commençent pas sur une nouvelle ligne et occupent uniquement l'espace nécessaire autour de leur contenu.  
    Ils sont utilisés pour marquer du texte ou d'autres éléments au sein d'un paragraphe ou d'un élément de bloc.  
    Les éléments en ligne n'ont généralement pas de largeur ou de hauteur spécifiée mais ils peuvent être stylisés en terme de coueleur, de police,...  
    Les élements en ligne courants comprennent `span, a, strong, en, img, br,...`


## Les listes

En HTML, il existe 2 types de liste: les listes organisées (`<ol>`) et les listes non-organisées (`<ul>`).  
Une fois la liste définie, on englobe chacun de ses élements indépendants autour d'une balise `<li>`.

```html
    <ul>
        <li>Ceci est une liste non-organisée</li>
    </ul>
    <ol>
        <li>Ceci est une liste organisée</li>
    </ol>
```

## Les images `img`

C'est une balse auto-fermante.

Pour afficher une image, je dois indiquer à ma balise sa source via l'attribut `src`. Elle peut provenir du web ou être stockée en local dans l'ordianateur. Si l'image est stockée dans un ordinateur, le fichier devra être fourni durant l'hébergement du site si on souhaite que tout le monde puisse la consulter. Dans tous les cas, on préfère indiquer le chemin des images sous forme de chemin relatif.  
On peut redimensionner les images grâce aux attributs width et height à laquelle il faudra donner une valeur en pixels. 

Enfin, il faut mettre un attribut `alt` pour l'accessibilité dès qu'on utilise une balise image. C'est un texte qui va s'afficher si l'image n'arrive pas à s'afficher.Ce texte alternatif est aussi utile pour les personnes qui consultent le web depuis un lecteur audio.

Au sein de notre répertoire, on préfèrera stocker nos images dans un dossier qui leur est dédié dans un dossier que l'on nommera img.