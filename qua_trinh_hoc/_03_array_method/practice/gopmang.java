package _03_array_method.practice;

import java.util.Scanner;

public class gopmang {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        int [] arr2 = new int[4];
        int i ;
        int [] arr3 = new int[arr1.length+ arr2.length];
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < arr1.length;i++){
            System.out.println("nhap value tai vi tri " + (i+1) + " trong arr1 : ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("mang 1 :");
        for (int value : arr1){
            System.out.print(value + " "  );
        }
        System.out.println(" ");
        for (i = 0; i < arr2.length;i++){
            System.out.println("nhap value tai vi tri " + (i+1) + " trong arr2 :");
            arr2[i] = sc.nextInt();
        }
        System.out.println(" ");

        System.out.println("mang 2: ");
        for (int value : arr2){
            System.out.print(value + " ");

        }
        System.out.println(" ");
        for (i = 0; i < arr1.length ;i++){
            arr3[i] = arr1[i];
        }
        for (i = 0; i < arr2.length;i++ ){
            arr3[i + (arr1.length)] = arr2[i];
        }
        System.out.println("mang 3 : ");
        for (i = 0; i < arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }
    }

}
