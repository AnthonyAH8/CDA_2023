# Les unités de mesure en CSS

## 1.Pixels

Les pixels (px) sont une unité de mesure fixe qui éfinit la taille de la police en fonction des pixels de l'écran. Les tailles en pixels sont absolues, ce qui signifie qu'elles ne changent pas en fonction de la résolution de l'écran ou des préférences de l'utilisateur.

```css
    font-size: 16px;
```

## 2.Points (pt)

Les points (`pt`) sont une mesure d'impression couramment utilisées. En CSS, ils sont également pris en charge pour définir la taille de la police sur l'écran. Un point correspond à environ 1/72e de pouce.

```css
    font-size: 12pt;
```

## 3. EM (em)

L'unité (`em`) est relative à la taille de la police de l'élément parent.   
Si la taille de la police de l'élément parent est de 16px, `1em` équivaut à 16px, `2em` correspond à 32px.

## 4. REM (rem)

L'unité (`rem`) est similaire à (em) mais elle est basée sur la taille de police de l'élément racine. Cela garantit une cohérence globale dans toute la page. La taille par défaut de la racine est de 16px sur la plupart des navigateurs.

## 5. Le pourcentage

Les pourcentages (`%`) sont une autre unité de mesure relative qui dépend de la taille de l'élément parent.  
Par exemple, si l'élément parent a une taille de police de 20px, et qu'on utilise `font-size:150%`, la taille de la police sera de 30px.

## 6. Les vw et vh

Les unités `vw` (viewport width) et `vh` (viewport height) sont relatives à la largeur et la hauteur de la fenêtre d'affichage. Par exemple, `font-size: 5vw` definira la taille de la police à 5% de la largeur de la fenêtre. 

```css
    font-size: 5vh;
```
