package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class Kezdo {
    @FXML
    public AnchorPane rootPane;
    public void bt_Reg(ActionEvent event) throws IOException {

        AnchorPane Pane =FXMLLoader.load(getClass().getResource("Reg.fxml"));
        rootPane.getChildren().setAll(Pane);
        System.out.println("Regisztrációs panelen");
    }
    public void bt_Log(ActionEvent event){
        System.out.println("Bejelentkezet panelen");
    }
    public void bt_For(ActionEvent event){
        System.out.println("Elfelejtett panelen");
    }
}
