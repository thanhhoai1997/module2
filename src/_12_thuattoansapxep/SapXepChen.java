package _12_thuattoansapxep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SapXepChen {
    public static void main(String[] args) {
        Integer [] arr = {2,1,4,7,6,5,9,0};
        for (int i = 1;i<arr.length;i++){
            int j = i;
            while (j > 0 && arr[j] <= arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]  = temp;
                j--;                //1                                                                       
            }    
        }
        for (int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
