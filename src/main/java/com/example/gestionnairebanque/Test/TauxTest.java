package com.example.gestionnairebanque.Test;

import com.example.gestionnairebanque.Model.Taux;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TauxTest {
    @Test
    public void testInitTaux() {
        Taux taux = new Taux("Taux 1", 0d, 1000d, 0.01d);

    }

}
