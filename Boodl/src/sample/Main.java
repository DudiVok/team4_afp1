package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Kezdo.fxml"));
        primaryStage.setTitle("Boodl");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
