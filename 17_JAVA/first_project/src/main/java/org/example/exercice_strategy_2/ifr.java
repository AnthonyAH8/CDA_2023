package org.example.exercice_strategy_2;

public class ifr implements TaxStrategy{
    @Override
    public double taxCalcul(double income) {

        double taxAmount = income * 0.3;
        System.out.println(income + " € = " + " IFR : " + taxAmount + " €.");
        return taxAmount;
    }

}
