package com.example.gestionnairebanque.Model;

import com.example.gestionnairebanque.GestionnaireBanque;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionnaireBancaire {
    private ArrayList<Transaction> transactions;
    private HashMap<String, Double> taux;
    private double solde;
    public GestionnaireBancaire() {
        transactions = new ArrayList<>();
        taux = new HashMap<>();
        solde = 0;

    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public HashMap<String, Double> getTaux() {
        return taux;
    }

    public void setTaux(HashMap<String, Double> taux) {
        this.taux = taux;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
