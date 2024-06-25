package _03_array_method.practice;

import java.util.Scanner;

public class timMaxmang2chieu {
    public static void main(String[] args) {
        int [][] matran = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matran.length;i++){
            for (int j = 0; j < matran[i].length; j++){
                System.out.println("nhap gia tri cho vi tri " +  i +"." + j + " : " );
                matran[i][j] = sc.nextInt();
            }

        }
        System.out.println("ma tran : ");
        for (int i = 0; i < matran.length;i++){
            for (int j = 0; j < matran[i].length; j++){
                System.out.print(matran[i][j] + " ");
            }
            System.out.println(" ");
        }
        int max = matran[0][0];
        for (int i = 0; i < matran.length; i++){
            for (int j = 0; j < matran[i].length;j++){
                if (matran[i][j] > max){
                    max = matran[i][j];
                }
            }
        }
        System.out.println("max = " + max);
    }
}
