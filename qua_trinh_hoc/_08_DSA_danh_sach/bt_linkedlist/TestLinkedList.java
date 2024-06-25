package _08_DSA_danh_sach.bt_linkedlist;

import java.util.Arrays;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(10);
        myLinkedList.add(2,3);
       myLinkedList.add(3,7);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(99);
        myLinkedList.add(1,10);
        myLinkedList.remove(0);
//      myLinkedList.remove(0);
//        System.out.println(myLinkedList.numNodes);
   myLinkedList.printlist();

    }
}
