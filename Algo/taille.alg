<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SINON"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" totalBoucles="5000000" arrondiAuto="vrai" epaisseurLigne="2" epaisseurPoint="2" totalAffichages="1000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="taille EST_DU_TYPE NOMBRE" code="1#NOMBRE#taille"/>
        <item algoitem="poids EST_DU_TYPE NOMBRE" code="1#NOMBRE#poids"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Taille : &quot;" code="4#Taille : #0"/>
        <item algoitem="LIRE taille" code="2#taille#pasliste"/>
        <item algoitem="AFFICHER &quot;Poids :&#x9;&quot;" code="4#Poids :&#x9;#0"/>
        <item algoitem="LIRE poids" code="2#poids#pasliste"/>
        <item algoitem="SI ((taille &lt;= 171 ET poids &lt; 47 ET poids >= 43) OU (taille &lt;= 168 ET poids &lt; 53 ET poids >= 48) OU (taille &lt;= 165 ET poids &lt; 59 ET poids >= 54) OU (taille &lt;= 162 ET poids &lt; 65 ET poids >= 60)) ALORS" code="6#(taille &lt;= 171 ET poids &lt; 47 ET poids >= 43) OU (taille &lt;= 168 ET poids &lt; 53 ET poids >= 48) OU (taille &lt;= 165 ET poids &lt; 59 ET poids >= 54) OU (taille &lt;= 162 ET poids &lt; 65 ET poids >= 60)">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;taille 1&quot;" code="4#taille 1#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon"/>
        </item>
        <item algoitem="SI ((taille > 168 ET taille &lt; 178 ET poids > 48 ET poids &lt;= 53) OU (taille > 165 ET taille &lt; 175 ET poids > 54 ET poids &lt;= 59) OU (taille > 162 ET taille &lt; 172 ET poids > 60 ET poids &lt;= 65) OU (taille >= 159 ET taille &lt; 169 ET poids > 66 ET poids &lt;= 71)) ALORS" code="6#(taille > 168 ET taille &lt; 178 ET poids > 48 ET poids &lt;= 53) OU (taille > 165 ET taille &lt; 175 ET poids > 54 ET poids &lt;= 59) OU (taille > 162 ET taille &lt; 172 ET poids > 60 ET poids &lt;= 65) OU (taille >= 159 ET taille &lt; 169 ET poids > 66 ET poids &lt;= 71)">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;taille 2&quot;" code="4#taille 2#1"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon"/>
        </item>
        <item algoitem="SI ((taille > 177 ET taille &lt; 182 ET poids > 54 ET poids &lt; 59) OU (taille >= 174 ET taille &lt; 182 ET poids > 60 ET poids &lt; 65) OU (taille > 171 ET taille &lt; 182 ET poids > 66 ET poids &lt; 71) OU (taille > 162 ET taille &lt; 182 ET poids > 72 ET poids &lt; 77)) ALORS" code="6#(taille > 177 ET taille &lt; 182 ET poids > 54 ET poids &lt; 59) OU (taille >= 174 ET taille &lt; 182 ET poids > 60 ET poids &lt; 65) OU (taille > 171 ET taille &lt; 182 ET poids > 66 ET poids &lt; 71) OU (taille > 162 ET taille &lt; 182 ET poids > 72 ET poids &lt; 77)">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER &quot;taille 3&quot;" code="4#taille 3#0"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER &quot;Pas de taille&quot;" code="4#Pas de taille#0"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
