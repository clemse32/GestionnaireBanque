package com.example.gestionnairebanque.Test;

import com.example.gestionnairebanque.Model.GestionnaireBancaire;
import com.example.gestionnairebanque.Model.Taux;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testInitialisationListeTaux() {
        assertNotNull(gestionnaireBancaire.getTaux());
        assertEquals(0, gestionnaireBancaire.getTaux().size());
    }

    @Test
    public void testInitialisationSolde() {
        assertEquals(0.0, gestionnaireBancaire.getSolde(), 0.0);
    }


    @Test
    public void testChargementTauxDepuisFichier() throws IOException {
        // Création du fichier temporaire avec des données de test
        Path path = Paths.get(FILE_PATH);
        Files.createDirectories(path.getParent());
        Files.write(path, "CREDIT;0.01\nDEBIT;0.02".getBytes());

        gestionnaireBancaire.chargerTauxDepuisFichier(FILE_PATH);

        List<Taux> tauxAttendus = new ArrayList<>();
        tauxAttendus.add(new Taux(TypeTransaction.CREDIT, 0.01));
        tauxAttendus.add(new Taux(TypeTransaction.DEBIT, 0.02));

        assertEquals(tauxAttendus, gestionnaireBancaire.getTaux());

        // Suppression du fichier temporaire
        Files.deleteIfExists(path);
    }


}