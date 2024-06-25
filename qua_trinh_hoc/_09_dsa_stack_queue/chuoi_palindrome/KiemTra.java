package _09_dsa_stack_queue.chuoi_palindrome;

import java.util.*;

public class KiemTra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String arr[] = st.split("");
        Stack<String> s = new Stack<>();
        Queue<String> q = new LinkedList<>();
        for (String element: arr
             ) {
            s.push(element);
            q.offer(element);
        }


        System.out.println(s);
        System.out.println(q);
        String stStack = "";
        String stQueue ="";
        while (!s.isEmpty()){
            stStack = stStack+s.pop();
        }
        System.out.println(" ");
        while (!q.isEmpty()){
            stQueue += q.poll();
        }
        System.out.println(stQueue.toLowerCase());
        System.out.println(stStack.toLowerCase());
        if (stStack.equals(stQueue)){
            System.out.println("day la chuoi doi xung");
        }else {
            System.out.println("day kp la chuoi doi xung");
        }

    }

}
