package org.example.exercice_strategy_2;

public class tva implements TaxStrategy{
    @Override
    public double taxCalcul(double income) {
        double taxAmount = income * 0.055;
        System.out.println(income + " € = " + " TVA : " + taxAmount + " €.");

        return taxAmount;
    }
}
