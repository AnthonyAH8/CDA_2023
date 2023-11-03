<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_SI" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2para="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" totalAffichages="1000" totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000" epaisseurLigne="2" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#age" algoitem="age EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4# Veuillez indiquer votre âge #0" algoitem="AFFICHER &quot; Veuillez indiquer votre âge &quot;"/>
        <item code="2#age#pasliste" algoitem="LIRE age"/>
        <item code="6#age &lt; 3" algoitem="SI (age &lt; 3) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Vous êtes trop jeune#0" algoitem="AFFICHER &quot;Vous êtes trop jeune&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#age >= 3 &amp;&amp; age &lt;= 6" algoitem="SI (age >= 3 &amp;&amp; age &lt;= 6) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4# Catégorie baby#0" algoitem="AFFICHER &quot; Catégorie baby&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#age >= 7 &amp;&amp; age &lt;= 8" algoitem="SI (age >= 7 &amp;&amp; age &lt;= 8) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4# Catégorie poussin#0" algoitem="AFFICHER &quot; Catégorie poussin&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#age >= 9 &amp;&amp; age &lt;= 10" algoitem="SI (age >= 9 &amp;&amp; age &lt;= 10) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4# Catégorie pupille#0" algoitem="AFFICHER &quot; Catégorie pupille&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#age >= 11 &amp;&amp; age &lt;= 12" algoitem="SI (age >= 11 &amp;&amp; age &lt;= 12) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4# Catégorie minime#0" algoitem="AFFICHER &quot; Catégorie minime&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#age >= 13 &amp;&amp; age &lt; 18" algoitem="SI (age >= 13 &amp;&amp; age &lt; 18) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4# Catégorie cadet#0" algoitem="AFFICHER &quot; Catégorie cadet&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
