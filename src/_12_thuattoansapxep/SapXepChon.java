package _12_thuattoansapxep;

public class SapXepChon {
    public static void main(String[] args) {
        int[] arr = {7,9,3,4,6,8,1,2};// 1 2 3 4 6 8 7 9
        for (int i = 0; i < arr.length-1;i++){
            int i_min =  i;
            int v_min = arr[i]; // 9
            for (int j = i; j < arr.length;j++){
                if (arr[j]< v_min){
                    v_min =  arr[j]; //3 1 3  2
                    i_min = j; //2 6 2 7
                }
            }
            int temp = arr[i];

            arr[i] =  arr[i_min];
            arr[i_min] = temp;

        }
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i]  +" ");
        }
    }
}
