<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; années.&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2para="" F2etat="inactif" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param arrondiAuto="vrai" totalAffichages="1000" nbDecimales="8" epaisseurLigne="2" epaisseurPoint="2" totalBoucles="5000000" maxBoucle="500000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#base" algoitem="base EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbmax" algoitem="nbmax EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#taux" algoitem="taux EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbannees" algoitem="nbannees EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#taux#1.0089#pasliste" algoitem="taux PREND_LA_VALEUR 1.0089"/>
        <item code="5#nbmax#120000#pasliste" algoitem="nbmax PREND_LA_VALEUR 120000"/>
        <item code="5#base#96809#pasliste" algoitem="base PREND_LA_VALEUR 96809"/>
        <item code="5#nbannees#0#pasliste" algoitem="nbannees PREND_LA_VALEUR 0"/>
        <item code="15#base &lt;= nbmax" algoitem="TANT_QUE (base &lt;= nbmax) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="5#base#taux * base#pasliste" algoitem="base PREND_LA_VALEUR taux * base"/>
            <item code="5#nbannees#nbannees + 1#pasliste" algoitem="nbannees PREND_LA_VALEUR nbannees + 1"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4# Le nombre d'années pour atteindre #0" algoitem="AFFICHER &quot; Le nombre d'années pour atteindre &quot;"/>
        <item code="3#nbmax#0#pasliste" algoitem="AFFICHER nbmax"/>
        <item code="4# habitants est de #0" algoitem="AFFICHER &quot; habitants est de &quot;"/>
        <item code="3#nbannees#0#pasliste" algoitem="AFFICHER nbannees"/>
        <item code="4# années.#0" algoitem="AFFICHER &quot; années.&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
