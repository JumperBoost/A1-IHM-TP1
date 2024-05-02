package fr.umontpellier.iut.exercice8;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControl{
    @FXML
    private TextField user;

    @FXML
    private PasswordField pwd;

    @FXML
    private void okClicked() {
        System.out.println("User: " + user.getText());
        System.out.println("Password: " + "*".repeat(pwd.getText().length()));
    }

    @FXML
    private void cancelClicked() {
        user.clear();
        pwd.clear();
    }
}