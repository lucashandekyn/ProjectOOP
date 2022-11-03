package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

public class Vlakken implements IFace {
    private Point3D[] hoeken;
    private final Color color;

    public Vlakken(Color kleur, Point3D hoeka,Point3D hoekb, Point3D hoekc, Point3D hoekd) {
        this.color = kleur;
        hoeken = new Point3D[4];// 4 hoekpunten opslaan
        this.hoeken[0] = hoeka;
        this.hoeken[1] = hoekb;
        this.hoeken[2] = hoekc;
        this.hoeken[3] = hoekd;
    }

    @Override
    public Color getFaceColor() {
        return this.color;
    }

    @Override
    public Point3D[] getFaceCorners() {
        return hoeken;
    }
}