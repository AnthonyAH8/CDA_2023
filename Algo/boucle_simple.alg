<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_TANT_QUE"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" arrondiAuto="vrai" totalBoucles="5000000" maxBoucle="500000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="i EST_DU_TYPE NOMBRE" code="1#NOMBRE#i"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot; Donnez moi un chiffre entre 1 et 10:&quot;" code="4# Donnez moi un chiffre entre 1 et 10:#0"/>
        <item algoitem="LIRE i" code="2#i#pasliste"/>
        <item algoitem="TANT_QUE (i &lt; 10) FAIRE" code="15#i &lt; 10">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="i PREND_LA_VALEUR i + 1" code="5#i#i + 1#pasliste"/>
            <item algoitem="AFFICHER i" code="3#i#0#pasliste"/>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
