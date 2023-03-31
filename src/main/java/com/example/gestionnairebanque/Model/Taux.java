package com.example.gestionnairebanque.Model;



public class Taux {
    private String nom;
    private double seuilInf;
    private double seuilSup;
    private double taux;

    public Taux(String nom, double seuilInf, double seuilSup, double taux) {
        this.nom = nom;
        this.seuilInf = seuilInf;
        this.seuilSup = seuilSup;
        this.taux = taux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSeuilInf() {
        return seuilInf;
    }

    public void setSeuilInf(double seuilInf) {
        this.seuilInf = seuilInf;
    }

    public double getSeuilSup() {
        return seuilSup;
    }

    public void setSeuilSup(double seuilSup) {
        this.seuilSup = seuilSup;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

}
