package _09_dsa_stack_queue.bt_demsolanxuathien_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemChuoi {
    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String s = sc.nextLine();
        Map<String,Integer> treeMap = new TreeMap<>();
        int value = 1;
        String[] arr = s.split(" ");
     for (int i = 0; i < arr.length;i++){
         if (treeMap.containsKey(arr[i])){
            Integer a =  treeMap.get(arr[i]);
            treeMap.put(arr[i], a+1);

         }else {
             treeMap.put(arr[i].toLowerCase(),value);
         }
     }
        System.out.println(treeMap);


    }
}
