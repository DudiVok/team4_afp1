package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Elfelejtett {
    @FXML
    public  AnchorPane rootPane ;
    public void bt_Reg(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("Reg.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println("Regisztrációs panelen");
    }
    public void bt_Log(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("Kezdo.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println("Bejelentkezet panelen");
    }
    public void bt_For(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("Kezdo.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println("Elfelejtett panelen");
    }
}
