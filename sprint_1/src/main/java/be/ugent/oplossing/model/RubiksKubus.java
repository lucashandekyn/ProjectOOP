package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class RubiksKubus implements IRubikCube {

    private Color[] kleuren = {Color.BLACK, Color.BLUE, Color.ORANGE, Color.GREEN, Color.YELLOW, Color.RED, Color.WHITE};
    private List<KleineKubusjes> groteKubus;
    private List<IFace> zijdes;
    public RubiksKubus() {
        List<Point3D> centrums = new ArrayList<>();
        for (int x = -2; x <= 2; x+=2) {
            for (int y = -2; y <= 2; y+=2){
                centrums.add(new Point3D(x,y,-2));
                centrums.add(new Point3D(x,y,0));
                centrums.add(new Point3D(x,y,2));
            }
        }
        for (int i = 0; i < centrums.size();i++) {
            KleineKubusjes kleinKub = new KleineKubusjes(centrums.get(i));
            this.groteKubus.add(kleinKub);
            zijdes.addAll(List.of(kleinKub.geefVlakken()));
        }
    }

    @Override
    public List<IFace> getAllFaces() {
        return this.zijdes;
    }
}
