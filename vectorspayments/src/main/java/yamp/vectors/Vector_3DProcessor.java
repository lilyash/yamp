package yamp.vectors;

public class Vector_3DProcessor {
    public static Vector_3D add(Vector_3D first, Vector_3D second){
        double x=first.getX()+ second.getX();
        double y=first.getY()+ second.getY();
        double z=first.getZ()+ second.getZ();
        return new Vector_3D(x, y, z);
    }
    public static Vector_3D difference(Vector_3D first, Vector_3D second){
        double x=first.getX()- second.getX();
        double y=first.getY()- second.getY();
        double z=first.getZ()- second.getZ();
        return new Vector_3D(x, y, z);
    }
    public static double scalarProduct(Vector_3D first, Vector_3D second){
        double x=first.getX()* second.getX();
        double y=first.getY()* second.getY();
        double z=first.getZ()* second.getZ();
        return x+y+z;
    }
    public static Vector_3D vectorProduct(Vector_3D first, Vector_3D second){
        double x=first.getY()* second.getZ()-first.getZ()*second.getY();
        double y=first.getX()* second.getZ() - first.getZ()*second.getX();
        double z=first.getX()* second.getY() - first.getY()*second.getX();
        return new Vector_3D(x,y,z);
    }
    public static boolean checkCollinear(Vector_3D first, Vector_3D second) {
        double x=first.getY()* second.getZ()-first.getZ()*second.getY();
        double y=first.getX()* second.getZ() - first.getZ()*second.getX();
        double z=first.getX()* second.getY() - first.getY()*second.getX();
        return x == 0 && y == 0 && z == 0;
    }
}
