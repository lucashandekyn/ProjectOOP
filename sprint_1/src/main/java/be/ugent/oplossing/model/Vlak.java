package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

public class Vlak implements IFace{
    private Point3D[] hoeken;
    private Color kleur;

    public Vlak(Point3D hoeka, Point3D hoekb, Point3D hoekc, Point3D hoekd, Color color) {
        hoeken = new Point3D[4];// 4 hoekpunten van 1 vlakje
        this.hoeken[0] = hoeka;
        this.hoeken[1] = hoekb;
        this.hoeken[2] = hoekc;
        this.hoeken[3] = hoekd;
        this.kleur = color;
    }


    @Override
    public Color getFaceColor() {
        return this.kleur;
    }

    @Override
    public Point3D[] getFaceCorners() {
        return this.hoeken;
    }
}