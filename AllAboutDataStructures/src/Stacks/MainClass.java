package Stacks;

public class MainClass {

    public static void main(String []args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(9);
        stack.push(8);

        System.out.print("Show Method invoked In stack :- ");
        stack.show();

        System.out.println();


        System.out.println("The popped data is :- " +stack.pop());
        System.out.println("The popped data is :- " +stack.pop());

        System.out.println("The last pushed data is :- " +stack.peek());

        System.out.print("Show Method invoked In stack :- ");
        stack.show();

   // try to make the stack overflow  and under flow by pushing more than 5 elements into stack


    }
    /**
     * Help yourself by exploring the different methods that you can build in stack based On your idea.
     * example :- you can update the size of the stack after each push or pop operation and display it by building size method.
     * Let's solve some  problems on Stack.
     * https://leetcode.com/problemset/all/?difficulty=EASY&page=1&topicSlugs=stack
     */
}
