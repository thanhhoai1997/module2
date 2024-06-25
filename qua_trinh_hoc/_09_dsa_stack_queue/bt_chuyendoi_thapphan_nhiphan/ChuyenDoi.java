package _09_dsa_stack_queue.bt_chuyendoi_thapphan_nhiphan;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoi {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhap so thap phan");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = 0;
        while (number > 0){

            temp = number % 2;
            stack.push(temp);
            number = number/2;
//            if (number == 0){
//                temp = number%2;
//                stack.push(temp);
//                break;
//            }
        }
//        System.out.println(stack);
        System.out.println( "sang nhi phan la:  " );
       while (!stack.isEmpty()){
           System.out.print(stack.pop() + " ");

       }
    }
}
