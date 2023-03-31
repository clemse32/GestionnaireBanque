package com.example.gestionnairebanque.Model;



/**
 * La classe Taux représente un taux d'intérêt associé à une plage de valeurs.
 */
public class Taux {

    // Le nom associé à ce taux.
    private String nom;

    // La valeur inférieure de la plage de valeurs associée à ce taux.
    private double seuilInf;

    // La valeur supérieure de la plage de valeurs associée à ce taux.
    private double seuilSup;

    // Le taux d'intérêt associé à cette plage de valeurs.
    private double taux;

    /**
     * Constructeur de la classe Taux.
     *
     * @param nom      Le nom à associer à ce taux.
     * @param seuilInf La valeur inférieure de la plage de valeurs associée à ce taux.
     * @param seuilSup La valeur supérieure de la plage de valeurs associée à ce taux.
     * @param taux     Le taux d'intérêt associé à cette plage de valeurs.
     */
    public Taux(String nom, double seuilInf, double seuilSup, double taux) {
        this.nom = nom;
        this.seuilInf = seuilInf;
        this.seuilSup = seuilSup;
        this.taux = taux;
    }

    /**
     * Renvoie le nom associé à ce taux.
     *
     * @return Le nom de ce taux.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Met à jour le nom associé à ce taux avec la nouvelle valeur fournie.
     *
     * @param nom Le nouveau nom à associer à ce taux.
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Renvoie la valeur inférieure de la plage de valeurs associée à ce taux.
     *
     * @return La valeur inférieure de la plage de valeurs de ce taux.
     */
    public double getSeuilInf() {
        return seuilInf;
    }

    /**
     * Met à jour la valeur inférieure de la plage de valeurs associée à ce taux avec la nouvelle valeur fournie.
     *
     * @param seuilInf La nouvelle valeur inférieure à associer à ce taux.
     */
    public void setSeuilInf(double seuilInf) {
        this.seuilInf = seuilInf;
    }

    /**
     * Renvoie la valeur supérieure de la plage de valeurs associée à ce taux.
     *
     * @return La valeur supérieure de la plage de valeurs de ce taux.
     */
    public double getSeuilSup() {
        return seuilSup;
    }

    /**
     * Met à jour la valeur supérieure de la plage de valeurs associée à ce taux avec la nouvelle valeur fournie.
     *
     * @param seuilSup La nouvelle valeur supérieure à associer à ce taux.
     */
    public void setSeuilSup(double seuilSup) {
        this.seuilSup = seuilSup;
    }
}



