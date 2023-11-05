<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER MOYENNE"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurPoint="2" arrondiAuto="vrai" totalBoucles="5000000" totalAffichages="1000" nbDecimales="8" maxBoucle="500000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#LISTE#TABLEAU" algoitem="TABLEAU EST_DU_TYPE LISTE"/>
        <item code="1#NOMBRE#I" algoitem="I EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#A" algoitem="A EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#SOMME" algoitem="SOMME EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#MOYENNE" algoitem="MOYENNE EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#TABLEAU#10:16:18:20#I" algoitem="TABLEAU[I] PREND_LA_VALEUR 10:16:18:20"/>
        <item code="12#I#0#3" algoitem="POUR I ALLANT_DE 0 A 3">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="2#TABLEAU#I" algoitem="LIRE TABLEAU[I]"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="12#I#0#3" algoitem="POUR I ALLANT_DE 0 A 3">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#SOMME#SOMME + TABLEAU [I]#pasliste" algoitem="SOMME PREND_LA_VALEUR SOMME + TABLEAU [I]"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="5#MOYENNE#SOMME/I#pasliste" algoitem="MOYENNE PREND_LA_VALEUR SOMME/I"/>
        <item code="4#La moyenne est de :#1" algoitem="AFFICHER &quot;La moyenne est de :&quot;"/>
        <item code="3#MOYENNE#0#pasliste" algoitem="AFFICHER MOYENNE"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
