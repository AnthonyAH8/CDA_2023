//package org.example.papeterie;
//
//import java.util.Arrays;
//import java.util.HashMap;
//
//public class Facture {
//    private static int count = 0;
//    private int numeroFacture;
//    private String client;
//    private String date;
//    private Ligne[] lignes;
//    private int nombreLignes;
//
//    private final HashMap<String, Article> articlesHashMap;
//
//    public Facture(String client, String date, HashMap<String, Article> articlesHashMap) {
//        this.numeroFacture = ++count;
//        this.client = client;
//        this.date = date;
//        this.articlesHashMap = articlesHashMap;
//        lignes = new Ligne[10];
//        nombreLignes = 0;
//    }
//
//    public void ajouterLigne(String referenceArticle, int quantite) {
//        Article article = articlesHashMap.get(referenceArticle);
//        if (article != null && nombreLignes < lignes.length) {
//            lignes[nombreLignes++] = new Ligne(article, quantite);
//        } else {
//            System.out.println("L'article n'existe pas dans la base de données ou la facture est pleine.");
//        }
//    }
//
//    public double getPrixTotal() {
//        double prixTotal = 0;
//        for (int i = 0; i < nombreLignes; i++) {
//            prixTotal += lignes[i].getQuantite() * lignes[i].getArticleUnitaire().getPrix();
//        }
//        return prixTotal;
//    }
//
//    @Override
//    public String toString() {
//        return "Facture{" +
//                "numeroFacture=" + numeroFacture +
//                ", client='" + client + '\'' +
//                ", date='" + date + '\'' +
//                ", lignes=" + Arrays.toString(lignes) +
//                ", nombreLignes=" + nombreLignes +
//                ", articlesHashMap=" + articlesHashMap +
//                '}';
//    }
//}
//
