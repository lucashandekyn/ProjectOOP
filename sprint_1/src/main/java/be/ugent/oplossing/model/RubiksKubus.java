package be.ugent.oplossing.model;

import be.ugent.oplossing.show.RubiksReader;

import java.io.FileNotFoundException;
import java.util.List;

public class RubiksKubus implements IRubikCube {
    public RubiksKubus() throws FileNotFoundException {
        RubiksReader.ReadFromFile("test.csv");
    }

    @Override
    public List<IFace> getAllFaces() {
        return null;
    }
}
