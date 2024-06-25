package _12_thuattoansapxep;

public class th_caidat_ttsapxepchon {
    public static void main(String[] args) {
        double [] arr = {1, 9, 4.5, 6.6, 5.7, -4.5};
        for (int i = 0; i < arr.length-1;i++){
            int i_min = i;
            double v_min  =  arr[i];
            for (int j = i+1; j < arr.length;j++){
                if (arr[j] < v_min){
                    v_min  =  arr[j];
                    i_min = j;
                }
                double  temp = arr[i];
                arr[i] = arr[i_min];
                arr[i_min] =  temp;
            }
        }
        for (int i = 0; i < arr.length;i++ ){
            System.out.print(arr[i]+" ");
        }
    }
}
