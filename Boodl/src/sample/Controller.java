package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.Screen;
import javafx.scene.layout.GridPane;
import org.w3c.dom.Node;



import java.io.IOException;

public class Controller {

    @FXML
    public GridPane rootpane;



    public void bt_Reg(ActionEvent event) throws IOException {

        
        GridPane tableViewParent = FXMLLoader.load(getClass().getResource("Reg.fxml"));
        tableViewParent.getChildren().setAll(rootpane);



        System.out.println("Regisztrációs panelen");
    }
    public void bt_Log(ActionEvent event){
        System.out.println("Bejelentkezet panelen");
    }
    public void bt_For(ActionEvent event){
        System.out.println("Elfelejtett panelen");
    }
    public void FXMLLoader (String ui){
        Parent root;
        try {
            root =FXMLLoader.load(getClass().getResource(ui+".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}