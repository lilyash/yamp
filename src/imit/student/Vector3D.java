package imit.student;

public class Vector3D {
    private double x;
    private double y;
    private double z;
    public Vector3D(){
        x=0.0;
        y=0.0;
        z=0.0;
    }
    public Vector3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Vector3D(Point3D startPoint, Point3D endPoint){
        x=endPoint.getX()-startPoint.getX();
        y=endPoint.getY()-startPoint.getY();
        z=endPoint.getZ()-startPoint.getZ();
    }
    public double getLengthVector(){
        return (Math.sqrt(x*x+y*y+z*z));
    }
    public boolean compareVector(Vector3D comparingVector){
        if(x==comparingVector.getX() && y==comparingVector.getY() && z==comparingVector.getZ()){
            return true;
        }
            return false;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void setZ(double z){
        this.z=z;
    }
}