package _13_xulyngoaile_debug.bt_IllegalTriangleException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap do dai 3 canh tam giac : ");
        System.out.println("-------------------");
        System.out.println("nhap canh a: ");
        double a = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap canh b : ");
        double b = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap canh c");
        double c = sc.nextDouble();
        sc.nextLine();
        IllegalTriangleException ktra = new IllegalTriangleException(a,b,c);
        try {
           ktra.kiemTraNgoaiLe();
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }catch (IllegalTriangleException e){
            System.out.println(e);
        }
    }


}
