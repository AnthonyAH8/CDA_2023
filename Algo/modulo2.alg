<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SINON"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2lignes="" F2defaut="" F2etat="inactif" F2para=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8" maxBoucle="500000" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4# Veuillez donner un NOMBRE positif #0" algoitem="AFFICHER &quot; Veuillez donner un NOMBRE positif &quot;"/>
        <item code="2#a#pasliste" algoitem="LIRE a"/>
        <item code="6#a % 2 == 0" algoitem="SI (a % 2 == 0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#le NOMBRE #0" algoitem="AFFICHER &quot;le NOMBRE &quot;"/>
            <item code="3#a#0#pasliste" algoitem="AFFICHER a"/>
            <item code="4# est pair#0" algoitem="AFFICHER &quot; est pair&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#le NOMBRE #0" algoitem="AFFICHER &quot;le NOMBRE &quot;"/>
                <item code="3#a#0#pasliste" algoitem="AFFICHER a"/>
                <item code="4# est impair#0" algoitem="AFFICHER &quot; est impair&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
