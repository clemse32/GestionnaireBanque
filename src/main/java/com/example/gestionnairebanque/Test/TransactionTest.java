package com.example.gestionnairebanque.Test;

import com.example.gestionnairebanque.Model.Transaction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TransactionTest {

    @Test
    public void TestInitTaux() {
        Transaction transaction = new Transaction("nom", 'c', 255d);
        assertEquals("nom", transaction.getNom());
        assertEquals('c', transaction.getType());
        assertEquals(255d, transaction.getMontant(), 0.01d);
    }

    @Test
    public void testSetNom() {
        Transaction transaction = new Transaction("nom", 'c', 255d);
        transaction.setNom("nouveau_nom");
        assertEquals("nouveau_nom", transaction.getNom());
    }

    @Test
    public void testSetType() {
        Transaction transaction = new Transaction("nom", 'c', 255d);
        transaction.setType('d');
        assertEquals('d', transaction.getType());
    }

    @Test
    public void testSetMontant() {
        Transaction transaction = new Transaction("nom", 'c', 255d);
        transaction.setMontant(300d);
        assertEquals(300d, transaction.getMontant(), 0.01d);
    }

}
