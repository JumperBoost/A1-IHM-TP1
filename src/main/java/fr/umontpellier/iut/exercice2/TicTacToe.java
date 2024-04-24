package fr.umontpellier.iut.exercice2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TicTacToe extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setBackground(Background.fill(Paint.valueOf("000000")));
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(5))));

        List<String> images_path = new ArrayList<>(Arrays.asList("exercice2/Croix.png", "exercice2/Rond.png", "exercice2/Vide.png"));
        Random random = new Random();
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Label label = new Label();
                label.setBackground(Background.fill(Paint.valueOf("dddddd")));
                label.setGraphic(new ImageView(images_path.get(random.nextInt(3))));
                grid.addRow(i, label);
            }
        }


        Scene scene = new Scene(grid);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

