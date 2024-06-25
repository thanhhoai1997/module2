package _06_kethua.point2d_point3d;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        float arr[] = new float[2];
        System.out.println("point2d");

        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(3,5);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY(arr)));
        point2D.setXY(7,8);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY(arr)));
        System.out.println("point3d");
        float arr2[] = new float[3];
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(3,5,7);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ(arr2)));
        point3D.setXYZ(7,8,9);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ(arr2)));

    }
}
