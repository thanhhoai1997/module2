package _03_array_method.exercise;

import java.util.Scanner;

public class th_daonguocphantucuamang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner =new  Scanner(System.in);
        do {
            System.out.println("nhap size");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("do dai k vuot qua 20");
            }

        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("nhap gia tri   " + (i+1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("mang da nhap");
        for ( i = 0; i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        for (i = 0; i < array.length/2;i++){
            int tem = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tem;

        }
        System.out.println("mang dao nguoc");
        for (i = 0; i < array.length;i++){

            System.out.print(array[i] + "/");

        }

    }
}
