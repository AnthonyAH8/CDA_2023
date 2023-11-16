<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SINON"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" totalBoucles="5000000" totalAffichages="1000" arrondiAuto="vrai" nbDecimales="8" epaisseurPoint="2" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="age EST_DU_TYPE NOMBRE" code="1#NOMBRE#age"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot; Veuillez indiquer votre âge &quot;" code="4# Veuillez indiquer votre âge #0"/>
        <item algoitem="LIRE age" code="2#age#pasliste"/>
        <item algoitem="SI (age &lt; 3) ALORS" code="6#age &lt; 3">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;Vous êtes trop jeune&quot;" code="4#Vous êtes trop jeune#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon"/>
        </item>
        <item algoitem="SI (age >= 3 &amp;&amp; age &lt;= 6) ALORS" code="6#age >= 3 &amp;&amp; age &lt;= 6">
            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
            <item algoitem="AFFICHER &quot; Catégorie baby&quot;" code="4# Catégorie baby#0"/>
            <item algoitem="FIN_SINON" code="11#finsinon"/>
            <item algoitem="SINON" code="9#sinon"/>
        </item>
        <item algoitem="SI (age > 6 &amp;&amp; age &lt;= 8) ALORS" code="6#age > 6 &amp;&amp; age &lt;= 8">
            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
            <item algoitem="AFFICHER &quot;Catégorie poussin&quot;" code="4#Catégorie poussin#0"/>
            <item algoitem="FIN_SINON" code="11#finsinon"/>
            <item algoitem="SINON" code="9#sinon"/>
        </item>
        <item algoitem="SI (age > 8 &amp;&amp; age &lt;= 10) ALORS" code="6#age > 8 &amp;&amp; age &lt;= 10">
            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
            <item algoitem="AFFICHER &quot;Catégorie pupille&quot;" code="4#Catégorie pupille#0"/>
            <item algoitem="FIN_SINON" code="11#finsinon"/>
            <item algoitem="SINON" code="9#sinon"/>
        </item>
        <item algoitem="SI (age > 10 &amp;&amp; age &lt;= 11) ALORS" code="6#age > 10 &amp;&amp; age &lt;= 11">
            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
            <item algoitem="AFFICHER &quot;Catégorie Minime&quot;" code="4#Catégorie Minime#0"/>
            <item algoitem="FIN_SINON" code="11#finsinon"/>
            <item algoitem="SINON" code="9#sinon"/>
        </item>
        <item algoitem="SI (age > 11 &amp;&amp; age &lt;= 12) ALORS" code="6#age > 11 &amp;&amp; age &lt;= 12">
            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
            <item algoitem="AFFICHER &quot;Catégorie Minime&quot;" code="4#Catégorie Minime#0"/>
            <item algoitem="FIN_SINON" code="11#finsinon"/>
            <item algoitem="SINON" code="9#sinon"/>
        </item>
        <item algoitem="SI (age >= 13 &amp;&amp; age &lt;= 18) ALORS" code="6#age >= 13 &amp;&amp; age &lt;= 18">
            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
            <item algoitem="AFFICHER &quot;Catégorie cadet&quot;" code="4#Catégorie cadet#0"/>
            <item algoitem="FIN_SINON" code="11#finsinon"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
