package _03_array_method.practice;

import java.util.Scanner;

public class xoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int [] arr = {2,4,6,7,8,9,10,3,1};
        int index = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tu muon xoa");
        int x = sc.nextInt();
        for (int i = 0; i < arr.length;i++){
            if (arr[i] == x){
                index = i;
                System.out.println("value : " + arr[i] + " index " + index);
            }
        }
        for (int i = index;i < arr.length-1;i++ ){
            arr[i] = arr[i+1];
            if (arr[i+1] == arr[arr.length-1]){
                arr[i+1] = 0;

            }

        }
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
