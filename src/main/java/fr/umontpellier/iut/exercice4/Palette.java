package fr.umontpellier.iut.exercice4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Palette extends Application {

    private final int nbVert = 0;
    private final int nbRouge = 0;
    private final int nbBleu = 0;

    private Button vert;
    private Button rouge;
    private Button bleu;

    private BorderPane root;
    private Label label;
    private Pane panneau;
    private HBox bas;

    private final EventHandler<ActionEvent> eventHandler = actionEvent -> {
        Button bouton = (Button) actionEvent.getSource();
        String couleur = (String) bouton.getUserData();
        try {
            int nb = (int) getClass().getDeclaredField("nb" + bouton.getText()).get(this);
            getClass().getDeclaredField("nb" + bouton.getText()).set(this, ++nb);
            label.setText(bouton.getText() + " choisi " + nb + " fois");
            panneau.setBackground(Background.fill(Paint.valueOf(couleur)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    };

    @Override
    public void start(Stage primaryStage) throws Exception {
        root = new BorderPane();

        label = new Label();
        label.setFont(Font.font("Courier", FontWeight.NORMAL, 18));
        HBox haut = new HBox(label);
        haut.setAlignment(Pos.CENTER);
        root.setTop(haut);

        panneau = new Pane();
        root.setCenter(panneau);

        vert = new Button("Vert");
        vert.setUserData("green");
        vert.setOnAction(eventHandler);
        rouge = new Button("Rouge");
        rouge.setUserData("red");
        rouge.setOnAction(eventHandler);
        bleu = new Button("Bleu");
        bleu.setUserData("blue");
        bleu.setOnAction(eventHandler);

        bas = new HBox(vert, rouge, bleu);
        bas.setAlignment(Pos.CENTER);
        bas.setSpacing(10);
        bas.setPadding(new Insets(10));
        root.setBottom(bas);

        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

