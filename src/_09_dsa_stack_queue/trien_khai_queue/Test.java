package _09_dsa_stack_queue.trien_khai_queue;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enQueue(queue,1);
        queue.enQueue(queue,2);
        queue.enQueue(queue,3);

        queue.printQueue(queue);

    }
}
