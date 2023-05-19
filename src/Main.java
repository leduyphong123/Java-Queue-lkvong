public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.displayQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.displayQueue();


    }
}
