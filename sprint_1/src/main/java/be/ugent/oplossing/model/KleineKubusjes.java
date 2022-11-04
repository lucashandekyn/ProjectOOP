package be.ugent.oplossing.model;

import javafx.geometry.Point3D;

public class KleineKubusjes{
    private Vlak[] vlakjes;
    public KleineKubusjes(Point3D centrum) {
        Point3D[] hoeken = {
                new Point3D(centrum.getX() + 1, centrum.getY() + 1, centrum.getZ() +1),
                new Point3D(centrum.getX() + 1, centrum.getY() - 1, centrum.getZ() +1),
                new Point3D(centrum.getX() + 1, centrum.getY() - 1, centrum.getZ() -1),
                new Point3D(centrum.getX() + 1, centrum.getY() + 1, centrum.getZ() -1),
                new Point3D(centrum.getX() - 1, centrum.getY() + 1, centrum.getZ() +1),
                new Point3D(centrum.getX() - 1, centrum.getY() - 1, centrum.getZ() +1),
                new Point3D(centrum.getX() - 1, centrum.getY() - 1, centrum.getZ() -1),
                new Point3D(centrum.getX() - 1, centrum.getY() + 1, centrum.getZ() -1)};

        this.vlakjes = new Vlak[6]; // alle vlakjes voor 1 kubus
        this.vlakjes[0] = new Vlak(hoeken[0],hoeken[1],hoeken[2],hoeken[3]); // voorvlak
        this.vlakjes[1] = new Vlak(hoeken[0],hoeken[4],hoeken[5],hoeken[1]); // bovenvlak
        this.vlakjes[2] = new Vlak(hoeken[3],hoeken[7],hoeken[6],hoeken[2]); // ondervlak
        this.vlakjes[3] = new Vlak(hoeken[0],hoeken[4],hoeken[3],hoeken[7]); // rechterzijvlak
        this.vlakjes[4] = new Vlak(hoeken[1],hoeken[2],hoeken[6],hoeken[5]); // linkerzijvlak
        this.vlakjes[5] = new Vlak(hoeken[4],hoeken[5],hoeken[6],hoeken[7]); // achtervlak
    }
    public Vlak[] geefVlakken() {
        return this.vlakjes;
    }
}