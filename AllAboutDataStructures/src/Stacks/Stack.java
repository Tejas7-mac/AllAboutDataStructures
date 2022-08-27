package Stacks;

/**
 * -> Stack is a Linear data Structure.
 * -> Stack follows LIFO principle i.e Last in first out.
 * -> LIFO -> The data added last will  pop (removed) first.
 */

/**
 * Here we use Array with ind data type to implement the Stack Data Structure which will help us for better understanding.
 * @author tejas.
 */

public class Stack {

    /**
     * let's create the methods to add delete and show the elements in the stack.
     * 1) push :- This method is to add the elements(data) in the stack.
     * 2) pop :- This method is to delete the element in the stack.
     * 3) show :- This method is to show the stored elements in the stack;
     * 4) peek :- This method is to show the last pushed element in the stack.
     */

    // let's create the array of size . i.e the stack had the capacity to store 5 elements.

    int array[] = new int[5];

    int top = 0;

    /**
     * Push :- This method is to add the elements(data) in the stack.
     * @param data will be added to Stack.
     */
    public void push(int data) {

        if(top >= array.length) {
            System.out.print(" Stack is OverFlowing " +data+ " Cannot be pushed...!");
        } else {
            array[top] = data;
            top++;
        }

    }

    /**
     * pop :- This method is to delete the element in the stack.
     */
    public int pop() {
        int data = 0;
        top--;
        if(top < 0) {
            System.out.println(" Stack UnderFlow i.e stack doesn't have the data ");
        } else  {
             data = array[top];
            array[top] = 0;
        }
        return data;
    }

    /**
     * show :- This method is to show the stored elements in the stack;
     */
    public void show() {
        for(int stackData: array) {
            System.out.print(stackData + " ");
        }
    }

    /**
     * peek :- This method is to show the last pushed element in the stack.
     */
    public int peek() {
        int data;
        data = array[top - 1];
        return data;
    }

}

