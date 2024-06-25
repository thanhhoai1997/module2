package _07_abstract_interface.interface_comparable;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo",true,3.5);
        System.out.println("pre-sorted:");
        for (ComparableCircle circle: circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("sap xep mang");
        for (ComparableCircle circle: circles) {
            System.out.println(circle);

        }
    }

}
