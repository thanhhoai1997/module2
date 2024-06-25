package _01_introduction_java.practice;

import java.util.Scanner;

public class pt_bac_1 {
    public static void main(String[] args) {
        System.out.println("pt bac 1 : a*x + b = c");
        double a ;
        double b;
        double c;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" a = ");
        a = scanner.nextDouble();
        System.out.println("b = ");
        b = scanner.nextDouble();
        System.out.println("c = ");
        c = scanner.nextDouble();
        if (a != 0){
            x = (c - b) / a;
            System.out.println("pt co 1 nghiem x = " + x);
        }else {
            if (c == b){
                System.out.println("pt co vo so nghiem");
            }else {
                System.out.println("pt vo nghiem");
            }
        }
    }
}
