<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER suite" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2defaut="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param nbDecimales="8" totalAffichages="1000" maxBoucle="500000" arrondiAuto="vrai" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#b" algoitem="b EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#suite" algoitem="suite EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez écrire un nombre positif : #0" algoitem="AFFICHER &quot;Veuillez écrire un nombre positif : &quot;"/>
        <item code="2#a#pasliste" algoitem="LIRE a"/>
        <item code="5#b#1#pasliste" algoitem="b PREND_LA_VALEUR 1"/>
        <item code="5#suite#1#pasliste" algoitem="suite PREND_LA_VALEUR 1"/>
        <item code="12#b#b#a" algoitem="POUR b ALLANT_DE b A a">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#suite#b * suite#pasliste" algoitem="suite PREND_LA_VALEUR b * suite"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="3#suite#0#pasliste" algoitem="AFFICHER suite"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
