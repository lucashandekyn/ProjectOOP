package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

// TODO consider the below
// - prefer english
// - making an object for instant throw away creates unneeded garbage, consider a simple static helper method as alternative
public class KleineKubusjes{
    private Vlak[] vlakjes;
    // TODO don't use cryptic variable names
    public KleineKubusjes(Point3D centrum, Color[] vlakkl) {
        final Point3D[] hoeken = {
                new Point3D(centrum.getX() + 1, centrum.getY() + 1, centrum.getZ() +1),
                new Point3D(centrum.getX() + 1, centrum.getY() - 1, centrum.getZ() +1),
                new Point3D(centrum.getX() + 1, centrum.getY() - 1, centrum.getZ() -1),
                new Point3D(centrum.getX() + 1, centrum.getY() + 1, centrum.getZ() -1),
                new Point3D(centrum.getX() - 1, centrum.getY() + 1, centrum.getZ() +1),
                new Point3D(centrum.getX() - 1, centrum.getY() - 1, centrum.getZ() +1),
                new Point3D(centrum.getX() - 1, centrum.getY() - 1, centrum.getZ() -1),
                new Point3D(centrum.getX() - 1, centrum.getY() + 1, centrum.getZ() -1)};

        // consider initialization in one go (cleaner, faster)
        this.vlakjes = new Vlak[6]; // alle vlakjes voor 1 kubus
        this.vlakjes[0] = new Vlak(hoeken[0],hoeken[1],hoeken[2],hoeken[3], vlakkl[0]); // voorvlak
        this.vlakjes[1] = new Vlak(hoeken[0],hoeken[4],hoeken[5],hoeken[1], vlakkl[1]); // bovenvlak
        this.vlakjes[2] = new Vlak(hoeken[3],hoeken[7],hoeken[6],hoeken[2], vlakkl[2]); // ondervlak
        this.vlakjes[3] = new Vlak(hoeken[0],hoeken[4],hoeken[7],hoeken[3], vlakkl[3]); // rechterzijvlak
        this.vlakjes[4] = new Vlak(hoeken[1],hoeken[2],hoeken[6],hoeken[5], vlakkl[4]); // linkerzijvlak
        this.vlakjes[5] = new Vlak(hoeken[4],hoeken[5],hoeken[6],hoeken[7], vlakkl[5]); // achtervlak
    }
    // TODO english
    public Vlak[] geefVlakken() {
        return this.vlakjes;
    }
}