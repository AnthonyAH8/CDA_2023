<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="FIN_TANT_QUE" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param nbDecimales="8" arrondiAuto="vrai" totalBoucles="5000000" totalAffichages="1000" maxBoucle="500000" epaisseurLigne="2" epaisseurPoint="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="COMPTEUR EST_DU_TYPE NOMBRE" code="1#NOMBRE#COMPTEUR"/>
        <item algoitem="REPONSE EST_DU_TYPE NOMBRE" code="1#NOMBRE#REPONSE"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="POUR COMPTEUR ALLANT_DE 0 A 10" code="12#COMPTEUR#0#10">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="AFFICHER COMPTEUR" code="3#COMPTEUR#1#pasliste"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="REPONSE PREND_LA_VALEUR 10" code="5#REPONSE#10#pasliste"/>
        <item algoitem="TANT_QUE (REPONSE >= 0) FAIRE" code="15#REPONSE >= 0">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="AFFICHER REPONSE" code="3#REPONSE#1#pasliste"/>
            <item algoitem="REPONSE PREND_LA_VALEUR REPONSE -1" code="5#REPONSE#REPONSE -1#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
