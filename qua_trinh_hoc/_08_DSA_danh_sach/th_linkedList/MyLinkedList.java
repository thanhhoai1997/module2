package _08_DSA_danh_sach.th_linkedList;


import org.w3c.dom.NodeList;

public class MyLinkedList  {
    private Node head;
    private int numNodes;
    public class Node {
        private Object data;
        private Node next;

        public Object getData() {
            return data;
        }

        public Node(Object data) {
            this.data = data;
        }
    }
  public MyLinkedList(Object data){
    head = new Node(data);
    }
    public void add(int index, Object data){
      Node temp = head;
      Node hoder;
      for (int i = 0; i < index-1 && temp.next != null; i++){
          temp = temp.next;

      }
      hoder = temp.next;
      temp.next = new Node(data);
      temp.next.next = hoder;
      numNodes++;
    }
    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index;i++){
            temp = temp.next;
        }
        return temp;
    }
    public void printlist(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }



}
