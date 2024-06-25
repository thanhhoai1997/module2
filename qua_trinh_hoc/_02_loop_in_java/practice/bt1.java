package _02_loop_in_java.practice;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chon = -1 ;
        while (chon != 0){
            System.out.println("1 : in hinh chu nhat");
            System.out.println("2 : in hinh tam giac vuong");
            System.out.println("3: in tam giac can");
            System.out.println("4: thoat");
            System.out.println("moi bn chon : ");
            chon = input.nextInt();
            switch (chon){
                case 1:
                    for (int i = 0; i < 3; i++ ){
                        for (int j = 0; j < 7;j++){
                            System.out.print("*" + " ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5;i++){
                        for (int j = 0 ; j < i;j++){
                            System.out.print("*" + " ");
                        }
                        System.out.println(" ");
                    }
                    System.out.println("--------------");
                    for (int i = 1; i <= 5; i++){
                        for (int j = 1 ; j <= 6-i;j++){
                            System.out.print("*" + " ");
                        }
                        System.out.println(" ");
                    }
                    break;
                case 3:

                    for (int i = 1; i <= 5; i++){
                        int x = 0;
                        for (int j = 1; j <= 5-i;j++){
                            System.out.print(" " + " ");
                        }
                        while (x != (2*i -1)){
                            System.out.print("*" + " ");
                            x++;
                        }
                        System.out.println(" ");

                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("nhap sai so ");
                    break;

            }
        }

    }
}
