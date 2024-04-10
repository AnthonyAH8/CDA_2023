//package org.example;
//
//    public class WaterTanK {
//        private double poidsAVide;
//        private double capaciteMaximale;
//        private double niveauRemplissage;
//        private static double volumeTotal = 0;
//
//        public WaterTank(double poidsAVide, double capaciteMaximale) {
//            this.poidsAVide = poidsAVide;
//            this.capaciteMaximale = capaciteMaximale;
//            this.niveauRemplissage = 0;
//        }
//
//        public double remplir(double volume){
//            if (volume >= 0) {
//                double espaceDisponible = capaciteMaximale - niveauRemplissage;
//                if (volume <= espaceDisponible){
//                    niveauRemplissage += volume;
//                    volumeTotal += volume;
//                } else {
//                    System.out.println("La citerne d'eau est remplie");
//                }
//            }else {
//                System.out.println("Erreur !");
//            }
//            return volume;
//        }
//
//        public double vider(double volume) {
//            if (volume >= 0) {
//                if (volume <= niveauRemplissage) {
//                    niveauRemplissage -= volume;
//                    volumeTotal -= volume;
//                } else {
//                    System.out.println("Volume d'eau à retirer trop élevé");
//                }
//            } else {
//                System.out.println("Erreur !");
//            }
//            return volume;
//        }
//
//        public double getPoidsAVide(){
//            return poidsAVide;
//        }
//
//        public double getNiveauRemplissage(){
//            return niveauRemplissage;
//        }
//
//        public static double getVolumeTotal(){
//            return volumeTotal;
//        }
//
//        public double getCapaciteMaximale(){
//            return capaciteMaximale;
//        }
//    }
