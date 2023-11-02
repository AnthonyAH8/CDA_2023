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
        <item code="1#NOMBRE#n" algoitem="n EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#suite" algoitem="suite EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Veuillez saisir un nombre : #0" algoitem="AFFICHER &quot;Veuillez saisir un nombre : &quot;"/>
        <item code="2#n#pasliste" algoitem="LIRE n"/>
        <item code="5#i#0#pasliste" algoitem="i PREND_LA_VALEUR 0"/>
        <item code="12#i#1#n" algoitem="POUR i ALLANT_DE 1 A n">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#suite#suite + i#pasliste" algoitem="suite PREND_LA_VALEUR suite + i"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="3#suite#0#pasliste" algoitem="AFFICHER suite"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
