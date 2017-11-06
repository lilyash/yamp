package com.company;


public class Vector3DArray {
    private Vector_3D [] vector;

    public Vector3DArray(int size){
        vector=new Vector_3D[size];
        for(int i=0;i<vector.length;i++){
            vector[i]= new Vector_3D();
        }
    }

    public Vector3DArray(Vector_3D[] arr) {
        vector=new Vector_3D[arr.length];
        for(int i=0; i<arr.length; i++){
            vector [i]=arr[i];
        }
    }

    public Vector_3D extract(int index){
        return vector[index];
    }

    public int getSize(){
        return vector.length;
    }

    public void changeVector(Vector_3D newVector, int index){
        vector[index]= new Vector_3D (newVector.getX(),newVector.getY(),newVector.getZ());
    }

    public double findMaxLength(){
        double maxlength=0;
        for(int i=0;i<vector.length;i++){
            if (maxlength<vector[i].getVectorLength()){
                maxlength=vector[i].getVectorLength();
            }
        }
        return maxlength;
    }

    public int findIndex(Vector_3D lossVector){
        for(int i=0;i<vector.length;i++){
            if (lossVector.equals(vector[i])){
                return i;
            }
        }
        return -1;
    }

    public Vector_3D addAllVectors(){
        Vector_3D result = new Vector_3D();
        for(int i=0;i<vector.length;i++){
            result = Vector_3DProcessor.add(result,vector[i]);
        }
        return result;
    }

    public Vector_3D getLinComb(double[] array) throws DiffArraysLengthException {
        if(array.length!=vector.length){
            throw new DiffArraysLengthException();
        }
        double x=0, y=0,z=0;
        for (int i=0;i<vector.length;i++){
            x+=vector[i].getX()*array[i];
            y+=vector[i].getY()*array[i];
            z+=vector[i].getZ()*array[i];
        }
        return new Vector_3D(x,y,z);
    }
    public Point_3D[] movePoint(Point_3D p){
        Point_3D[] result = new Point_3D[vector.length];
        for (int i=0; i<result.length;i++){
            result[i]= new Point_3D(
                    p.getX()+ vector[i].getX(),
                    p.getY()+ vector[i].getY(),
                    p.getZ()+ vector[i].getZ()
            );
        }
        return result;
    }
}
