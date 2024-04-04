package org.example;

import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // System.out.println("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

//        Scanner scanner = new Scanner(System.in)

//        //Exercice 1
//
//        System.out.println("Pain au chocolat ou chocolatine");
//        System.out.println("1 : Pain au chocolat");
//        System.out.println("2 : Chocolatine");
//
//        int choix = scanner.nextInt();
//
//        if (choix == 1) {
//            System.out.println("Vous souhaitez commander un pain au chocolat.");
//
//        } else if (choix == 2) {
//            System.out.println("Vous souhaitez commander une chocolatine.");
//
//        } else {
//            System.out.println("Vous ne souhaitez pas entrer dans ce débat.");
//        }
//
//        //Exercice 2
//
//        System.out.println("Bienvenue dans le jeu du Devineur d'Animaux !");
//        System.out.println("Pensez à un animal.");
//
//
//        System.out.println("Votre animal vit-il dans l'eau ? (oui/non)");
//        String reponsePremiereQuestion = scanner.nextLine().toLowerCase();
//
//        if (reponsePremiereQuestion.equals("oui")) {
//            System.out.println("Je suppose que votre animal est un poisson !");
//        } else if (reponsePremiereQuestion.equals("non")) {
//            System.out.println("Je suppose que votre animal est un mammifère !");
//        }
//
//        if (reponsePremiereQuestion.equals("non")) {
//            System.out.println("Votre animal a-t-il des ailes ? (oui/non)");
//            String reponseSecondeQuestion = scanner.nextLine().toLowerCase();
//
//            if (reponseSecondeQuestion.equals("oui")) {
//                System.out.println("Je suppose que votre animal est un oiseau !");
//            } else if (reponseSecondeQuestion.equals("non")) {
//                System.out.println("Je suppose que votre animal est un mammifère terrestre !");
//            }
//        }
//
//        //Exercice 3
//
//        System.out.println("Bienvenue dans le jeu du Devineur de Super-Héros !");
//        System.out.println("Choisissez entre force, intelligence ou vitesse");
//
//        String reponse = scanner.nextLine().toLowerCase();
//
//        switch (reponse) {
//            case "force" -> System.out.println("Hulk");
//            case "intelligence" -> System.out.println("Iron Man");
//            case "vitesse" -> System.out.println("Flash");
//            default -> System.out.println("Mauvais choix");
//
//            // System.out.println("Choisissez entre force, intelligence ou vitesse");
//        }
//
//        //Exercice 4
//
//        System.out.println("Bienvenue dans le générateur d'humeur de la journée !");
//        System.out.println("Quelle est votre humeur aujourd'hui en un mot (joyeux, triste, aventurier, etc.)");
//
//        String humeur = scanner.nextLine().toLowerCase();
//
//        if (humeur.equals("joyeux")) {
//            System.out.println("Restez heureux et transmettez votre bonheur aux autres.");
//        } else if (humeur.equals("triste")) {
//            System.out.println("Prenez de la distance sur vos problèmes, cela ira bientôt mieux.");
//        } else if (humeur.equals("aventurier")) {
//            System.out.println("Allez visiter un lieu que vous n'avez jamais visité.");
//        } else {
//            System.out.println("Mauvais choix");
//        }

//        1. Devine le nombre
//        Écrire un programme qui choisit un nombre aléatoire entre 1 et 100, et demande à l'utilisateur de le deviner.
//        Le programme donne des indices pour dire si le nombre à deviner est plus grand ou plus petit que les tentatives.

//        Random random = new Random();
//        int randomNumber = random.nextInt(100) + 1;
//        System.out.println("Veuillez saisir un nombre entre 0 et 100");
//
//        int tentative;
//
//        do {
//            tentative = scanner.nextInt();
//            if (tentative > randomNumber) {
//                System.out.println("Le nombre est plus petit");
//            } else if (tentative < randomNumber) {
//                System.out.println("Le nombre est plus grand");
//            } else {
//                System.out.println("Bravo, le nombre à trouver était : " + randomNumber);
//            }
//
//        } while (tentative != randomNumber);

//        2. La Machine à compter
//        Créer un programme qui demande à l'utilisateur deux nombres : un nombre de départ et un nombre de fin.
//        Le programme compte de l'un à l'autre, en affichant chaque nombre sur une nouvelle ligne.

//        System.out.println("Veuillez saisir un nombre de départ");
//        int startNumber = scanner.nextInt();
//        System.out.println("Veuillez saisir un nombre de fin");
//        int endNumber = scanner.nextInt();
//
//        int number = startNumber;
//
//        do {
//            System.out.println(number);
//            number++;
//        } while (number <= endNumber);


