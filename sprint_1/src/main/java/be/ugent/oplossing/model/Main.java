package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        test_1();
    }

    public static List<IFace> test_1() {
        RubiksKubus kubtest = new RubiksKubus();
        return kubtest.getAllFaces();
    }

    public static void test_2() {
        System.out.println("Schrijf hier zelf een test voor de geschreven code.");
    }


}
