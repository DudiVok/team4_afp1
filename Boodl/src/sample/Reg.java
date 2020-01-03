package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Reg {
    @FXML
    public AnchorPane rootPane;
    public void bt_Reg(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("Kezdo.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println("Sikeres regisztráció");
    }
    public void bt_Log(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("Kezdo.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println("Vissza a bejelentkezésre");
    }

}
