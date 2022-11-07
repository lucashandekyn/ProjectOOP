package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;
// TODO english
public class Vlak implements IFace{
    // TODO english
    private Point3D[] hoeken;
    // TODO english
    private Color kleur;

    public Vlak(final Point3D hoeka, final Point3D hoekb, final Point3D hoekc, final Point3D hoekd, final Color color) {
        // TODO prefer creation and initialization in one step (cleaner, faster)
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