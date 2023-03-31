package com.example.gestionnairebanque.Model;

import com.example.gestionnairebanque.GestionnaireBanque;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Cette classe représente un gestionnaire bancaire qui gère les transactions d'un compte bancaire.
 * Elle permet d'enregistrer des transactions, de charger des transactions depuis un fichier, de récupérer le solde du compte,
 * de récupérer les taux de change pour les différentes devises et de mettre à jour le solde du compte en fonction des transactions.
 */
public class GestionnaireBancaire {

    /**
     * Liste des transactions effectuées sur le compte bancaire.
     */
    private ArrayList<Transaction> transactions;

    /**
     * Liste des taux de change pour les différentes devises.
     */
    private HashMap<Character, Double> taux;

    /**
     * Solde actuel du compte bancaire.
     */
    private double solde;

    /**
     * Constructeur par défaut de la classe GestionnaireBancaire.
     * Initialise la liste des transactions, la liste des taux et le solde à 0.
     * Charge également les taux depuis un fichier.
     */
    public GestionnaireBancaire() {
        transactions = new ArrayList<>();
        taux = new HashMap<>();
        solde = 0;


    }

    /**
     * Enregistre une transaction dans la liste des transactions.
     * Met également à jour le solde du compte en fonction du type de transaction.
     *
     * @param transaction La transaction à enregistrer.
     */
    public void enregistrerTransaction(Transaction transaction) {
        transactions.add(transaction);

        // Mettre à jour le solde
        if ('C' == transaction.getType()) {
            solde += transaction.getMontant();
        } else if ('D' == transaction.getType()) {
            solde -= transaction.getMontant();
        }
    }

    /**
     * Charge les transactions depuis un fichier et les enregistre dans la liste des transactions.
     * Le fichier doit être au format CSV avec les champs type de transaction, nom et montant.
     *
     * @param fichierTransactions Le chemin vers le fichier contenant les transactions.
     * @throws FileNotFoundException Si le fichier n'existe pas.
     */
    public void chargerTransactions(String fichierTransactions) throws FileNotFoundException {
        File file = new File(fichierTransactions);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String ligne = scanner.nextLine();
            Transaction transaction = creerTransaction(ligne);
            enregistrerTransaction(transaction);
        }
        scanner.close();
    }

    /**
     * Récupère le solde actuel du compte bancaire.
     *
     * @return Le solde actuel du compte bancaire.
     */
    public double getSolde() {
        return solde;
    }

    /**
     * Crée une transaction à partir d'une ligne du fichier CSV contenant les transactions.
     *
     * @param ligne La ligne du fichier CSV contenant les informations de la transaction.
     * @return La transaction créée.
     */
    private Transaction creerTransaction(String ligne) {
        String[] elements = ligne.split(",");
        char type = elements[0].charAt(0);
        String nom = elements[1];
        double montant = Double.parseDouble(elements[2]);
        return new Transaction(nom, type, montant);
    }
}


