package fr.umontpellier.iut.exercice7;

import javafx.scene.Group;

class Personnage extends Group {
    final double LARGEURMOITIEPERSONNAGE = 10;
    final double LARGEURPERSONNAGE = LARGEURMOITIEPERSONNAGE * 2;
    protected String direction;

    void directionGauche() {
        //    ****
        //   *    *
        //  *---   *
        //   *    *
        //    ****

        //déplacement <----
        if (this.getLayoutX() >= LARGEURPERSONNAGE) {
            this.setLayoutX(this.getLayoutX() - LARGEURPERSONNAGE);
        }
        if (direction != "gauche") {
            direction = "gauche";
        }
    }

    void directionDroite(double largeurJeu) {
        //    ****
        //   *    *
        //  *   ---*
        //   *    *
        //    ****
        //déplacement ---->
        if (this.getLayoutX() < largeurJeu - LARGEURPERSONNAGE) {
            this.setLayoutX(this.getLayoutX() + LARGEURPERSONNAGE);
        }
        if (direction != "droite") {
            direction = "droite";
        }
    }

    void directionBas(double hauteurJeu) {
        //    *****
        //   *     *
        //  *   |   *
        //   *  |  *
        //    *****

    }

    void directionHaut() {
        //    *****
        //   *  |  *
        //  *   |   *
        //   *     *
        //    *****

    }

    boolean collision(Personnage autrePersonnage) {
        return this.getBoundsInParent().contains(autrePersonnage.getBoundsInParent());
    }

}
