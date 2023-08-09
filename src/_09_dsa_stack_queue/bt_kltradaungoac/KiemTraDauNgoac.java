package _09_dsa_stack_queue.bt_kltradaungoac;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoac {
    public static void main(String[] args) {
        int left =0;
        int right = 0;

        Stack<String> bStack = new Stack<>();
        String bieuThuc = "s * (s – a) * (s – b) * (s – c)  ".replaceAll(" ","");
        String[] arr = bieuThuc.split("");
        System.out.println(bieuThuc);

        for (int i = 0; i < arr.length; i++) {
           if (arr[i].equals("(")) {
              left++;

//            }else if (arr[i] == ")"){
//                if (bStack.isEmpty()){
//
//                }
//            }
          }

           if(arr[i].equals(")")){
                 right++;
           }

        }

        System.out.println(left==right ? "valid" : "invalid");
    }
}





