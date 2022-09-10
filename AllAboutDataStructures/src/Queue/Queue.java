package Queue;

/**
 * Class which has the method to implement the queue.
 * @author tejas.
 */

public class Queue {

    private static int front, rear, capacity;

    private static int queue[];

    Queue(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }


    /**
     * insert the element in the Queue
     * @param data will be added to the queue if queue is not full.
     */
      void enQueue(int data) {

         if(capacity == rear) {
             System.out.println("Sorry the Queue is Full");
             return;
         } else {
             queue[rear] = data;
            rear++;
         }
         return;
    }

    /**
     * Remove the element from the queue.
     */

     void deQueue() {
        if(front == rear) {

            System.out.println("The Queue is empty");

        } else  {

            for(int index = 0; index < rear - 1; index++) {

                queue[index] =queue[index + 1];

            }

        }

        if(rear < capacity) {

            queue[rear] = 0;
            rear--;

        }
    }


    /**
     * Display The data inside the queue;
     */

     void display() {

        int index;

        if(front == rear) {

            System.out.println("The Queue is Empty");

        }
        System.out.println(" Queue  data :- ");

        for(index = front; index < rear; index++) {

            System.out.println(queue[index]);

        }

    }

    /**
     * Display the front of the queue.
     */

      void queueFront() {

        if(front == rear) {

            System.out.println("The Queue is empty");

        }

        System.out.println(queue[front]);

    }


    /**
     * return the size of the queue;
     */

     void sizeOfQueue() {

        System.out.println(queue.length);

    }

    /**
     * This method will check weather the Queue is empty or not.
     * @return the true or false .
     */

    boolean isEmpty() {

        if(front == rear) {

            return true;
        }

        return  false;
    }

}
