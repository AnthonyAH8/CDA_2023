<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER MIN"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2etat="inactif" F2defaut="" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param arrondiAuto="vrai" maxBoucle="500000" totalAffichages="1000" nbDecimales="8" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="TABLEAU EST_DU_TYPE LISTE" code="1#LISTE#TABLEAU"/>
        <item algoitem="NOTE EST_DU_TYPE NOMBRE" code="1#NOMBRE#NOTE"/>
        <item algoitem="MIN EST_DU_TYPE NOMBRE" code="1#NOMBRE#MIN"/>
        <item algoitem="MAX EST_DU_TYPE NOMBRE" code="1#NOMBRE#MAX"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="TABLEAU[NOTE] PREND_LA_VALEUR 10:16:18:20" code="5#TABLEAU#10:16:18:20#NOTE"/>
        <item algoitem="POUR NOTE ALLANT_DE 0 A 3" code="12#NOTE#0#3">
            <item algoitem="DEBUT_POUR" code="13#debutpour"/>
            <item algoitem="LIRE TABLEAU[NOTE]" code="2#TABLEAU#NOTE"/>
            <item algoitem="FIN_POUR" code="14#finpour"/>
        </item>
        <item algoitem="MAX PREND_LA_VALEUR ALGOBOX_MAXIMUM(TABLEAU,0,3)" code="5#MAX#ALGOBOX_MAXIMUM(TABLEAU,0,3)#pasliste"/>
        <item algoitem="MIN PREND_LA_VALEUR ALGOBOX_MINIMUM(TABLEAU,0,3)" code="5#MIN#ALGOBOX_MINIMUM(TABLEAU,0,3)#pasliste"/>
        <item algoitem="AFFICHER &quot;La note maximum est : &quot;" code="4#La note maximum est : #0"/>
        <item algoitem="AFFICHER MAX" code="3#MAX#1#pasliste"/>
        <item algoitem="AFFICHER &quot;La note minimum est : &quot;" code="4#La note minimum est : #0"/>
        <item algoitem="AFFICHER MIN" code="3#MIN#1#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
