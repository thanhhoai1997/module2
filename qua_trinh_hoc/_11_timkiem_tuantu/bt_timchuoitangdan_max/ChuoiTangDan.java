package _11_timkiem_tuantu.bt_timchuoitangdan_max;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //O(1)
        System.out.println("moi  ban nhap chuoi");
        String  s  = sc.nextLine(); // O(1)
        LinkedList<Character> max = new LinkedList<>(); // O(1)
        for (int i = 0; i < s.length();i++){ // O(n)
            LinkedList<Character> list = new LinkedList<>();
            list.add(s.charAt(i));
            System.out.println(list);
            for (int j = i+1; j  <  s.length(); j++ ){//O(n)
                if (s.charAt(j) > list.getLast()){//O(1)
                    list.add(s.charAt(j));
                    System.out.println(list);
                }
            }
            System.out.println("do dai cua list sau moi lan them " + list.size());
            if (list.size() > max.size()){ // them list vao  size sau moi lan lap, neu co list lon  hon  thi xoa max cu va them list moi lon hon vao
                max.clear();   //O(1)
                max.addAll(list);

            }
            System.out.println(list);
           list.clear();


        }

        System.out.println("do dai cua list lon nhat la: " +  max.size());
        System.out.println("chuoi lien tiep lon  nhat la: ");
        max.forEach(v->     // O(n)
                System.out.print(v + ""));

    }
    /**
     * do phuc tap thoat toan:
     * ben ngoai  : (1 + 1 +1 ) va vong forEach (n)
     * ben trong vong for :
     * + vong for ngoai (n)
     * +vong for trong  (1*n)
     * tong vong lap for: (n)*(1+n)
     *tong thuat toan:
     *  T(n) = O(3) +  O(n)*O(1+n)  + O(n) =  O(n  + n^2) + O(n) = O(n^2)+ O(n) = O(n^2)
     *  do phuc tap thuat toan nay la : O(n^2)
     */


}
