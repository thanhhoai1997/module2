package _02_loop_in_java.exercise;

import java.util.Scanner;

public class tinhtienlai {
    public static void main(String[] args) {
        double money ;
        double month ;
        double interestRate ;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tien dau tu : ");
        money = input.nextDouble();
        System.out.println("nhap so thang gui :");
        month = input.nextDouble();
        System.out.println("nhap lai suat :");
        interestRate = input.nextDouble();
        double tongtienlai = 0;
        for (int i = 0; i < month;i++){
            tongtienlai += money*(interestRate/100)/12*month;
        }
        System.out.println("tong tien lai = " + tongtienlai);
    }
}
