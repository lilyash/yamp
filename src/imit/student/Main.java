package imit.student;

public class Main {

    public static void main (String[] args){
        Point3D firstPoint = new Point3D();
        Point3D secondPoint = new Point3D(1.0, 2.5, -4.4);
        Point3D thridPoint = new Point3D(2.0, 4.5, -15.4);
        firstPoint.SetX(10);
        if(secondPoint.GetX()==thridPoint.GetX() && secondPoint.GetY()==thridPoint.GetY() && secondPoint.GetZ()==thridPoint.GetZ()){
            System.out.println("Точки равны!");
        } else{
            System.out.println("Точки не равны!");
        }
        if(firstPoint.GetX()==firstPoint.GetX() && firstPoint.GetY()==firstPoint.GetY() && firstPoint.GetZ()== firstPoint.GetZ()){
            System.out.println("Точка равна сама себе");
        }
        Vector3D firstVector=new Vector3D(3, 4, 0);
        Vector3D secondVector=new Vector3D(1, 4, 2);
        if(Vector3DProcessor.CheckCollineartyVectors(firstVector, secondVector)){
            System.out.println("Коллинеарны!");
        }else{
            System.out.println("Не коллинеарны!");
        }
        Vector3D sum = Vector3DProcessor.AddVectors(firstVector, secondVector);
        System.out.println(sum.GetX());
        Vector3D com = Vector3DProcessor.MultiplicationVectors(firstVector, secondVector);
        System.out.println(com.GetX());
        System.out.println(Vector3DProcessor.MultiplicationVectorsScalar(firstVector, secondVector));
        if(firstVector.CompareVector(secondVector)){
            System.out.println("Равны");
        }else{
            System.out.println("Не равны");
        }
        System.out.println(firstVector.LengthVector());
    }
}
