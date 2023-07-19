package _03_array_method.practice;

import java.util.Scanner;

public class tinhtongduongcheochinh {
    public static void main(String[] args) {
        double [][] matran  = new   double [4][4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matran.length;i++){
            for (int j = 0; j < matran[i].length;j++){
                System.out.println("nhap  value tai vi tri " + i + "." + j +":");
                matran[i][j] = input.nextDouble();
            }

        }
        System.out.println("MA TRAN");
        for (int i = 0; i < matran.length;i++){
            for (int j = 0; j < matran.length;j++){
                System.out.print(matran[i][j] + "  ");
            }
            System.out.println(" ");
        }
        int sum = 0;
        for (int i = 0; i < matran.length;i++){
            for (int j = 0 ; j < matran.length; j++){
                if (matran[i][j] == matran[i][i]){
                    System.out.println("gai tri tai [i][i]: " + matran[i][j] + " ");
                    sum += matran[i][j];
                }
            }
        }
        System.out.println("tong duong cheo : " + sum);
    }



}
