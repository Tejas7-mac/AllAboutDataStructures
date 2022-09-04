package collections.Stacks;

import java.util.Stack;

/**
 * The stack is a linear data structure that is used to store the collection of objects. It is based on Last-In-First-Out (LIFO).
 */
public class StackClass {

    public static void main(String []args) {

        /**
         * Let's explore the methods of stack and try to understand them.
         */
        // let's import the Stack from  java Utils package and create the object of stack.

         Stack stack = new Stack();

        /**
         * Methods present in stack :-
         * 1) empty.
         * 2) push.
         * 3) pop.
         * 4) peek.
         * 5) search.
         */

        /**
         * 1) empty() :- The method checks the stack is empty or not and returns boolean value;
         */
          System.out.println("stack is empty or not :-" +stack.isEmpty());

        /**
         * 2) push() :- The method pushes (insert) an element onto the top of the stack.
         */
         System.out.println("pushed items into stack...");

          stack.push(10);
          stack.push(9);
          stack.push(8);
          stack.push(7);
          stack.push(6);

        /**
         * pop() :- The method removes an element from the top of the stack and returns the same element as the value of that function.
         */

        System.out.println("The poped Item is :- " + stack.pop());

        /**
         * peek() :- The method looks at the top element of the stack without removing it.
         */

        System.out.println(stack.peek());

        /**
         * Search() :- The method searches the specified object and returns the position of the object.
         */
         System.out.println(" The index of the item in stack is:- " +stack.search(10));
        // what will be out put if you enter an item which is inside the stack .
        // you can also try to take dynamic input and test.
    }

    /**
     * Reference :- https://www.javatpoint.com/java-stack
     * Try to solve problems on stack.
     * problems :- https://leetcode.com/problemset/all/?difficulty=EASY&page=1&topicSlugs=stack .
     */
}
