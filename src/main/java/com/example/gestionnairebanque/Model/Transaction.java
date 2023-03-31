package com.example.gestionnairebanque.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Transaction implements Serializable {

    private String nom;
    private char type;
    private double montant;
    public Transaction(String nom, char type, double montant) {
        this.montant = montant;
        this.nom = nom;
        this.type = type;


    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    public ArrayList<Transaction> getTransactions() {
        ArrayList<Transaction> transactions = null;
        return transactions;
    }

}

