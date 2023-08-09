package _08_DSA_danh_sach.Test;
import java.util.LinkedList;
public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(9);
        linkedList.add(10);
        System.out.println(linkedList);
        // get: lay phan tu tai vi tri thu i
        for (int i = 0; i < linkedList.size(); i++){
            System.out.println(linkedList.get(i));
        }
        for (int value: linkedList
             ) {
            System.out.print(value + " ");

        }
        System.out.println("----------------------");
        // addAll:
        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.add(22);
        linkedList1.add(23);
        linkedList1.add(22);
        linkedList1.add(25);
        linkedList1.add(28);
        linkedList.addAll(linkedList1);
        System.out.println(linkedList);
        // truy cap phan tu:
        // get
        System.out.println(linkedList.get(1));
        // getFirst: truy cap pt dau tien
        System.out.println(linkedList.getFirst());
        // getLast: truy cap phan tu cuoi cung
        System.out.println(linkedList.getLast());
        //cap nhat gia tri ptu
        linkedList.set(2,99);
        System.out.println(linkedList);
        // xoa ptu trong danh sach
        // remove
        linkedList.remove(1);
        System.out.println(linkedList);
        // removeFirt: xoa dau tien
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        linkedList.addLast(9);


    }

}
