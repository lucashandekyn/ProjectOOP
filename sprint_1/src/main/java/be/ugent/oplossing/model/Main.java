package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        test_1();
        test_2();
    }

    public static void test_1() {
    }

    public static void test_2() {
        System.out.println("Schrijf hier zelf een test voor de geschreven code.");
    }

    }

    for(

    int x = -2;x<=2;x+=2)
    {
            for (int y = -2; y <= 2; y += 2) {
                for (int z = -2; z <= 2; z += 2) {
                    final Color[] kleuren = {vrvlak[(x + 2) / 2], boven[(z + 2) / 2], onvlak[(z + 2) / 2], rzvlak[(y + 2) / 2], lzvlak[(y + 2) / 2], arvlak[(x + 2) / 2]};
                    final KleineKubusjes kleinKub = new KleineKubusjes(new Point3D(x, y, z), kleuren);
                    this.zijdes.addAll(List.of(kleinKub.geefVlakken()));
                }
            }
        }