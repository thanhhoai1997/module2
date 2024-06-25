package _03_array_method.exercise;

public class timMinMang {
    public static void main(String[] args) {
        int [] arr = {2,6,8,5,9,24,33,11};
        System.out.println("gia tri nho nhat trong mang la : " + Min(arr));

    }
    public static int Min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
