package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
public class RubiksKubus implements IRubikCube {
//    private List<KleineKubusjes> groteKubus;
    private List<IFace> zijdes;
    public RubiksKubus() {
//        this.groteKubus = new ArrayList<>();
        this.zijdes = new ArrayList<>();

        Color[] boven = {Color.BLACK, Color.BLACK, Color.WHITE};
        Color[] rzvlak = {Color.BLACK,Color.BLACK,Color.BLUE};
        Color[] lzvlak = {Color.GREEN,Color.BLACK, Color.BLACK};
        Color[] vrvlak = {Color.BLACK, Color.BLACK, Color.RED};
        Color[] arvlak = {Color.ORANGE,Color.BLACK, Color.BLACK};
        Color[] onvlak = {Color.YELLOW, Color.BLACK, Color.BLACK};

        for (int x = -2; x <= 2; x+=2) {
            for (int y = -2; y <= 2; y+=2){
                for (int z = -2; z<=2;z+=2) {
                    Color[] kleuren = {vrvlak[(x+2)/2],boven[(z+2)/2],onvlak[(z+2)/2],rzvlak[(y+2)/2],lzvlak[(y+2)/2],arvlak[(x+2)/2]};
                    KleineKubusjes kleinKub = new KleineKubusjes(new Point3D(x, y, z),kleuren);
//                    this.groteKubus.add(kleinKub);
                    this.zijdes.addAll(List.of(kleinKub.geefVlakken()));
                }
            }
        }
    }

    @Override
    public List<IFace> getAllFaces() {
        return this.zijdes;
    }
}
