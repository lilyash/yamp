package imit.student;

public class Vector3DProcessor {

    public static Vector3D addVectors(Vector3D firstVector, Vector3D secondVector){
        double x=firstVector.getX()+secondVector.getX();
        double y=firstVector.getY()+secondVector.getY();
        double z=firstVector.getZ()+secondVector.getZ();
        Vector3D sumVector=new Vector3D(x, y, z);
        return sumVector;
    }
    public static double multiplicationVectorsScalar(Vector3D firstVector, Vector3D secondVector){
        double result=firstVector.getX()*secondVector.getX()+firstVector.getY()*secondVector.getY()+firstVector.getZ()*secondVector.getZ();
        return result;
    }
    public static Vector3D multiplicationVectors(Vector3D firstVector, Vector3D secondVector){
       /* if(checkCollineartyVectors(firstVector, secondVector)){
            Vector3D compositionVector = new Vector3D();
            return compositionVector;
        }*/
            double x=firstVector.getY()*secondVector.getZ()-firstVector.getZ()*secondVector.getY();
            double y=firstVector.getX()*secondVector.getZ()-firstVector.getZ()*secondVector.getX();
            double z=firstVector.getX()*secondVector.getY()-firstVector.getY()*secondVector.getX();
            Vector3D compositionVector = new Vector3D(x, y, z);
            return compositionVector;

    }
    public static boolean checkCollineartyVectors(Vector3D firstVector, Vector3D secondVector){
        if(firstVector.getX()/secondVector.getX()==firstVector.getY()/secondVector.getY()&&firstVector.getX()/secondVector.getX()==firstVector.getZ()/secondVector.getZ()){
            return true;
        }
            return false;
    }
}
