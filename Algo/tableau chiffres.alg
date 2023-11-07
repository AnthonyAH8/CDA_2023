<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER tableau[9]" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2etat="inactif" F2defaut="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurPoint="2" totalAffichages="1000" totalBoucles="5000000" maxBoucle="500000" arrondiAuto="vrai" epaisseurLigne="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="tableau EST_DU_TYPE LISTE" code="1#LISTE#tableau"/>
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="a EST_DU_TYPE NOMBRE" code="1#NOMBRE#a"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="POUR i ALLANT_DE 1 A 10" code="12#i#1#10">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER &quot; Donner 10 chiffres &quot;" code="4# Donner 10 chiffres #0"/>
            <item algoitem="LIRE a" code="2#a#pasliste"/>
            <item algoitem="tableau[i] PREND_LA_VALEUR a" code="5#tableau#a#i"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;Le neuvième chiffre du tableau est &quot;" code="4#Le neuvième chiffre du tableau est #0"/>
        <item algoitem="AFFICHER tableau[9]" code="3#tableau#0#9"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
