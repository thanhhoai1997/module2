package _02_loop_in_java.practice;

import java.util.Scanner;

public class bt2 {
    static int i;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap luong so nguyen to cn in ra : ");
        int number = scanner.nextInt();
        int count = 0;
        int n = 2;
        while (count <= number){
            if (ckeckSoNguyenTo(n)){
                System.out.println(n);
                count++;
            }
            n++;
        }

    }

    public static boolean ckeckSoNguyenTo(int x) {
        for (i = 2; i <= Math.sqrt(x); i++) {
            if (x % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}


