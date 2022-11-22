package be.ugent.oplossing.model;

import be.ugent.oplossing.show.RubiksReader;
import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RubiksKubus implements IRubikCube{

    private List<Kubusje> kubusjes;
    private Rotate rotatie = new Rotate();

    // Alle gegevens voor de 27 kubusjes werden in een excel-bestand ingevuld en bewaard.
    // Excel biedt dankzij z'n kolommen een duidelijk overzicht, er kan heel gestructureerd gewerkt
    // (en gecontroleerd) worden.
    // Inlezen van het bestand werd afgekeken van de gegeven code in de show-map.
    // (Moet niet gekend zijn voor op het examen.)
    public RubiksKubus() throws FileNotFoundException {
        kubusjes = new ArrayList<>();

        Scanner sc = new Scanner(new File(Objects.requireNonNull(RubiksReader.class.getResource("kubussen_xyz.csv")).getFile()));
        while(sc.hasNext()){
            Scanner sc_ = new Scanner(sc.nextLine());
            sc_.useDelimiter(";");
            int x = sc_.nextInt();
            int y = sc_.nextInt();
            int z = sc_.nextInt();
            String[] kleuren = new String[6];
            for(int i=0; i<6; i++){
                kleuren[i] = sc_.next();
            }
            kubusjes.add(new Kubusje(x,y,z,kleuren));
        }

    }


    // Dit kan je gebruiken om zelf te testen, zolang de view er nog niet is.
    // Layout niet handig? Pas zelf aan.
    public String toString(){
        // kan je later met streams doen
        String[] strings = new String[kubusjes.size()];
        int i=0;
        for(Kubusje kubus : kubusjes){
            strings[i++] = kubus.toString();
        }
        return String.join("\n",strings);
    }



    // Deze methode wordt gebruikt door het showteam om de View te maken.
    // Meer is er niet nodig (in tegenstelling tot wat in sprint0 aangekondigd werd,
    // dus geen onderscheid tussen zichtbare en onzichtbare vlakjes).
    @Override
    public List<IFace> getAllFaces() {
        List<IFace> list = new ArrayList<>();
        for(Kubusje kubus : kubusjes){
            for(Vlakje vlak : kubus.getVlakjes()){
                list.add(vlak);
            }
        }
        return list;
    }

    @Override
    public List<IFace> getRotation(Color color, int degree) {
        List<IFace> kopielijst = new ArrayList<>();
        if (color == Color.WHITE) {
            //rotatie rond y-axis met bepaalde degree
            for (int i = 0; i < kubusjes.size(); i++){
                if(kubusjes.get(i).getCentrum().getY()==2) {
                    rotatie.getTheta(degree);
                    Point3D newx = rotatie.getRoty(kubusjes.get(i).getCentrum());
                    kopielijst.add(null);
                }
            }
        }
        if (color == Color.YELLOW) {
            //rotatie rond y-axis met bepaalde degree
            for (int i = 0; i < kubusjes.size(); i++){
            }
        }
        if (color == Color.BLUE) {
            //rotatie rond x-axis met bepaalde degree
            for (int i = 0; i < kubusjes.size(); i++){
            }
        }
        if (color == Color.GREEN) {
            //rotatie rond x-axis met bepaalde degree
            for (int i = 0; i < kubusjes.size(); i++){
            }
        }
        if (color == Color.ORANGE){
            //rotatie rond z-axis met bepaalde degree
            for (int i = 0; i < kubusjes.size(); i++){
            }
        }
        if (color == Color.RED) {
            //rotatie rond z-axis met bepaalde degree
            for (int i = 0; i < kubusjes.size(); i++){
            }
        }
        return null; // hele kubus teruggeven
    }

    @Override
    public void rotate(Color color, boolean clockwise) {
        if (color == Color.WHITE || color == Color.YELLOW) {
            if (clockwise == true) {
                //rotate rond y-axis
            }
            else {
                //rotate rond y-axis met negatieve hoek
            }
        }
        if (color == Color.ORANGE || color == Color.RED) {
            if (clockwise == true) {
                //rotate rond x-axis
            }
            else {
                //rotate rond x-axis met negatieve hoek
            }
        }
        if (color == Color.BLUE || color == Color.GREEN) {
            if (clockwise == true) {
                //rotate rond z-axis
            }
            else {
                //rotate rond z-axis met negatieve hoek
            }
        }
    }

    private Point3D transformatie(Point3D loc, double hoek, double rot[][]) {

        return loc;
    }

    public List<Kubusje> getKubusjes(){
        return kubusjes;
    }

}

