package _11_timkiem_tuantu.tim_kiem_chuoi_tang_dan;

import java.util.LinkedList;
import java.util.Scanner;

public class TimKiemChuoiTang {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("nhap chuoi : ");
        String s =  sc.nextLine();

        LinkedList<Character>  chuoiMax  = new LinkedList<>();
        for (int i = 0; i < s.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(s.charAt(i));
            for (int j = i + 1; j < s.length();j++){
                if (list.getLast() < s.charAt(j)){
                    list.add(s.charAt(j));

                }
            }
            if (list.size() > chuoiMax.size()){
                chuoiMax.clear();
                chuoiMax.addAll(list);
            }
            list.clear();
        }
        System.out.println("chuoi tang dan lon nhat cua chuoi : " +  s + " la :");
        for (Character c: chuoiMax
             ) {
            System.out.print(c + "");
        }
    }
}
