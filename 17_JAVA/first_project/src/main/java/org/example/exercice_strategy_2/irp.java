package org.example.exercice_strategy_2;

public class irp implements TaxStrategy{
    @Override
    public double taxCalcul(double income) {
        double taxAmount = income * 0.2;
        System.out.println(income + " € = " + " IRP : " + taxAmount + " €.");
        return taxAmount;
    }
}
