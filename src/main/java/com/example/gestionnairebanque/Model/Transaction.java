package com.example.gestionnairebanque.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Transaction implements Serializable {

    // Attributs privés de la classe Transaction
    private String nom; // Le nom de la transaction
    private char type; // Le type de la transaction sous forme de caractère
    private double montant; // Le montant de la transaction

    /**
     Constructeur de la classe Transaction
     @param nom Le nom de la transaction
     @param type Le type de la transaction sous forme de caractère
     @param montant Le montant de la transaction
     */
    public Transaction(String nom, char type, double montant) {
        this.nom = nom;
        this.type = type;
        this.montant = montant;
    }

    /**
     Accesseur pour l'attribut nom de la classe Transaction
     @return Le nom de la transaction
     */
    public String getNom() {
        return nom;
    }

    /**
     Mutateur pour l'attribut nom de la classe Transaction
     @param nom Le nom de la transaction
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     Accesseur pour l'attribut type de la classe Transaction
     @return Le type de la transaction sous forme de caractère
     */
    public char getType() {
        return type;
    }

    /**
     Mutateur pour l'attribut type de la classe Transaction
     @param type Le type de la transaction sous forme de caractère
     */
    public void setType(char type) {
        this.type = type;
    }

    /**
     Accesseur pour l'attribut montant de la classe Transaction
     @return Le montant de la transaction
     */
    public double getMontant() {
        return montant;
    }

    /**
     Mutateur pour l'attribut montant de la classe Transaction
     @param montant Le montant de la transaction
     */
    public void setMontant(double montant) {
        this.montant = montant;
    }

}


