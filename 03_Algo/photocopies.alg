<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="FIN_SI"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2defaut="" F2etat="inactif" F2lignes=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" nbDecimales="8" arrondiAuto="vrai" totalAffichages="1000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#A" algoitem="A EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nb" algoitem="nb EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Combien de photocopies voulez-vous?#0" algoitem="AFFICHER &quot;Combien de photocopies voulez-vous?&quot;"/>
        <item code="2#nb#pasliste" algoitem="LIRE nb"/>
        <item code="6#nb &lt; 10" algoitem="SI (nb &lt; 10) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="20#0.5 * nb#0" algoitem="AFFICHERCALCUL 0.5 * nb"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#nb >= 10 &amp; nb &lt;= 20" algoitem="SI (nb >= 10 &amp; nb &lt;= 20) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="20#0.4 * nb#0" algoitem="AFFICHERCALCUL 0.4 * nb"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#nb > 20" algoitem="SI (nb > 20) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="20#0.3 * nb#0" algoitem="AFFICHERCALCUL 0.3 * nb"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
