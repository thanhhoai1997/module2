package _03_array_method.practice;

import java.util.Scanner;

public class tinhcotMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matran = new int[3][5];
//        int [][] matran = {
//                {2,4,6,8,9},
//                {9,1,3,2,3},
//                {7,8,9,1,1}
//        };
        for (int i = 0;i < matran.length;i++){
            for (int j = 0; j < matran[i].length;j++){
                System.out.println("nhap vi tri tai " + i + "." + j + ":" );
                matran[i][j] = sc.nextInt();
            }
        }
        System.out.println("--------");
        System.out.println("MA TRAN");
        for (int i = 0;i < matran.length;i++){
            for (int j = 0; j < matran[i].length;j++){
                System.out.print(matran[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int nhap = 0 ;


        System.out.println("ban muon tinh tong cot bao nhieu cua ma tran : ");
        nhap = sc.nextInt();
        int sum = 0;
        for (int j = 0; j < matran[0].length;j++){
            for (int i = 0; i < matran.length;i++){
                if (j == nhap){
                    nhap = j;
                    sum += matran[i][j];

                }
            }
        }
        System.out.println("tong cot " + nhap + " = " + sum);

    }

}
