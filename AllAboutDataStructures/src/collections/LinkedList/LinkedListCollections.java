package collections.LinkedList;

/**
 * LinkedList in collection is formed by extending the AbstractSequentialList class and implements List and Deque interfaces.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * In this class we will explore the methods inside the LinkedList CLass and declaration and instantiation of linked list class.
 */
public class LinkedListCollections {

    /**
     * 1) Declaration and instantiation of Linked List class.
     * 2) Adding elements in LinkedList.
     * 3) Add elements at specific index.
     * 4) Add elements at starting of the list.
     * 5) Add elements at end of the list .
     * 6) Add all the elements in one linked list to another LinkedList.
     * 7) general types of iteration we use in linked List.
     */


    public static void main(String []args) {

        /**
         * Declaration and instantiation of Linked List class.
         */
        LinkedList<Integer> linkedList = new LinkedList<>();

        LinkedList<Integer> linkedListOne = new LinkedList<>();

        /**
         * Adding elements in LinkedList.
         */

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        /**
         *  Add elements at specific index.
         */

        linkedList.add(1, 8);
        linkedList.add(5, 10);

        /**
         * Add elements at starting of the list.
         */
        // we can also use offerFirst() method to do the same.
        linkedList.addFirst(0);

        /**
         * Add elements at end of the list .
         */
        // we can also use offerLast() method to do the same.
        linkedList.addLast(15);

        /**
         * Add all the elements in one linked list to another LinkedList.
         */
        linkedListOne.addAll(linkedList);

        /**
         * general types of iteration we use in linked List.
         * 1) using "Iterator".
         * 2) using for each loop.
         */

        /**
         * using "Iterator".
         */
        Iterator<Integer> iterator = linkedList.iterator();

        while(iterator.hasNext()) {

            System.out.println(iterator.next());

        }

        /**
         * using for each loop.
         * In this loop we are looking into the "linkedListOne" which has all the elements of "linkedList".
         */
        for (Integer linkedListValues: linkedListOne) {

            System.out.println(linkedListValues);

        }


        /**
         * Let's explore few more inbuilt methods which will help us while problems solving.
         *
         * 1) peek.
         * 2) peekFirst.
         * 3) peekLast.
         * 4) poll.
         * 5) pollFirst.
         * 6) pollLast.
         * 7) remove.
         * 8) set.
         * 9) toArray.
         */

        /**
         * 1) peek:- It retrieves the first element of a list.
         */
        System.out.println("First element in the LinkedList:- "  +linkedListOne.peek());

        /**
         * 2) peekFirst :- It retrieves the first element of a list or returns null if a list is empty.
         */
        System.out.println("First element in the LinkedList:- " +linkedListOne.peekFirst());

        /**
         * 3) peekLast :- It retrieves the first element of a list or returns null if a list is empty.
         */
        System.out.println("Last element in the LinkedList:- " +linkedListOne.peekLast());

        /**
         * 4) poll :- It retrieves and removes the first element of a list .
         */
        System.out.println("Removing first element in the LinkedList::- " +linkedListOne.poll());

        /**
         * 5) pollFirst :- It retrieves and removes the first element of a list, or returns null if a list is empty.
         */

        System.out.println("Removing first element in the LinkedList::- " +linkedListOne.pollFirst());

        /**
         * 6) pollLast :- It retrieves and removes the last element of a list, or returns null if a list is empty.
         */

        System.out.println("Removing last element in the LinkedList::- " +linkedListOne.pollLast());

        /**
         * 7) remove :- It is used to retrieve and removes the first element of a list..
         */

        // we can also specify the index to remove the element at specific index.
        System.out.println("Removing last element in the LinkedList::- " +linkedListOne.remove());

        /**
         * 8) set :- It replaces the element at the specified position in a list with the specified element.
         */

            linkedListOne.set(2, 12);
            // Iterate abd check weather the element has replaced or not.
        /**
         * 9) toArray :- It is used to return an array containing all the elements in a list in proper sequence.
         */

        Object  array[] = linkedListOne.toArray();
        for(Object arr: array)  {
            System.out.println(arr);
        }

    }
    /**
     * Reference :-
     * press :-  command + click "OR" control + click to open.
     *
     * https://www.javatpoint.com/java-linkedlist
     * https://www.geeksforgeeks.org/linkedlist-toarray-method-in-java-with-example/
     */
}
