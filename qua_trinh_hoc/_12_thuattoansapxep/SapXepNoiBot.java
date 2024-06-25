package _12_thuattoansapxep;

public class SapXepNoiBot {
    public static void main(String[] args) {
        int[] arr = {5,4,8,7,9,0,3,2,1,6};
        for (int i = 0; i < arr.length-1;i++){
            for (int j = 0; j < arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp; // 4 5 0 3 2 1 6 7  8 9
                }

            }
        }
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
