package _13_xulyngoaile_debug.th_ArrayIndexOutOfBoundsException;

import java.util.Random;
import java.util.Scanner;

public class Test {
   public Integer[] creatRandom(){
       Random rd = new Random();
       Integer[] arr = new Integer[100];
       for (int i = 0; i < arr.length;i++){
           arr[i] = rd.nextInt(100);
           System.out.print(arr[i] + " ");

       }
       return arr;
   }

    public static void main(String[] args) {
        Test test = new Test();
        Integer[] arr = test.creatRandom();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap mot chi so cua ptu bat ki: ");
        int x = sc.nextInt();
        sc.nextLine();
        try{
            System.out.println("gia tri tai chi so : " + x + " la :" + arr[x]);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("chi so vuot qua gioi han cua mang");
        }
    }
}
