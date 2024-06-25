package _11_timkiem_tuantu.bt_chuoicon_lientiep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiConLienTiep {
    public static void main(String[] args) {
        LinkedList<Character> chuoiMax = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length();i++){
            LinkedList<Character> list = new LinkedList<>();
            list.add(s.charAt(i));
            for (int j = i+1; j < s.length();j++){
                if (list.getLast() < s.charAt(j) ){
                    list.add(s.charAt(j));
                }else {
                    break;
                }
            }
            if (list.size()> chuoiMax.size()){
                chuoiMax.clear();
                chuoiMax.addAll(list);
            }
            list.clear();
        }
        System.out.println("chuoi con lien tiep dai nhat: ");
        chuoiMax.forEach(v ->System.out.print(v + " "));
    }
}
