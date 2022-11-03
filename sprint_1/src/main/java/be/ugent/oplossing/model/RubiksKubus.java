package be.ugent.oplossing.model;

import javafx.scene.paint.Color;

import java.util.List;
public class RubiksKubus implements IRubikCube {

    private Color[] kleuren = {Color.BLACK, Color.BLUE, Color.ORANGE, Color.GREEN, Color.YELLOW, Color.RED, Color.WHITE};
    public RubiksKubus() {

    }

    @Override
    public List<IFace> getAllFaces() {
        return null;
    }
}
