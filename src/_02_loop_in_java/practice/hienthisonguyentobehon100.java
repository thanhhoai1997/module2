package _02_loop_in_java.practice;

public class hienthisonguyentobehon100 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++){
            if (ckecksonguyento(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean ckecksonguyento(int x){
        for (int k = 2; k <= Math.sqrt(x);k++){
            if (x % k == 0){
                return false;
            }
        }
        return true;
    }
}
