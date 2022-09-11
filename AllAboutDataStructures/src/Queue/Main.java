package Queue;

public class Main {

    public static void main(String []args) {

        // create a queue of capacity 3.

        Queue queue = new Queue(3);

        System.out.println(queue.isEmpty());

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
        queue.enQueue(1);

        // display the front data in the queue.
        queue.queueFront();

    }

    /**
     * Let's solve some problems on queue.
     * https://leetcode.com/problemset/all/?page=1&difficulty=EASY&topicSlugs=queue
     */
}
