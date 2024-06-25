package _11_timkiem_tuantu.th_tinhdophuctap_thuattoan;

import java.util.Scanner;

public class DoPhucTapThuatToan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String inputString = scanner.nextLine();
        int[] frequentChar = new int[255];
        for (int i = 0; i < frequentChar.length;i++){
            int ascii = (int) inputString.charAt(i);
            frequentChar[ascii] += 1;

        }
        int max = 0;
        char character = (char) 255;
        for (int j = 0; j < 255;j++){
            if (frequentChar[j] > max){
                max = frequentChar[j];
                character = (char) j;
            }
        }
        System.out.println(character + " : " + max );
    }
}
