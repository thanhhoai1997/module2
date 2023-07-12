package _02_loop_in_java.exercise;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so a: ");
        a = scanner.nextInt();
        System.out.println("Nhap vao so b: ");
        b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        int uocChungMax = 0;
        if (a == 0 || b == 0) {
            System.out.println(a + "va" + b + "khong co UCLN");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN la " + a);
    }
}
