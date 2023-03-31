package com.example.gestionnairebanque.Model;

import com.example.gestionnairebanque.GestionnaireBanque;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


    public class GestionnaireBancaire {
        private ArrayList<Transaction> transactions;
        private HashMap<Character, Double> taux;
        private double solde;

        public GestionnaireBancaire() {
            transactions = new ArrayList<>();
            taux = new HashMap<>();
            solde = 0;

            // Charger les taux depuis un fichier
            chargerTaux();
        }

        public void enregistrerTransaction(Transaction transaction) {
            transactions.add(transaction);

            // Mettre à jour le solde
            if ('C' == transaction.getType()) {
                solde += transaction.getMontant();
            } else if ('D' == transaction.getType()) {
                solde -= transaction.getMontant();
            }
        }

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

        public double getSolde() {
            return solde;
        }

        private Transaction creerTransaction(String ligne) {
            String[] elements = ligne.split(",");
            char type = elements[0].charAt(0);
            String nom = elements[1];
            double montant = Double.parseDouble(elements[2]);
            return new Transaction(nom, type, montant);
        }

        private void chargerTaux() {
            try {
                File file = new File("data/taux.txt");
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    String ligne = scanner.nextLine();
                    String[] elements = ligne.split(",");
                    char type = elements[0].charAt(0);
                    double taux = Double.parseDouble(elements[1]);
                    this.taux.put(type, taux);
                }
                scanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public double getTaux(char type) {
            if (taux.containsKey(type)) {
                return taux.get(type);
            } else {
                return 0;
            }
        }
}
