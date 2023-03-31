package com.example.gestionnairebanque.Model;

/**
 * La classe Compte représente un compte bancaire avec un numéro de compte et un solde.
 */
public class Compte {

    // Le numéro de compte associé à ce compte.
    private String numeroCompte;

    // Le solde actuel de ce compte.
    private double solde;

    /**
     * Constructeur de la classe Compte.
     *
     * @param numeroCompte Le numéro de compte à associer à ce compte.
     * @param solde Le solde initial à associer à ce compte.
     */
    public Compte(String numeroCompte, double solde) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
    }

    /**
     * Renvoie le numéro de compte associé à ce compte.
     *
     * @return Le numéro de compte de ce compte.
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * Renvoie le solde actuel de ce compte.
     *
     * @return Le solde actuel de ce compte.
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Met à jour le solde actuel de ce compte avec la nouvelle valeur fournie.
     *
     * @param solde Le nouveau solde à associer à ce compte.
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    /**
     * Renvoie une représentation textuelle de ce compte.
     *
     * @return Une chaîne de caractères représentant ce compte.
     */
    @Override
    public String toString() {
        return "Compte{" +
                "numeroCompte='" + numeroCompte + '\'' +
                ", solde=" + solde +
                '}';
    }
}



