package com.example.vtys_arayuz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class calisanGController extends HelloApplication {
    @FXML
    TextField id, sifre;
    Label hata;
    Button giriss;


    public void calisan(ActionEvent event){
        String url= "jdbc:mysql://localhost:3306/asce";
        String username = "root";
        String password = "16120430903a";
        hata.setText("Giris Basarili");

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet2 =  statement.executeQuery("select count(1) from calisanlar where sifre='"+sifre.getText()+"' and calisanID="+id.getText()+";");
            while (resultSet2.next()){
                System.out.println(resultSet2.getInt(1));

                if(resultSet2.getInt(1)==1){
                    System.out.println(sifre.getText());
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("calisanEkran.fxml"));
                    Parent root = loader.load();
                    calisanEkranController controller = loader.getController();
                    Stage stage = (Stage) giriss.getScene().getWindow();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
