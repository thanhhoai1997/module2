package _09_dsa_stack_queue.bt_daonguocmangsonguyen;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocChuoi {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        System.out.println("nhap chuoi : ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String mWork[] = string.split(" ");
        for (int i = mWork.length-1 ; i >= 0; i-- ){
            wStack.push(mWork[i]);
        }
//        for (String value : mWork
//        ) {
//            wStack.push(value);
//
//        }


    }
}
