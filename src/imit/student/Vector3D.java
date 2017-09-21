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
        x=endPoint.GetX()-startPoint.GetX();
        y=endPoint.GetY()-startPoint.GetY();
        z=endPoint.GetZ()-startPoint.GetZ();
    }
    public double LengthVector(){
        return (Math.sqrt(x*x+y*y+z*z));
    }
    public boolean CompareVector(Vector3D comparingVector){
        if(x==comparingVector.GetX() && y==comparingVector.GetY() && z==comparingVector.GetZ()){
            return true;
        }
            return false;
    }
    public double GetX(){
        return x;
    }
    public double GetY(){
        return y;
    }
    public double GetZ(){
        return z;
    }
    public void SetX(double x){
        this.x=x;
    }
    public void SetY(double y){
        this.y=y;
    }
    public void SetZ(double z){
        this.z=z;
    }
}