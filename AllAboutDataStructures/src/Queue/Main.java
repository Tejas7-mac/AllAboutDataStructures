package Queue;

public class Main {

    public static void main(String []args) {

        // create a queue of capacity 3.

        Queue queue = new Queue(3);

        System.out.println("Checking Queue is empty or not:" +queue.isEmpty());

        // inserting the data inside the queue.

        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);

        // deleting the data in the queue.
        queue.deQueue();
        queue.deQueue();

        // display the data inside the queue.
        queue.display();


        // insert the data to the Queue.
        queue.enQueue(0);

        // display the front data in the queue.
        queue.queueFront();

    }
}
