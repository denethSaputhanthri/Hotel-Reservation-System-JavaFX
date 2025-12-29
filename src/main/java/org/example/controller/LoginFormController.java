package org.example.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class LoginFormController {
    Stage stage=new Stage();

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    public void btnLoginOnAction(ActionEvent event) {
        String nameText = txtUserName.getText();
        String passwordText = txtPassword.getText();

        if ("Deneth".equals(nameText) && "1234".equals(passwordText)){
            System.out.println("Vaild User");
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Dashboard");
            stage.show();
        }else {
            System.out.println("Invaild User");
            txtPassword.setText("");
            txtUserName.setText("");
        }
        System.out.println("User Name :"+nameText);
        System.out.println("Password  :"+passwordText);
    }
}
