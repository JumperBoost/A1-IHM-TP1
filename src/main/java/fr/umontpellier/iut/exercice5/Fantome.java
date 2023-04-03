package fr.umontpellier.iut.exercice5;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class Fantome extends Personnage {

    private Rectangle basCorps;


    private Circle oeilGauche;
    private Circle retineGauche;

    private Circle oeilDroit;
    private Circle retineDroite;


    public Fantome() {
        super("droite", Color.BLUE, Color.BLUE);
        basCorps = new Rectangle(0, 10, 20, 10);
        basCorps.setFill(Color.BLUE);

        oeilGauche = new Circle(6, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineGauche = new Circle(oeilGauche.getCenterX() + 1, 6, 1, Color.BLACK);

        oeilDroit = new Circle(14, 6, 2, Color.WHITE);
        //regarde vers la droite
        retineDroite = new Circle(oeilDroit.getCenterX() + 1, 6, 1, Color.BLACK);


        this.getChildren().add(basCorps);
        this.getChildren().add(oeilGauche);
        this.getChildren().add(retineGauche);
        this.getChildren().add(oeilDroit);
        this.getChildren().add(retineDroite);
    }

    @Override
    public void deplacerAGauche() {


    }

    @Override
    public void deplacerADroite(double largeurJeu) {

    }

    @Override
    public void deplacerEnBas(double hauteurJeu) {

    }

    @Override
    public void deplacerEnHaut() {

    }


}
