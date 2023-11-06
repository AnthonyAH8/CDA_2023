<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER suite" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2etat="inactif" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" nbDecimales="8" epaisseurLigne="2" arrondiAuto="vrai" maxBoucle="500000"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
        <item algoitem="nb EST_DU_TYPE NOMBRE" code="1#NOMBRE#nb"/>
        <item algoitem="suite EST_DU_TYPE NOMBRE" code="1#NOMBRE#suite"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot; Donnez un nombre : &quot;" code="4# Donnez un nombre : #0"/>
        <item algoitem="LIRE nb" code="2#nb#pasliste"/>
        <item algoitem="i PREND_LA_VALEUR 0" code="5#i#0#pasliste"/>
        <item algoitem="POUR i ALLANT_DE 1 A nb" code="12#i#1#nb">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="suite PREND_LA_VALEUR suite + i" code="5#suite#suite + i#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="AFFICHER &quot;Le résultat de la suite est &quot;" code="4#Le résultat de la suite est #0"/>
        <item algoitem="AFFICHER suite" code="3#suite#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
