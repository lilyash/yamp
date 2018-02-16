package yamp.vectors;

public class Point_3D {
    private double x, y, z;

    public Point_3D(double x, double y, double z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    public Point_3D(){
        this.x=0.0;
        this.y=0.0;
        this.z=0.0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z=z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point_3D)) return false;

        Point_3D point_3D = (Point_3D) o;

        if (Double.compare(point_3D.getX(), getX()) != 0) return false;
        if (Double.compare(point_3D.getY(), getY()) != 0) return false;
        return Double.compare(point_3D.getZ(), getZ()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getX());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getY());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getZ());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Point_3D{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
