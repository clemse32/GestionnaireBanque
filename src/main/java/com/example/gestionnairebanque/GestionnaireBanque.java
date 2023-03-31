package com.example.gestionnairebanque;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class GestionnaireBanque extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GestionnaireBanque.class.getResource("IHM.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 200);
        stage.setTitle("Gestion Bancaire ");
        scene.getRoot().setStyle("-fx-background-color: LIGHTGRAY;");
        stage.setResizable(false);
        stage.getIcons().add(new Image("file:images/Logo.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}