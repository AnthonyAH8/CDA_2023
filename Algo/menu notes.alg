<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="APPELER_FONCTION procedure(min, max, a, i, choix, total)"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2lignes="" F2para="" F2defaut="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" nbDecimales="8" maxBoucle="500000" totalAffichages="1000" epaisseurPoint="2" epaisseurLigne="2" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES">
        <item code="201#procedure #min, max, a, i, choix, total" algoitem="FONCTION procedure (min, max, a, i, choix, total)">
            <item code="202#declarationsvariablesfonction" algoitem="VARIABLES_FONCTION"/>
            <item code="203#debutfonction" algoitem="DEBUT_FONCTION"/>
            <item code="5#choix#-1#pasliste" algoitem="choix PREND_LA_VALEUR -1"/>
            <item code="15#choix !=0" algoitem="TANT_QUE (choix !=0) FAIRE">
                <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
                <item code="4# Que voulez-vous voir?#1" algoitem="AFFICHER &quot; Que voulez-vous voir?&quot;"/>
                <item code="4# 1.Plus grande note#1" algoitem="AFFICHER &quot; 1.Plus grande note&quot;"/>
                <item code="4# 2.Plus petite note#1" algoitem="AFFICHER &quot; 2.Plus petite note&quot;"/>
                <item code="4# 3.Moyenne#1" algoitem="AFFICHER &quot; 3.Moyenne&quot;"/>
                <item code="4# 0.Quitter#1" algoitem="AFFICHER &quot; 0.Quitter&quot;"/>
                <item code="2#choix#pasliste" algoitem="LIRE choix"/>
                <item code="6#choix == 1" algoitem="SI (choix == 1) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#Le plus grand nombre est #0" algoitem="AFFICHER &quot;Le plus grand nombre est &quot;"/>
                    <item code="3#max#1#pasliste" algoitem="AFFICHER max"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                </item>
                <item code="6#choix == 2" algoitem="SI (choix == 2) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#Le plus petit nombre est #0" algoitem="AFFICHER &quot;Le plus petit nombre est &quot;"/>
                    <item code="3#min#1#pasliste" algoitem="AFFICHER min"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                </item>
                <item code="6#choix == 3" algoitem="SI (choix == 3) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#La moyenne est de #0" algoitem="AFFICHER &quot;La moyenne est de &quot;"/>
                    <item code="20#total / (i-1)#1" algoitem="AFFICHERCALCUL total / (i-1)"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                </item>
                <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
            </item>
            <item code="204#finfonction" algoitem="FIN_FONCTION"/>
        </item>
    </item>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#min" algoitem="min EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#max" algoitem="max EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#total" algoitem="total EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#choix" algoitem="choix EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="12#i#1#3" algoitem="POUR i ALLANT_DE 1 A 3">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="4# Donner #0" algoitem="AFFICHER &quot; Donner &quot;"/>
            <item code="3#i#0#pasliste" algoitem="AFFICHER i"/>
            <item code="4# nombres #0" algoitem="AFFICHER &quot; nombres &quot;"/>
            <item code="2#min#pasliste" algoitem="LIRE min"/>
            <item code="5#total#total + min#pasliste" algoitem="total PREND_LA_VALEUR total + min"/>
            <item code="6#min > max" algoitem="SI (min > max) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#max#min#pasliste" algoitem="max PREND_LA_VALEUR min"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="6#min &lt;= 0" algoitem="SI (min &lt;= 0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="5#min#max#pasliste" algoitem="min PREND_LA_VALEUR max"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="206#procedure(min, max, a, i, choix, total)" algoitem="APPELER_FONCTION procedure(min, max, a, i, choix, total)"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
