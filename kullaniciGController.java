package com.example.vtys_arayuz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class kullaniciGController {
    @FXML
    public Label menuL;
    @FXML
    public RadioButton radioButton1,radioButton2,radioButton3;
    @FXML
    ToggleGroup t = new ToggleGroup();
    public void menuGor(ActionEvent event){

        if (radioButton1.isSelected()){
            System.out.println("1");
            menuL.setText("Çorba\n" +
                "Tavuk Izgara\n" +
                "Kofte\n" +
                "Kumpir\n" +
                "Makarna\n" +
                "Salata\n" +
                "Borek\n" +
                "Balik Tava\n" +
                "Hamburger\n" +
                "Pizza");
        }
        else if (radioButton2.isSelected()){
            menuL.setText("Su\n" +
                    "Ayran\n" +
                    "Limonata\n" +
                    "Kola\n" +
                    "Soguk Cay");
    }
        else if (radioButton3.isSelected()){
            menuL.setText("Kazandibi\n" +
                "Sufle\n" +
                "Profiterol\n" +
                "Bakalava\n" +
                "Cikolatali Pasta\n" +
                "Kadayif\n" +
                "Trilece");
        }
}
}
