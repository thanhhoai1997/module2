package _02_loop_in_java.exercise;



import java.util.Scanner;

public class th_ktra_songuyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap number");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println("khong phai la so nguyen to");
        }else {
            int i = 2;
            boolean ckeck = true;
            while (i <= Math.sqrt(number)){
                if (number % i == 0){
                    ckeck = false;

                }
                i++;
            }
            if (ckeck){
                System.out.println(" is a prime");
            }else {
                System.out.println("is not a prime");
            }
        }

    }
}
