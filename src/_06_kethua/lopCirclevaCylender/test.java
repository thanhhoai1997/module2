package _06_kethua.lopCirclevaCylender;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(2.3,"blue");
        System.out.println(circle);
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(4);
        System.out.println(cylinder);
        System.out.println(cylinder.getTheTich());
        cylinder = new Cylinder(4.5,"red",7);
        cylinder.setRadius(5);
        System.out.println(cylinder);
        System.out.println(cylinder.getTheTich());
//     float a[] = new float[2];

    }
}
