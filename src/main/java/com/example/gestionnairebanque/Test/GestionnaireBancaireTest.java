package com.example.gestionnairebanque.Test;

import com.example.gestionnairebanque.Model.GestionnaireBancaire;
import com.example.gestionnairebanque.Model.Taux;
import com.example.gestionnairebanque.Model.Transaction;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class GestionnaireBancaireTest {

    private GestionnaireBancaire gestionnaire;

    @Before
    public void setup() {
        gestionnaire = new GestionnaireBancaire();
    }

    @Test
    public void testEnregistrerTransactionCredit() {
        Transaction transaction = new Transaction("credit", 'c', 100);
        gestionnaire.enregistrerTransaction(transaction);
        assertEquals(100, gestionnaire.getSolde());
    }

    @Test
    public void testEnregistrerTransactionDebit() {
        Transaction transaction = new Transaction("debit", 'd', 50);
        gestionnaire.enregistrerTransaction(transaction);
        assertEquals(-50, gestionnaire.getSolde());
    }


}