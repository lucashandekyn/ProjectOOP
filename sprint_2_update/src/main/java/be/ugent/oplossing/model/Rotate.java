package be.ugent.oplossing.model;

import javafx.geometry.Point3D;

public class Rotate {
    private double theta; //public, want er mag aan veranderd worden?
    private double cos = Math.cos(this.theta);
    private double sin = Math.sin(this.theta);

    private double[][] rotx = {{1,0,0},{0,cos,-sin},{0,sin,cos}};
    private double[][] roty = {{cos,0,sin},{0,1,0},{-sin,0,cos}};
    private double[][] rotz = {{cos,-sin,0},{sin,cos,0},{0,0,1}};


    public double getTheta(double newtheta){
        return this.theta = newtheta;
    }
    public Point3D getRotx(Point3D punt) {
        double apunt[] = {punt.getX(),punt.getY(),punt.getZ()};
        double xnew=0;
        double ynew=0;
        double znew=0;
        for (int j=0;j<3;j++) {
            xnew += apunt[j] * rotx[0][j];
            ynew += apunt[j] * rotx[1][j];
            znew += apunt[j] * rotx[2][j];
        }
        Point3D newpunt = new Point3D(xnew,ynew,znew);
    }

    public Point3D getRoty(Point3D punt) {
        double apunt[] = {punt.getX(),punt.getY(),punt.getZ()};
        double xnew=0;
        double ynew=0;
        double znew=0;
        for (int j=0;j<3;j++) {
            xnew += apunt[j] * roty[0][j];
            ynew += apunt[j] * roty[1][j];
            znew += apunt[j] * roty[2][j];
        }
        Point3D newpunt = new Point3D(xnew,ynew,znew);
    }

    public Point3D getRotz(Point3D punt) {
        double apunt[] = {punt.getX(),punt.getY(),punt.getZ()};
        double xnew=0;
        double ynew=0;
        double znew=0;
        for (int j=0;j<3;j++) {
            xnew += apunt[j] * rotz[0][j];
            ynew += apunt[j] * rotz[1][j];
            znew += apunt[j] * rotz[2][j];
        }
        Point3D newpunt = new Point3D(xnew,ynew,znew);
    }

}
