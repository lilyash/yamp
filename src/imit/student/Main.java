package imit.student;

public class Main {

    public static void main (String[] args){
        Point3D firstPoint = new Point3D();
        Point3D secondPoint = new Point3D(1.0, 2.5, -4.4);
        Point3D thridPoint = new Point3D(2.0, 4.5, -15.4);
        firstPoint.setX(10);
        if(secondPoint.getX()==thridPoint.getX() && secondPoint.getY()==thridPoint.getY() && secondPoint.getZ()==thridPoint.getZ()){
            System.out.println("Точки равны!");
        } else{
            System.out.println("Точки не равны!");
        }
        if(firstPoint.getX()==firstPoint.getX() && firstPoint.getY()==firstPoint.getY() && firstPoint.getZ()== firstPoint.getZ()){
            System.out.println("Точка равна сама себе");
        }
        Vector3D firstVector=new Vector3D(3, 4, 0);
        Vector3D secondVector=new Vector3D(6, 8, 0);
        if(Vector3DProcessor.checkCollineartyVectors(firstVector, secondVector)){
            System.out.println("Коллинеарны!");
        }else{
            System.out.println("Не коллинеарны!");
        }
        Vector3D sum = Vector3DProcessor.addVectors(firstVector, secondVector);
        System.out.println(sum.getX());
        Vector3D com = Vector3DProcessor.multiplicationVectors(firstVector, secondVector);
        System.out.println(com.getX());
        System.out.println(Vector3DProcessor.multiplicationVectorsScalar(firstVector, secondVector));
        if(firstVector.compareVector(secondVector)){
            System.out.println("Равны");
        }else{
            System.out.println("Не равны");
        }
        System.out.println(firstVector.getLengthVector());

    }
}
