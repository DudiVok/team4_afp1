package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import java.sql.*;
import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class Reg {
    @FXML

    public AnchorPane rootPane;
    public String url ="jdbc:mysql://localhost:3306/boodldb";
    public String user="root";
    public String password="";

    public TextField Email;



    public void bt_Reg(ActionEvent event) throws IOException {
        try {
            Connection myConn = DriverManager.getConnection(url,user,password);
            Statement myStmt = myConn.createStatement();

            String sql ="insert into users values ('NULL', 'Pista', 'email@email.hu', '1')";
            myStmt.executeUpdate(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        AnchorPane pane = (AnchorPane)FXMLLoader.load(this.getClass().getResource("Kezdo.fxml"));

        rootPane.getChildren().setAll(pane);
        System.out.println("Sikeres regisztráció");
    }
    public void bt_Log(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getResource("Kezdo.fxml"));
        rootPane.getChildren().setAll(pane);
        System.out.println("Vissza a bejelentkezésre");
    }
}
