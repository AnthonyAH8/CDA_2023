package org.example;

public class quelle_heure {

    public static void hour(String heure){ // création méthode statique hour // type string avec un paramètre heure
        System.out.println("Il est " + heure); // affichage de base
    }
    public static void hour(){ // création méthode signatures différentes
        hour("12h00"); // affichage de base de l'heure de base
    }

    public static void main(String[] args) { // fonction main
       hour();
       hour("14h00");
    }
}

//package org.example;
//
//public class quelle_heure {
//
//    public static String hour(String heure){
//        return heure;
//    }
//
//    public static String hour(){
//        return "Il est ";
//    }
//
//    public static void main(String[] args) {
//        var hour = hour("12h00");
//        System.out.println("Il est " + hour);
//
//        var hour2 = hour();
//        System.out.println(hour2 + "14h00");
//    }
//}

