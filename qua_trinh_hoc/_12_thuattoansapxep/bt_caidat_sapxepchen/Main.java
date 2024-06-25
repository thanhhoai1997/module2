package _12_thuattoansapxep.bt_caidat_sapxepchen;

public class Main {
    public static void main(String[] args) {
        int arr[] = {2,5,7,23,56,9,4,77,11,5};
        insertionSort(arr);
        for (int value: arr
             ) {
            System.out.print(value + " ");

        }

    }
    public static void insertionSort(int [] arr){
        for (int i = 1; i < arr.length;i++){
            int j = i;
            while (j > 0  && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
