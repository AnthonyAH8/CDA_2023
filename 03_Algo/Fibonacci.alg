<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_POUR"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2para="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" epaisseurLigne="2" epaisseurPoint="2" totalAffichages="1000" arrondiAuto="vrai" totalBoucles="5000000" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="SUITE EST_DU_TYPE NOMBRE" code="1#NOMBRE#SUITE"/>
        <item algoitem="I EST_DU_TYPE NOMBRE" code="1#NOMBRE#I"/>
        <item algoitem="Fa EST_DU_TYPE NOMBRE" code="1#NOMBRE#Fa"/>
        <item algoitem="Fb EST_DU_TYPE NOMBRE" code="1#NOMBRE#Fb"/>
        <item algoitem="F EST_DU_TYPE NOMBRE" code="1#NOMBRE#F"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Quelle suite affiche-t-on?&quot;" code="4#Quelle suite affiche-t-on?#0"/>
        <item algoitem="LIRE SUITE" code="2#SUITE#pasliste"/>
        <item algoitem="Fa PREND_LA_VALEUR 0" code="5#Fa#0#pasliste"/>
        <item algoitem="Fb PREND_LA_VALEUR 1" code="5#Fb#1#pasliste"/>
        <item algoitem="AFFICHER F" code="3#F#0#pasliste"/>
        <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
        <item algoitem="AFFICHER Fb" code="3#Fb#0#pasliste"/>
        <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
        <item algoitem="POUR I ALLANT_DE 2 A SUITE" code="12#I#2#SUITE">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="F PREND_LA_VALEUR Fa + Fb" code="5#F#Fa + Fb#pasliste"/>
            <item algoitem="Fa PREND_LA_VALEUR Fb" code="5#Fa#Fb#pasliste"/>
            <item algoitem="Fb PREND_LA_VALEUR F" code="5#Fb#F#pasliste"/>
            <item algoitem="AFFICHER F" code="3#F#0#pasliste"/>
            <item algoitem="AFFICHER &quot; &quot;" code="4# #0"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