//        3. Le Parcours d'obstacles
//        Simuler un parcours d'obstacles où l'utilisateur avance de case en case et doit répondre correctement à des questions pour avancer.
//        Si l'utilisateur répond mal, il doit recommencer depuis le début.
//
//        int position = 1;
//
//        while (true) {
//            System.out.println("Vous êtes à la position " + position);
//            if (position == 2) {
//                System.out.println("Félicitations! Vous avez terminé le parcours.");
//                break;
//            }
//            if (position == 1) {
//                System.out.println("Répondez à cette question pour avancer: Quelle est la capitale de la Belgique?");
//                String reponse2 = scanner.nextLine();
//                if (reponse2.equalsIgnoreCase("Bruxelles")) {
//                    position += 1;
//                } else {
//                    System.out.println("Mauvaise réponse! Vous devez recommencer depuis le début.");
//                    position = 0;
//                }
//            } else {
//                System.out.println("Répondez à cette question pour avancer: Quelle est la capitale de la France?");
//                String reponse = scanner.nextLine();
//                if (reponse.equalsIgnoreCase("Paris")) {
//                    position += 1;
//                } else {
//                    System.out.println("Mauvaise réponse! Vous devez recommencer depuis le début.");
//                    position = 0;
//                    continue;
//                }
//            }
//        }
//        4. Le Générateur de motifs
//        Programmer un générateur de motifs qui demande à l'utilisateur de choisir un caractère et le nombre de lignes,
//        puis affiche un motif triangulaire utilisant le caractère choisi.

//        System.out.print("Entrez la hauteur du triangle : ");
//        int nbLignes = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Entrez le caractère à utiliser : ");
//        String character = scanner.nextLine();
//
//        for (int i = 1; i <= nbLignes; i++) {
//            System.out.print(" ".repeat(nbLignes - i));
//            System.out.println(character.repeat(1 + (i - 1) * 2));
//        }
//        ----------------------------------------------------

//  ### TP : Le Festival de musique virtuel
//
//- Vous êtes en charge de la programmation d'un festival de musique virtuel. Le festival propose plusieurs scènes, chacune dédiée à un genre musical différent. Les participants commencent avec une énergie et un temps limités pour explorer le festival, et chaque performance consomme une partie de ces ressources.
//
//- Créer un programme simulant l'organisation et la participation à un festival de musique virtuel.
//- Le participant pourra choisir parmi différents genres musicaux, chaque choix menant à une série de performances.
//- L'utilisateur doit gérer son énergie et son temps pour profiter au maximum du festival.
//
//- Instructions
//
//1. **Présentation du festival** :
//    - Au démarrage, présentez les différents genres musicaux disponibles (par exemple, Rock, Électronique, Jazz, Classique)
//    et demandez à l'utilisateur de choisir.
//
//2. **Exploration des scènes** :
//    - Pour le genre choisi, présentez une liste de performances avec une brève description,
//    l'énergie et le temps requis pour chaque performance.
//
//3. **Gestion des ressources** :
//    - Chaque utilisateur commence avec une quantité définie d'énergie et de temps. Chaque performance choisie réduit ces ressources.
//    - Après chaque choix, vérifiez si l'utilisateur a encore assez de ressources pour continuer.
//    Sinon, terminez le festival pour cet utilisateur et affichez un résumé de son expérience.
//
//4. **Bonus et challenges** :
//    - Introduisez des éléments aléatoires où l'utilisateur peut gagner des bonus d'énergie ou de temps après une performance.

        int energyLeft = 100;
        int timeLeft = 100;

        System.out.println("Bienvenue au festival de musique virtuel, avec 4 genres musicaux:" +
                "\n 1. Rock " +
                "\n 2. Electronique" +
                "\n 3. Jazz " +
                "\n 4. Classique "
        );
        System.out.println("Choisissez un genre musical dans la liste");
        String genreMusical = scanner.nextLine().toLowerCase();

        do {
            System.out.println("Vous pouvez continuer à participer au festival");
            genreMusical = scanner.nextLine().toLowerCase();

            switch (genreMusical) {
                case "rock":
                    System.out.println("Vous avez choisi le rock. Energie: 30, Temps: 30 ");
                    energyLeft -= 30;
                    timeLeft -= 30;
                    System.out.println("Il vous reste " + energyLeft + " d'énergie");
                    break;
                case "electronique":
                    System.out.println("Vous avez choisi la musique électronique. Energie: 40, Temps: 40 ");
                    energyLeft -= 40;
                    timeLeft -= 40;
                    System.out.println("Il vous reste " + energyLeft + " d'énergie");
                    break;
                case "jazz":
                    System.out.println("Vous avez choisi le jazz. Energie: 20, Temps: 20 ");
                    energyLeft -= 20;
                    timeLeft -= 20;
                    System.out.println("Il vous reste " + energyLeft + " d'énergie");
                    break;
                case "classique":
                    System.out.println("Vous avez choisi la musique classique. Energie: 10, Temps: 10 ");
                    energyLeft -= 10;
                    timeLeft -= 10;
                    System.out.println("Il vous reste " + energyLeft + " d'énergie");
                    break;
                default:
                    System.out.println("Genre musical non reconnu.");
            }
            if (energyLeft <= 0) {
                System.out.println("Vous n'avez plus d'énergie");
            } else if (timeLeft <= 0) {
                System.out.println("Vous n'avez plus de temps disponible.");
            }
        } while (energyLeft > 0 && timeLeft > 0);

        System.out.println("Résumé de votre expérience au festival :");
        System.out.println("Energie restante : " + energyLeft);
        System.out.println("Temps restant : " + timeLeft);
        System.out.println("Merci d'avoir participé au festival !");
    }
}