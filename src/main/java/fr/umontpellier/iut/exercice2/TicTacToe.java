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
import java.util.List;

public class TicTacToe extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setBackground(Background.fill(Paint.valueOf("000000")));
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setBorder(new Border(new BorderStroke(null, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, new BorderWidths(5))));

        Label label1 = new Label();
        label1.setGraphic(new ImageView("exercice2/Croix.png"));

        List<Integer> croix_pos = new ArrayList<>(List.of(1, 2, 8));
        List<Integer> rond_pos = new ArrayList<>(List.of(0, 3, 4, 5));
        String croix_path = "exercice2/Croix.png";
        String rond_path = "exercice2/Rond.png";
        String vide_path = "exercice2/Vide.png";
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Label label = new Label();
                label.setBackground(Background.fill(Paint.valueOf("dddddd")));
                label.setGraphic(croix_pos.contains(i * 3 + j) ? new ImageView(croix_path) : (rond_pos.contains(i * 3 + j) ? new ImageView(rond_path) : new ImageView(vide_path)));
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

