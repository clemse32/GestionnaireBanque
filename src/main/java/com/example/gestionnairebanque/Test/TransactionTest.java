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


}
