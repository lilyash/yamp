package imit.student;

public class Vector3DProcessor {

    public static Vector3D AddVectors(Vector3D firstVector, Vector3D secondVector){
        double x=firstVector.GetX()+secondVector.GetX();
        double y=firstVector.GetY()+secondVector.GetY();
        double z=firstVector.GetZ()+secondVector.GetZ();
        Vector3D sumVector=new Vector3D(x, y, z);
        return sumVector;
    }
    public static double MultiplicationVectorsScalar(Vector3D firstVector, Vector3D secondVector){
        double result=firstVector.GetX()*secondVector.GetX()+firstVector.GetY()*secondVector.GetY()+firstVector.GetZ()*secondVector.GetZ();
        return result;
    }
    public static Vector3D MultiplicationVectors(Vector3D firstVector, Vector3D secondVector){
        if(CheckCollineartyVectors(firstVector, secondVector)){
            Vector3D compositionVector = new Vector3D();
            return compositionVector;
        }
            double x=firstVector.GetY()*secondVector.GetZ()-firstVector.GetZ()*secondVector.GetY();
            double y=firstVector.GetX()*secondVector.GetZ()-firstVector.GetZ()*secondVector.GetX();
            double z=firstVector.GetX()*secondVector.GetY()-firstVector.GetY()*secondVector.GetX();
            Vector3D compositionVector = new Vector3D(x, y, z);
            return compositionVector;

    }
    public static boolean CheckCollineartyVectors(Vector3D firstVector, Vector3D secondVector){
        if(firstVector.GetX()/secondVector.GetX()==firstVector.GetY()/secondVector.GetY()&&firstVector.GetX()/secondVector.GetX()==firstVector.GetZ()/secondVector.GetZ()){
            return true;
        }
            return false;
    }
}
