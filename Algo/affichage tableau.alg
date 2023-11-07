<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_POUR" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" arrondiAuto="vrai" epaisseurLigne="2" epaisseurPoint="2" nbDecimales="8" maxBoucle="500000" totalAffichages="1000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#LISTE#tableau" algoitem="tableau EST_DU_TYPE LISTE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#j" algoitem="j EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="12#i#0#14" algoitem="POUR i ALLANT_DE 0 A 14">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4# Donner 15 nombres #0" algoitem="AFFICHER &quot; Donner 15 nombres &quot;"/>
            <item code="2#a#pasliste" algoitem="LIRE a"/>
            <item code="5#tableau#a#i" algoitem="tableau[i] PREND_LA_VALEUR a"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="12#j#0#(i - 1)" algoitem="POUR j ALLANT_DE 0 A (i - 1)">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="3#tableau#0#j" algoitem="AFFICHER tableau[j]"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
