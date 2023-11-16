<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Vous avez trouvé&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2etat="inactif" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalBoucles="5000000" maxBoucle="500000" totalAffichages="1000" arrondiAuto="vrai" epaisseurLigne="2" epaisseurPoint="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="NB EST_DU_TYPE NOMBRE" code="1#NOMBRE#NB"/>
        <item algoitem="CHOIX EST_DU_TYPE NOMBRE" code="1#NOMBRE#CHOIX"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="NB PREND_LA_VALEUR ALGOBOX_ALEA_ENT(0,100)" code="5#NB#ALGOBOX_ALEA_ENT(0,100)#pasliste"/>
        <item algoitem="AFFICHER &quot;Devine le nombre bg&quot;" code="4#Devine le nombre bg#0"/>
        <item algoitem="LIRE CHOIX" code="2#CHOIX#pasliste"/>
        <item algoitem="TANT_QUE (CHOIX != NB) FAIRE" code="15#CHOIX != NB">
            <item algoitem="DEBUT_TANT_QUE" code="16#debuttantque"/>
            <item algoitem="SI (CHOIX &lt; NB) ALORS" code="6#CHOIX &lt; NB">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;C'est plus&quot;" code="4#C'est plus#0"/>
                <item algoitem="LIRE CHOIX" code="2#CHOIX#pasliste"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER &quot;C'est moinsse&quot;" code="4#C'est moinsse#0"/>
                    <item algoitem="LIRE CHOIX" code="2#CHOIX#pasliste"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_TANT_QUE" code="17#fintantque"/>
        </item>
        <item algoitem="AFFICHER &quot;Vous avez trouvé&quot;" code="4#Vous avez trouvé#0"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
