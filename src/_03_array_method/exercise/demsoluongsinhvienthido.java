package _03_array_method.exercise;

import java.util.Scanner;

public class demsoluongsinhvienthido {
    public static void main(String[] args) {
        int [] danhsachdiem;
       int size = 0 ;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhap do dai mang");
            size = input.nextInt();
            if (size > 30){
                System.out.println("do dai mang k qua 30 phan tu");
            }
        }while (size > 30);
        danhsachdiem = new int[size];
        for (int i = 0; i < danhsachdiem.length;i++){
            System.out.println("nhap diem cho sinh vien tai vi tri " + (i+1) + ":");
            danhsachdiem[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < danhsachdiem.length; i++){
            System.out.println("dien cua sinh vien tai vi tri " + (i+1) +  ": " + danhsachdiem[i]);
            if (danhsachdiem[i] > 5 && danhsachdiem[i] <= 10){
                count++;

            }
        }
        System.out.println("so luong hoc sinh thi do la : " + count);
    }


}
