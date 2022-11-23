package be.ugent.oplossing.model;

import javafx.geometry.Point3D;
import javafx.scene.paint.Color;

public class Rotate {
    private double theta; //public, want er mag aan veranderd worden?
    //private color kleurvlak;
    private Kubusje kubus;
    private double cos;
    private double sin;


    public void setTheta(double hoek) {
        this.theta = Math.toRadians(hoek);
    }

    public Point3D getRotx(Point3D punt) {
        this.cos = Math.cos(this.theta);
        this.sin = Math.sin(this.theta);
        double[][] rotx = {{1, 0, 0}, {0, cos, -sin}, {0, sin, cos}};
        double apunt[] = {punt.getX(), punt.getY(), punt.getZ()};
        double xnew = 0;
        double ynew = 0;
        double znew = 0;
        for (int j = 0; j < 3; j++) {
            xnew += apunt[j] * rotx[0][j];
            ynew += apunt[j] * rotx[1][j];
            znew += apunt[j] * rotx[2][j];
        }
        Point3D newpunt = new Point3D(xnew, ynew, znew);
        return newpunt;
    }

    public Point3D getRoty(Point3D punt) {
        this.cos = Math.cos(this.theta);
        this.sin = Math.sin(this.theta);
        double[][] roty = {{cos, 0, sin}, {0, 1, 0}, {-sin, 0, cos}};
        double apunt[] = {punt.getX(), punt.getY(), punt.getZ()};
        double xnew = 0;
        double ynew = 0;
        double znew = 0;
        for (int j = 0; j < 3; j++) {
            xnew += apunt[j] * roty[0][j];
            ynew += apunt[j] * roty[1][j];
            znew += apunt[j] * roty[2][j];
        }
        Point3D newpunt = new Point3D(xnew, ynew, znew);
        return newpunt;
    }

    public Point3D getRotz(Point3D punt) {
        this.cos = Math.cos(this.theta);
        this.sin = Math.sin(this.theta);
        double[][] rotz = {{cos, -sin, 0}, {sin, cos, 0}, {0, 0, 1}};
        double apunt[] = {punt.getX(), punt.getY(), punt.getZ()};
        double xnew = 0;
        double ynew = 0;
        double znew = 0;
        for (int j = 0; j < 3; j++) {
            xnew += apunt[j] * rotz[0][j];
            ynew += apunt[j] * rotz[1][j];
            znew += apunt[j] * rotz[2][j];
        }
        Point3D newpunt = new Point3D(xnew, ynew, znew);
        return newpunt;
    }
    public Point3D rotate(Color color,Point3D hpunt){
        if (color.equals(Color.RED)){
            return getRotx(hpunt);
        }
        if (color.equals(Color.ORANGE)){
            return getRotx(hpunt);
        }
        if (color.equals(Color.BLUE)){
            return getRotz(hpunt);
        }
        if (color.equals(Color.GREEN)){
            return getRotz(hpunt);
        }
        if (color.equals(Color.WHITE)){
            return getRoty(hpunt);
        }
        if (color.equals(Color.YELLOW)){
            return getRoty(hpunt);
        }
        return null;
    }
}