<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHERCALCUL A + B"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param totalAffichages="1000" arrondiAuto="vrai" totalBoucles="5000000" maxBoucle="500000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="A EST_DU_TYPE NOMBRE" code="1#NOMBRE#A"/>
        <item algoitem="B EST_DU_TYPE NOMBRE" code="1#NOMBRE#B"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;entrez le premier nombre :&quot;" code="4#entrez le premier nombre :#0"/>
        <item algoitem="LIRE A" code="2#A#pasliste"/>
        <item algoitem="AFFICHER &quot;entrez le second nombre :&quot;" code="4#entrez le second nombre :#0"/>
        <item algoitem="LIRE B" code="2#B#pasliste"/>
        <item algoitem="AFFICHER &quot;Le résultat de l'addition est &quot;" code="4#Le résultat de l'addition est #0"/>
        <item algoitem="AFFICHERCALCUL A + B" code="20#A + B#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
