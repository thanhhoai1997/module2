package _09_dsa_stack_queue.trien_khai_queue;

public class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;

    }

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", link=" + link +
                '}';
    }
}
