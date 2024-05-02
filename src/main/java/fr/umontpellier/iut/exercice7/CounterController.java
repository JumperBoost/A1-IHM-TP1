package fr.umontpellier.iut.exercice7;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CounterController implements Initializable {
    @FXML
    private Label counterLabel;

    @FXML
    private Button decrementButton;

    @FXML
    private Button incrementButton;

    @FXML
    private Button resetButton;

    int counter = 0;

    public void increment() {
        counterLabel.setText(String.valueOf(++counter));
    }

    public void decrement() {
        counterLabel.setText(String.valueOf(--counter));
    }

    public void reset() {
        counter = 0;
        counterLabel.setText(String.valueOf(counter));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Initializing CounterController...");
        counterLabel.setText(String.valueOf(0));
   }
}
