package _01_introduction_java.practice;

import java.util.Scanner;

public class ktranamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year ;
        System.out.println("nhap nam : ");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("la nam nhuan");
        }else {
            System.out.println("kp la nam nhuan");
        }
    }
}
