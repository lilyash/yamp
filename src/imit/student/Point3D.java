package imit.student;

 public class Point3D {
    private double x;
    private double y;
    private double z;
    public Point3D(double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Point3D() {
        x=0;
        y=0;
        z=0;
    }
    public void SetX(double x){
        this.x=x;
    }
    public void SetY(double y){
        this.y=y;
    }
    public void SetZ(double Z){
        this.z=z;
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
}

/*public class Point3D {
    public static void main (String[] args){
        Point3DWork firstPoint = new Point3DWork();
        Point3DWork secondPoint = new Point3DWork(1.0, 2.5, -4.1);
        Point3DWork thridPoint = new Point3DWork(2.0, 4.1, -15.0);
        firstPoint.SetX(10);
        if(secondPoint.GetX()==thridPoint.GetX() && secondPoint.GetY()==thridPoint.GetY() && secondPoint.GetZ()==thridPoint.GetZ()){
            System.out.println("Точки равны!");
        } else{
            System.out.println("Точки не равны!");
        }
        if(firstPoint.GetX()==firstPoint.GetX() && firstPoint.GetY()==firstPoint.GetY() && firstPoint.GetZ()== firstPoint.GetZ()){
            System.out.println("Точка равна сама себе");
        }
    }
}*/