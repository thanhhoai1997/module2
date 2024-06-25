package _09_dsa_stack_queue.bt_daonguocmangsonguyen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        int n = stack.size();
        String st = "";
        List<Integer> list = new ArrayList<Integer>();
       for (int i = 0; i < n; i++ ){
            list.add(stack.pop());
       }



       for (int i = 0; i < list.size();i++){
      stack.push(list.get(i));
       }
        System.out.println("stack sau khi dao nguoc :"  + stack);



//      for (int i = 0; i < st.length(); i++){
//          System.out.println(stack.pop(Integer.parseInt(st.charAt(i))));
//      }


    }
}

