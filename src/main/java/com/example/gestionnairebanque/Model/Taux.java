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
}
