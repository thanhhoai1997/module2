package _01_introduction_java.practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap mat khau");
        String password = sc.nextLine();
        while (!password.equals("vung oi mo ra")){
            System.out.println("moi ban nhap lai mat khau: ");
            password = sc.nextLine();
        }
        System.out.println("ban da nhap dung");

    }

}
