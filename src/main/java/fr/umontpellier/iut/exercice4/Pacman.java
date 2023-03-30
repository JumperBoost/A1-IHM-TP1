package fr.umontpellier.iut.exercice4;

import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

public class Pacman extends Personnage {

    private Circle corps;
    private Line bouche;


    public Pacman() {
        super("droite");
        corps = new Circle(10, 10, LARGEUR_MOITIE_PERSONNAGE, Color.BLACK);
        corps.setFill(Paint.valueOf("yellow"));
        bouche = new Line(LARGEUR_MOITIE_PERSONNAGE, LARGEUR_MOITIE_PERSONNAGE, LARGEUR_MOITIE_PERSONNAGE * 2, LARGEUR_MOITIE_PERSONNAGE);
        bouche.setFill(Paint.valueOf("black"));

        this.getChildren().add(corps);
        this.getChildren().add(bouche);
    }

    @Override
    public void deplacerAGauche() {
        super.deplacerAGauche();
        //sens de la bouche
        bouche.setEndX(bouche.getStartX() - LARGEUR_MOITIE_PERSONNAGE);
        bouche.setEndY(bouche.getStartY());
    }

    @Override
    public void deplacerADroite(double largeurJeu) {
        super.deplacerADroite(largeurJeu);
        //sens de la bouche
        bouche.setEndX(bouche.getStartX() + LARGEUR_MOITIE_PERSONNAGE);
        bouche.setEndY(bouche.getStartY());
    }

    @Override
    public void deplacerEnBas(double hauteurJeu) {
        // à compléter
    }

    @Override
    public void deplacerEnHaut() {
        // à compléter
    }

}
