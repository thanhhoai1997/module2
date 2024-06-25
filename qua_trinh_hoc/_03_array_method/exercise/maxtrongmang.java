package _03_array_method.exercise;

import java.util.Scanner;

public class maxtrongmang {
    public static void main(String[] args) {
        int [] array ;
        Scanner scanner = new Scanner(System.in);
        int size ;

        do {
            System.out.println("nhap do dai mang: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("do dai mang khong qua 20 pt : ");
            }

        }while (size > 20);
        array = new int[size];

        int i = 0;
        while (i < array.length){
            System.out.println("nhap value tai vi tri  " + (i+1) + ":"  );
            array[i] = scanner.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 0;
        for (i = 0; i < array.length;i++){
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("phan tu lon nhat trong mang la : " + max + " co vi tri la : " + index);
    }

}
