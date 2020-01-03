package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BejelentkezettF {
    @FXML
    public  AnchorPane rootPane ;
    public void bt_Setting(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("Setting.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println("Beállítások panelen");
    }
    public void bt_Like(ActionEvent event){
        System.out.println("Lájk");
    }
    public void bt_Dislike(ActionEvent event){
        System.out.println("Dislájk");
    }
    public void bt_Play(ActionEvent event){
        System.out.println("Lejátszás");
    }
    public void bt_Pause(ActionEvent event){
        System.out.println("Szünet");
    }
    public void bt_NextSong(ActionEvent event){
        System.out.println("Következő szám");
    }
}
