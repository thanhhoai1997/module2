package _12_thuattoansapxep;

public class th_caidat_sapxepnoibot {
    public static void main(String[] args) {
        int [] list = {2,3,2,5,6,1,-2,3,14,12};
        boolean  needNextPass = true;
        for (int i = 1;i < list.length && needNextPass;i++){
            needNextPass = false;
            for (int j = 0; j < list.length-i;j++){ // length = 9-1
                if (list[j] > list[j+1]){
                    int temp =  list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    needNextPass = true;
                }
            }
        }
        for (int i = 0; i < list.length;i++){
            System.out.print(list[i] + " ");
        }
    }
}
