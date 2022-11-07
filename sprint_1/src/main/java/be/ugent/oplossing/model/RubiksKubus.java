package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RubiksKubus implements IRubikCube {
    // TODO don't mix dutch and english, always prefer english when coding
    private List<IFace> zijdes;

    public RubiksKubus() {
        this.zijdes = new ArrayList<>();

        // TODO don't mix dutch and english, always prefer english when coding
        // TODO consider making this constants on the class
        // TODO consider making a single data structure (sides are integer nrs or enum)
        final Color[] boven = {Color.BLACK, Color.BLACK, Color.WHITE};
        final Color[] rzvlak = {Color.BLACK, Color.BLACK, Color.BLUE};
        final Color[] lzvlak = {Color.GREEN, Color.BLACK, Color.BLACK};
        final Color[] vrvlak = {Color.BLACK, Color.BLACK, Color.RED};
        final Color[] arvlak = {Color.ORANGE, Color.BLACK, Color.BLACK};
        final Color[] onvlak = {Color.YELLOW, Color.BLACK, Color.BLACK};

        // TODO rewrite with increment 1
        for (int x = -2; x <= 2; x += 2) {
            for (int y = -2; y <= 2; y += 2) {
                for (int z = -2; z <= 2; z += 2) {
                    final Color[] kleuren = {vrvlak[(x + 2) / 2], boven[(z + 2) / 2], onvlak[(z + 2) / 2], rzvlak[(y + 2) / 2], lzvlak[(y + 2) / 2], arvlak[(x + 2) / 2]};
                    final KleineKubusjes kleinKub = new KleineKubusjes(new Point3D(x, y, z), kleuren);
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
