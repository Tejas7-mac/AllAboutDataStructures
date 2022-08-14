package LinkedList;

/**
 * @author Tejas.
 */

public class MainClass {
    public static void main(String args[]) {

        SingleLinkedListClass object = new SingleLinkedListClass();
        object.insert(5);
        object.insert(6);
        object.insert(7);
        object.insert(8);
        object.insert(9);
        object.insertAtStart(1);
        object.inserAtIndex(2, 3);
        object.deleteAt(2);
        object.show();

    }
}
