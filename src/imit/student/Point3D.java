package imit.student;

public class Point3D {
    private double x;
    private double y;
    private double z;
    public void constructCoordinate(double constructx, double constructy, double constructz) {
        x=constructx;
        y=constructy;
        z=constructz;
    }
    public void constructNoCoordinate() {
        x=0;
        y=0;
        z=0;
    }

}
