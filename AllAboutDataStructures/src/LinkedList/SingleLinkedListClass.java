package LinkedList;

/**
 * what exactly forms a linked list ?
 * example:-
 * 2 -> 3-> 4-> null
 * 2 is the head of the linked list.
 * '->' is the reference of the next data in the present node i.e '2 -> 3' means that 2 has the reference df  3.
 */

public class SingleLinkedListClass {

    /**
     * Here we Have a Method's which show the real time implementation of the linked list.
     * Observer care fully and try to understand one peice at a time.
     * Note :- read the descriptions and then proceed.
     */

    /**
     * let's see how we can add the data (insert) into the linked list.
     */


    /**
     * we will declare a head node which will be the first node. we can assume as the '0' index in the array.
     */

    Node head;


    /**
     * lets do a deep dive and how to insert a data into the linked list.
     * @param data stores the data inside linked list.
     */

    public void insert(int data) {

        /**
         * step 1 :- create a new node .
         * step 2 :- now assign the data into the new node.
         * step 3 :- point the new node reference as null.
         */
        Node newnode = new Node();
        newnode.data = data;
        newnode.next = null;

        /**
         * The linked list always starts from the head .
         * Hence we need to check , does head contains the data or not.
         * if head contains data we iterate trough the linked list and check for refernce is null we add the new node at null.
         * Otherwise add the data inside head.
         */
        if(head ==null) {
            head = newnode;
        } else {
            // we assign the data in the head to another node and check for the null reference and add the new node at that point.
            // example we need to add '3'( newnode = 3 -> null)  in the linked list and the present linked list id '2 -> 4 -> 5 -> null'.
            // we add the new node at the 5  which will form '2- -> 4 -> 5 -> 3 -> null'.

            Node node1 = head;
            // lets iterate through the linked list and find the values which has the null reference.
            while(node1.next != null) {
                node1 = node1.next;
            }
            // once we have found the null reference we will add the newNode at this point.
            node1.next = newnode;
        }

    }

    /**
     * Insert the element at the start.
     */

      public void insertAtStart(int data) {
          Node node = new Node();
          node.data = data;
          node.next = head;
          head = node;
      }

    /**
     * we can also insert the data at a specific node.
     * Based on the index.
     * @param index the data need to be stored.
     * @param data the data that need to be stored in the linked list.
     */

    public void inserAtIndex(int index, int data) {

        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;


        if(index == 0) {
            insertAtStart(data);
        } else {
            Node currentNode = head;
            for (int listindex = 0; listindex < index - 1; listindex++) {

                currentNode = currentNode.next;

            }

            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    /**
     * Now let look at how to delete the element in ana array.
     * example :- 1-> 2-> 3-> 4-> 5->null;
     * if we want to delete the data '2' from the linked list.
     * The idea is to change the address 1 to 3. i.e currently the 1 is storing the address '2' 1-> 2.
     * Once we change its address then the data i.e 1  will point to 3. 1->3.
     */

    /**
     * Let's create a method which will delete the element at a specific index.
     * @param index takes the index as input and delete the data at that index.
     */
      public  void  deleteAt(int index) {
          if(index == 0) {
              head = head.next;
          } else {
              Node currentNode = head;
              Node dummyNode = null;
              for(int listIndex = 0; listIndex < index - 1; listIndex++) {
                  currentNode = currentNode.next;
              }
              dummyNode = currentNode.next;
              currentNode.next = dummyNode.next;
              dummyNode = null;

          }

      }

    /**
     * cool now we have inserted the data and formed the linked list.
     * it's time to show the data that we have inserted.
     * we can show the data by iterating through the linked list.
     */
    public void show() {
        /**
         * Steps to iterate through the linked list.
         * step 1 = assign the head to the node.
         * step 2 = check if the reference of the node is not null.
         * step 3 = if the reference is not null print the data and move to the next node.
         * step 4 = if the reference is null stop iterating and print the data of the present node.
         */


        Node node = head;
        while(node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    /**
     * Once you feel you have understood the concept of linked list.
     * Try to solve the problems on the same concept.
     * https://leetcode.com/problemset/all/?topicSlugs=linked-list&page=1&difficulty=EASY
     * Any queries ping me at "tejasreddy.bob@gmail.com".
     */

}
