package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

public class Vlakken implements IFace{
    private Point3D[] hoeken;
    private Color kleur;

    public Vlakken(Point3D hoeka, Point3D hoekb, Point3D hoekc, Point3D hoekd) {
        hoeken = new Point3D[4];// 4 hoekpunten van 1 vlakje
        this.hoeken[0] = hoeka;
        this.hoeken[1] = hoekb;
        this.hoeken[2] = hoekc;
        this.hoeken[3] = hoekd;
    }


    @Override
    public Color getFaceColor() {
        return Color.BLACK;
    }

    @Override
    public Point3D[] getFaceCorners() {
        return this.hoeken;
    }
}