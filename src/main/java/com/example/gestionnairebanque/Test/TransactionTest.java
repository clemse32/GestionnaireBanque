package com.example.gestionnairebanque.Test;

import com.example.gestionnairebanque.Model.Taux;
import com.example.gestionnairebanque.Model.Transaction;
import org.junit.Test;

public class TransactionTest {

    @Test
    public void TestInitTaux(){
        Transaction transaction = new Transaction("transaction1",'c', 255d);
    }

}
