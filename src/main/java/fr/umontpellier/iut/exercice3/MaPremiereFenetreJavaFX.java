package fr.umontpellier.iut.exercice3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class MaPremiereFenetreJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("Bonjour à tous !");
        label.setFont(Font.font("Courier", FontWeight.BOLD, 30));
        TextField nom = new TextField();
        nom.setFont(Font.font("Courier", FontWeight.NORMAL, 15));
        nom.setMaxWidth(150);
        Button bouton = new Button();
        ImageView image_bouton = new ImageView(getClass().getClassLoader().getResource("exercice3/Bonjour.jpg").toExternalForm());
        bouton.setGraphic(image_bouton);

        final EventHandler<ActionEvent> eventHandler = actionEvent -> {
            if(nom.getText().equals("César"))
                label.setText("Bonjour à toi, César");
        };
        bouton.setOnAction(eventHandler);
        nom.setOnAction(eventHandler);

        VBox vBox = new VBox(label, nom, bouton);
        vBox.setAlignment(Pos.CENTER);


        Scene scene = new Scene(vBox);
        scene.getStylesheets().add(getClass().getClassLoader().getResource("exercice3/Bonjour.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello Application");
        primaryStage.setWidth(400);
        primaryStage.setHeight(400);
        primaryStage.show();
    }
}
