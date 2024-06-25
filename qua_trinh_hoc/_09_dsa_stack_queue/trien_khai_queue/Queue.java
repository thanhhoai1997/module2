package _09_dsa_stack_queue.trien_khai_queue;

public class Queue {
    Node front;
    Node rear;


    public Queue() {


    }

    public void enQueue(Queue queue, int data) {
        Node temp = new Node();
        temp.data = data;
        if (queue.front == null) {
            queue.front = queue.rear = temp;
        } else {
            queue.rear = temp;

        }
        queue.rear.link = queue.front.link;
    }

    public Node deQueue(Queue queue) {
        Node temp = queue.front;
        if (queue.front == null) {
            return null;

        } else {
            if (queue.front == queue.rear) {
                queue.front = queue.rear = null;
            } else {
                queue.front = queue.front.link;
                queue.front.link = queue.front;
            }
        }
        return temp;

    }

    public void printQueue(Queue queue) {

        Node temp = queue.front;
        while (temp.link != queue.front) {
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}
