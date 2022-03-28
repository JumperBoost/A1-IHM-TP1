package fr.umontpellier.iut.exercice7;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Fantome extends Personnage {

    private Rectangle basCorps;

    private Circle corps;

    private Circle oeilGauche;
    private Circle retineGauche;

    private Circle oeilDroit;
    private Circle retineDroite;


    public Fantome() {
        //un fantôme est composé d'un rectangle avec au-dessus un cercle puis des yeux ;)
        basCorps = new Rectangle(0, 10, 20, 10);
        basCorps.setFill(Paint.valueOf("blue"));
        corps = new Circle(10, 10, LARGEUR_MOITIE_PERSONNAGE, Color.BLUE);

        oeilGauche = new Circle(6, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineGauche = new Circle(oeilGauche.getCenterX() + 1, 6, 1, Color.BLACK);

        oeilDroit = new Circle(14, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineDroite = new Circle(oeilDroit.getCenterX() + 1, 6, 1, Color.BLACK);

        direction = "droite";

        this.getChildren().add(basCorps);
        this.getChildren().add(corps);
        this.getChildren().add(oeilGauche);
        this.getChildren().add(retineGauche);
        this.getChildren().add(oeilDroit);
        this.getChildren().add(retineDroite);


    }

    @Override
    public void directionGauche() {


    }

    @Override
    public void directionDroite(double largeurJeu) {

    }

    @Override
    void directionBas(double hauteurJeu) {

    }

    @Override
    void directionHaut() {

    }


}
