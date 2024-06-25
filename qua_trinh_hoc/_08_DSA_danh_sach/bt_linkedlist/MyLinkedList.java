package _08_DSA_danh_sach.bt_linkedlist;

public class MyLinkedList <E> {
    Node head;
    int numNodes = 0;

    public MyLinkedList(Object data) {
        head = new Node(data);

    }

    public MyLinkedList() {
    }
    public int size(){
        return numNodes;
    }
    public Object get(E index){
        Node temp = head;
        for (int i = 0; i < size();i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public  boolean contains(E element){
        Node temp = head;
        while (temp.next != null){
            if (temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        if (temp.data.equals(element)){
            return true;
        }
        return false;
    }
    public int indexOf(E element){
        Node temp = head;
        for (int i = 0;i < numNodes; i++){
            if ((E) temp.getData() == element){
                return i;
            }

        }
        return -1;
    }

    public void add(int index, Object e) {
        Node temp = head;
        Node hoder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        hoder = temp.next;
        temp.next = new Node(e);
        temp.next.next = hoder;
        numNodes++;

    }

    public void addFirst(Object element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;

    }
    public void addLast(E e){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }
//    public void  addLast(Object element){
//        Node temp = head;
//        for (int i = 0; i <   ; i++ ){
//            temp = temp.next;
//            if (temp.next == null){
//                temp = new Node(element);
//            }
//        }

    //    }
    public E remove(int index) {
        Node temp = head;
        Object data;
       if (index == 0){
           data = temp.next;
           head = head.next;
       }else {
           for (int i = 0; i < index - 1 && temp.next != null;i++){
               temp = temp.next;
           }
           data = temp.next.data;
           temp.next = temp.next.next;
       }
       numNodes--;
       return (E) data;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
