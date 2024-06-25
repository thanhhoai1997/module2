package _13_xulyngoaile_debug.th_NumberFormatException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("nhap x");
            int x = scanner.nextInt();
            System.out.println("nhap y: ");
            int y = scanner.nextInt();
            calculate(x,y);
        }catch (InputMismatchException e){
            System.out.println("nhap sai kieu du lieu");
        }




    }
    public static void calculate(int x, int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x/y;
            System.out.println("tong = "  + a);
            System.out.println("hieu = " + b);
            System.out.println("tich = " + c);
            System.out.println("thuong = " + d);


        }catch (InputMismatchException e){
            System.out.println("nhap sai kieu du lieu : ");
        }catch (NumberFormatException e){
            System.out.println("nhap sai so");

        }catch (ArithmeticException e){
            System.out.println(" y != 0");
        }



    }
}
