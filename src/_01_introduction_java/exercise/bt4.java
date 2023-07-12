package _01_introduction_java.exercise;

import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        final double vnd = 23000;
        double usd ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi ban nhap usd : ");
        usd = scanner.nextDouble();
        double quydoi = usd*vnd;
        System.out.println("doi tu usd sang vnd la : " + quydoi + "vnd");
    }

}
