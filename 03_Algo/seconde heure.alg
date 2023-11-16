<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot; sec &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2etat="inactif" F2para="" F2defaut="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" totalAffichages="1000" epaisseurPoint="2" nbDecimales="8" epaisseurLigne="2" maxBoucle="500000" totalBoucles="5000000"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#HEURE" algoitem="HEURE EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#MINUTE" algoitem="MINUTE EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#SECONDE" algoitem="SECONDE EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="2#SECONDE#pasliste" algoitem="LIRE SECONDE"/>
        <item code="5#HEURE#floor(SECONDE/3600)#pasliste" algoitem="HEURE PREND_LA_VALEUR floor(SECONDE/3600)"/>
        <item code="5#MINUTE#floor((SECONDE-HEURE)/60)#pasliste" algoitem="MINUTE PREND_LA_VALEUR floor((SECONDE-HEURE)/60)"/>
        <item code="5#SECONDE#floor((SECONDE)/60)#pasliste" algoitem="SECONDE PREND_LA_VALEUR floor((SECONDE)/60)"/>
        <item code="3#SECONDE#0#pasliste" algoitem="AFFICHER SECONDE"/>
        <item code="4# seconde(s) = #0" algoitem="AFFICHER &quot; seconde(s) = &quot;"/>
        <item code="3#HEURE#0#pasliste" algoitem="AFFICHER HEURE"/>
        <item code="4# h #0" algoitem="AFFICHER &quot; h &quot;"/>
        <item code="3#MINUTE#0#pasliste" algoitem="AFFICHER MINUTE"/>
        <item code="4# min #0" algoitem="AFFICHER &quot; min &quot;"/>
        <item code="3#SECONDE#0#pasliste" algoitem="AFFICHER SECONDE"/>
        <item code="4# sec #0" algoitem="AFFICHER &quot; sec &quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
