package com.company;

public class Vector_3D {
    private double x, y, z;

    public Vector_3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public Vector_3D(){
        this.x=0.0;
        this.y=0.0;
        this.z=0.0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Vector_3D(Point_3D start, Point_3D end){
        this.x=end.getX()- start.getX();
        this.y=end.getY()- start.getY();
    }

    public double getVectorLength(){
        return Math.sqrt(this.x*this.x+this.y*this.y+this.z*this.z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vector_3D)) return false;

        Vector_3D vector_3D = (Vector_3D) o;

        if (Double.compare(vector_3D.x, x) != 0) return false;
        if (Double.compare(vector_3D.y, y) != 0) return false;
        return Double.compare(vector_3D.z, z) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(z);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Vector_3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
