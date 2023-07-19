package _03_array_method.practice;

import java.util.Scanner;

public class min_trongmang {
    public static void main(String[] args) {
        int [] mang = new int[7];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < mang.length;i++){
            System.out.println("nhap gia tri tai vi tri " +(i+1) + " : " );
            mang[i] = input.nextInt();
        }
        for (int i = 0; i < mang.length; i++){
            System.out.print(mang[i] + " ");
        }
        int min = mang[0];
        for (int i = 1 ; i < mang.length;i++){
            if (mang[i] < min){
                min = mang[i];
            }
        }
        System.out.println("min = " + min);

    }
}
