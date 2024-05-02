package fr.umontpellier.iut.exercice5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class JeuMain extends Application {

    private Scene scene;
    private BorderPane root;

    private static List<Obstacle> obstacles;

    @Override
    public void start(Stage primaryStage) {
        root = new BorderPane();
        obstacles = new ArrayList<>();

        //Acteurs du jeu
        Personnage pacman = new Pacman();
        Personnage fantome = new Fantome();
        // on positionne le fantôme 20 positions vers la droite
        fantome.setLayoutX(20 * 10);
        //panneau du jeu
        Pane jeu = new Pane();
        jeu.setPrefSize(640, 480);
        jeu.getChildren().add(pacman);
        jeu.getChildren().add(fantome);
        root.setCenter(jeu);
        // on ajoute les obstacles
        obstacles.add(new Obstacle(60, 180, 120, 80, Paint.valueOf("#A62A2A")));
        obstacles.add(new Obstacle(40, 240, 480, 140, Paint.valueOf("#A62A2A")));
        jeu.getChildren().addAll(obstacles);
        //on construit une scene 640 * 480 pixels
        scene = new Scene(root);

        //Gestion du déplacement du personnage
        deplacer(pacman, fantome);

        primaryStage.setTitle("... Pac Man ...");

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Permet de gérer les événements de type clavier, pression des touches
     * pour le j1(up,down, right, left), pour le j2( z,q,s,d)
     *
     * @param j1
     * @param j2
     */
    private void deplacer(Personnage j1, Personnage j2) {
        scene.setOnKeyPressed((KeyEvent event) -> {
            switch (event.getCode()) {
                case LEFT:
                    j1.deplacerAGauche();
                    break;

                case RIGHT:
                    j1.deplacerADroite(scene.getWidth());
                    break;

                case UP:
                    j1.deplacerEnHaut();
                    break;

                case DOWN:
                    j1.deplacerEnBas(scene.getHeight());
                    break;

                case Z:
                    j2.deplacerEnHaut();
                    break;

                case S:
                    j2.deplacerEnBas(scene.getHeight());
                    break;

                case Q:
                    j2.deplacerAGauche();
                    break;

                case D:
                    j2.deplacerADroite(scene.getWidth());
                    break;
            }

            if(j1.estEnCollision(j2) || j2.estEnCollisionAvecEnvironnement()) {
                System.out.println("Pacman gagné.");
                j1.setToPreviousCoords();
                j2.setToPreviousCoords();
                scene.setOnKeyPressed(null);
            } else if(j1.estEnCollisionAvecEnvironnement()) {
                System.out.println("Fantôme gagné.");
                j1.setToPreviousCoords();
                scene.setOnKeyPressed(null);
            } else {
                j1.saveCurrentCoords();
                j2.saveCurrentCoords();
            }
        });
    }

    public static List<Obstacle> getObstacles() {
        return obstacles;
    }
}
