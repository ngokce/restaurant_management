package com.example.vtys_arayuz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
                String url= "jdbc:mysql://localhost:3306/asce";
                String username = "root";
                String password = "16120430903a";

                try{
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection connection = DriverManager.getConnection(url,username,password);
                    Statement statement = connection.createStatement();
                    ResultSet resultSet =  statement.executeQuery("select IcecekAd from icecek where IcecekID=5;");

                    while (resultSet.next()){
                        System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3));
                        connection.close();
                    }
                }
                catch (Exception e){
                    System.out.println(e);
                }
        launch();
    }
}