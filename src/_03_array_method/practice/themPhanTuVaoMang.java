package _03_array_method.practice;

import java.util.Scanner;

public class themPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length - 3; i++) {
            System.out.println("nhap gia tri trai vi tri " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("nhap vi tri can chen vao mang: ");
        int index = sc.nextInt();
        System.out.println("nhap gi tri muon chen vao mang");


        int x = sc.nextInt();
        if (index < 0 && index >= arr.length - 1) {
            System.out.println("khong chen duoc phan tu vao mang");
        } else {


            for (int i = arr.length-1; i > index; i--) {

                arr[i] = arr[i - 1];
                // 1 2 9 3 4 5 6 7 1 2
//1 2 9 3 4 5 6 7 1 2

            }
            arr[index] = x;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}

