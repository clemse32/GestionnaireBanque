package com.example.gestionnairebanque.Controleur;

import com.example.gestionnairebanque.Model.Compte;
import com.example.gestionnairebanque.Model.GestionnaireBancaire;
import com.example.gestionnairebanque.Model.Transaction;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controleur {

    @FXML
    private GridPane gridPane;

    @FXML
    private Button enregistrerButton;

    @FXML
    private Label nomLabel;

    @FXML
    private Label prenomLabel;

    @FXML
    private Label typeLabel;

    @FXML
    private ComboBox<String> typeComboBox;

    @FXML
    private ListView<String> compteListView;

    @FXML
    private Label compteLabel;

    @FXML
    private Label soldeLabel;

    @FXML
    private TextField nomTextField;

    @FXML
    private TextField prenomTextField;

    @FXML
    private Label transactionLabel;

    private ObservableList<String> observableList;



}


