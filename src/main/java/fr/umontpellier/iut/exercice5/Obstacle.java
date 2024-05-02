package fr.umontpellier.iut.exercice5;

import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

public class Obstacle extends Rectangle {
    public Obstacle(double width, double height, double x, double y, Paint fill) {
        super(x, y, width, height);
        setFill(fill);
    }

    public boolean estEnCollision(double x, double y) {
        return x >= getX() && x < getX() + getWidth()
                && y >= getY() && y < getY() + getHeight();
    }
}
