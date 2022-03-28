package fr.umontpellier.iut.exercice6;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class LoginControl extends GridPane {

    public LoginControl() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("exercice5/LoginView.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private void okClicked() {
    }

    private void cancelClicked() {
    }
}