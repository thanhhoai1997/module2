package _11_timkiem_tuantu.bt_thuattoantimkiem_nhiphan;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BinarySeachDeQuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[7];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap gia tri tai phan tu thu " + (i + 1));
            arr[i] = sc.nextInt();

        }

        Collections.sort(Arrays.asList(arr));
        Arrays.asList(arr).forEach(v -> System.out.print(v + " "));

        System.out.println("");
        int left = 0;
        int right = arr.length - 1;
        System.out.println(binarySearch(arr, left, right, 5));

    }

    public static int binarySearch(Integer[] arr, int left, int right, Integer value) {
        int middle = (left + right) / 2; //3 // 5

        if (arr[middle] == value) { // 1,2,3,4,5,6,7
            return middle;
        } else if (value > arr[middle]) {
            left = middle + 1; //4

        } else {
            right = middle - 1;
        }

        if (left <= right) {
            return binarySearch(arr, left, right, value);//4 + 6
        }else {
            return -1;
        }
    }
}
