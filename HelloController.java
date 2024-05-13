package com.example.vtys_arayuz;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    AnchorPane anchorPane = new AnchorPane();
    @FXML
    Button kullanici = new Button();
    @FXML
    Button calisan = new Button();
    @FXML
    private Label welcomeText;

    public void kullaniciG() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("kullaniciG.fxml"));
        Parent root = loader.load();
        kullaniciGController controller = loader.getController();
        Stage stage = (Stage) kullanici.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void calisanG() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("calisanG.fxml"));
        Parent root = loader.load();
        calisanGController controller = loader.getController();
        Stage stage = (Stage) calisan.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}