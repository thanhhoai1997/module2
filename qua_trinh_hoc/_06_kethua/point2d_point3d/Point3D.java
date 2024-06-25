package _06_kethua.point2d_point3d;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {


    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ(float arr[]){
        arr[0] =this.getX();
        arr[1] = this.getY();
        arr[2] = this.z;
        return arr;

    }

    @Override
    public String toString() {
        return "{" + this.getX() +";" + this.getY() + ";" + this.z + "}";
    }
}
