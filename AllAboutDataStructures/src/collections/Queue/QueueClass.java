package collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implementation of the queue class in java.
 */

public class QueueClass {
    /**
     * The Queue follows FIFO :- the element inserted first will be removed first.
     * Here in this class we will explore the method present in collection framework for queue interface.
     */
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        /**
         * 1) Insert an element in the queue.
         */
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Queue after adding the data :-");
        for(int data :queue) {

            System.out.println(data);

        }
        /**
         * 2) remove the element in the queue.
         *  -> the element which is added first will be removed from the queue first.
         */

        queue.poll();
        System.out.println("Queue after removing the first added element :-");

        for (int data:queue) {
            System.out.println(data);
        }
        /**
         * 3) peek :- is to peek the element at the top of the queue.
         */
        System.out.println("printing the element which is at the top i.e next element which will be removed when we use the pop method");
        queue.peek();

        /**
         * 4) isEmpty :- check weather the given queue is empty or not.
         */
        System.out.println("Queue is empty or not :-" +queue.isEmpty());

        /**
         * contains:- check for a particular data present in the Queue.
         */

        System.out.println("Does queue contains 1 :-" +queue.contains(1));
    }


}
