//package org.example;
//public class MainWaterTank {
//
//    class Main {
//        public static void main(String[] args) {
//            WaterTank watertank1 = new WaterTank(10, 20);
//            WaterTank watertank2 = new WaterTank(10, 20);
//
//            System.out.println("Poids total de la citerne 1 : " + watertank1.getVolumeTotal());
//            System.out.println("Poids total de la citerne 2 : " + watertank2.getVolumeTotal());
//
//            System.out.println("----------------------");
//
//            System.out.println("Quantité d'eau dans la citerne 1 : " + watertank1.getNiveauRemplissage());
//            System.out.println("Quantité d'eau dans la citerne 2 : " + watertank2.getNiveauRemplissage());
//
//            System.out.println("----------------------");
//
//            double excessWater = watertank1.remplir(11);
//            System.out.println("Quantité d'eau dans la citerne 1 après ajout de 11 litres: " + watertank1.getNiveauRemplissage() + "/" + watertank1.getCapaciteMaximale());
//            System.out.println("Excès d'eau récupéré : " + excessWater);
//
//            double waterTaken = watertank2.vider(11);
//            System.out.println("Quantité d'eau dans la citerne 2 après tentative de retrait de 11 litres: " + watertank2.getNiveauRemplissage() + "/" + watertank2.getCapaciteMaximale());
//            System.out.println("Quantité d'eau récupérée : " + waterTaken);
//
//            System.out.println("----------------------");
//
//            System.out.println("Quantité d'eau dans la citerne 1 : " + watertank1.getNiveauRemplissage());
//            System.out.println("Quantité d'eau dans la citerne 2 : " + watertank2.getNiveauRemplissage());
//        }
//    }
//}
