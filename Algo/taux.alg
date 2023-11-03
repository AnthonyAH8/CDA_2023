<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;€&quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2para="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurPoint="2" totalAffichages="1000" totalBoucles="5000000" arrondiAuto="vrai" maxBoucle="500000" epaisseurLigne="2" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#c" algoitem="c EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#t" algoitem="t EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#n" algoitem="n EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4# Montant du capital : #0" algoitem="AFFICHER &quot; Montant du capital : &quot;"/>
        <item code="2#c#pasliste" algoitem="LIRE c"/>
        <item code="4# Nombre d'années : #0" algoitem="AFFICHER &quot; Nombre d'années : &quot;"/>
        <item code="2#n#pasliste" algoitem="LIRE n"/>
        <item code="4# Taux fixe : #0" algoitem="AFFICHER &quot; Taux fixe : &quot;"/>
        <item code="2#t#pasliste" algoitem="LIRE t"/>
        <item code="5#t#t / 100#pasliste" algoitem="t PREND_LA_VALEUR t / 100"/>
        <item code="5#c#c * pow(1 + t,n)#pasliste" algoitem="c PREND_LA_VALEUR c * pow(1 + t,n)"/>
        <item code="4#Votre capital est de #1" algoitem="AFFICHER &quot;Votre capital est de &quot;"/>
        <item code="20#round(c)#0" algoitem="AFFICHERCALCUL round(c)"/>
        <item code="4#€#0" algoitem="AFFICHER &quot;€&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
