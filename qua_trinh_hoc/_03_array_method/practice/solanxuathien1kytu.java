package _03_array_method.practice;

import java.util.Scanner;

public class solanxuathien1kytu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nhapchuoi ;
        char nhapkitu;
        int count = 0;
        System.out.println("nhap chuoi : ");
        nhapchuoi = input.nextLine();
        System.out.println("nhap ki tu: ");
        nhapkitu = input.next().charAt(0);
        for (int i = 0; i < nhapchuoi.length();i++){
            if (nhapchuoi.charAt(i) == nhapkitu){
                count ++;
            }
        }
        System.out.println(count);

    }
}
