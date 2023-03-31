package com.example.gestionnairebanque.Test;

import com.example.gestionnairebanque.Model.GestionnaireBancaire;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GestionnaireBancaireTest {

    private GestionnaireBancaire gestionnaireBancaire;

    @Before
    public void setUp() {
        gestionnaireBancaire = new GestionnaireBancaire();
    }
    @Test
    public void testInitialisationListeTransactions() {
        assertNotNull(gestionnaireBancaire.getTransactions());
        assertEquals(0, gestionnaireBancaire.getTransactions().size());
    }

}