package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class Setting {
    @FXML
    public  AnchorPane rootPane ;
    public void bt_Back(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("BejelentkezettF.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println("Bejelentkezett felület");
    }

}
