package imit.student;

public class Vector3DArray {
    private int length;
    private Vector3D[] vectorArr;
    public Vector3DArray(int size){
        length=size;
        Vector3D[] vectorArr = new Vector3D[size];
        for(int i =0; i<size; i++){
            vectorArr[i]=new Vector3D();
        }
    }
    public int getArrayLength (){
        return  length;
    }
    public void changeVector (int position, Vector3D newVector){
        vectorArr[position]=newVector;
    }
    public double getMaxVectorLength(){
        double maxVectorLength=vectorArr[0].getLengthVector();
        for(int i=1; i<this.length; i++){
            if(maxVectorLength<vectorArr[i].getLengthVector()) {
                maxVectorLength = vectorArr[i].getLengthVector();
            }
        }
        return maxVectorLength;
    }
    public int findVector(Vector3D requiredVector){
        for(int i=0; i<this.length; i++){
            if(vectorArr[i].compareVector(requiredVector)){
                return i;
            }
        }
        return -1;
    }
    public Vector3D addAllVector() {
        Vector3D resultVector = new Vector3D();
        for(int i=0; i<this.length; i++){
            resultVector=Vector3DProcessor.addVectors(resultVector, vectorArr[i]);
        }
        return resultVector;
    }
    public Vector3D calculateLinearCombinationVectors(double[] arrayCoefficients) throws Exception{
        if(this.length!=arrayCoefficients.length){
            throw new Exception();
        }
        double x=0.0,y=0.0,z=0.0;
        for(int i=0; i<this.length; i++){
            x=x+arrayCoefficients[i]*vectorArr[i].getX();
            y=y+arrayCoefficients[i]*vectorArr[i].getY();
            z=z+arrayCoefficients[i]*vectorArr[i].getZ();
        }
        Vector3D linearCobination = new Vector3D(x, y, z);
        return linearCobination;
    }
    public Point3D[] movePointOnArrayVectors(Point3D movingPoint){
        Point3D[] ressultArrayMovingPoints = new Point3D[this.length];
        double x=movingPoint.getX(), y=movingPoint.getY(), z=movingPoint.getZ();
        for (int i=0; i<this.length; i++){
            ressultArrayMovingPoints[i]=new Point3D(x+vectorArr[i].getX(),y+vectorArr[i].getY(),z+vectorArr[i].getZ());
        }
        return ressultArrayMovingPoints;
    }
}
