package collections.ArrayList;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ArrayList is Dynamic array i.e it is the combination of normal Array but with no size limit extension.
 * At the same time if we need a fixed size of array we can create that also.
 * ArrayList extends  AbstractList class and List Interface.
 */


public class ArrayListclass {

    public static void main(String args[]) {
        /**
         * Declaration of ArrayList.
         */

        //Declaration using ArrayList CLass.
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //Declaration using List Interface.
        // The Data type here in collections is a Wrapper class. example = 'Integer', 'String', any other class created by you.
        List<Integer> list = new ArrayList<>();

        /**
         * Let's declare an array with fixed Size of 10.
         */
        ArrayList<Integer> arrayListOne = new ArrayList<Integer>(10);

        /**
         * Now you know how to create an arrayList.
         * Time to know how to store the values.
         */

        /**
         * we can store data in two types.
         * 1) using index .
         * 2) without using index value.
         */
        System.out.println("Storing data inside 'arrayListOne' using index :-");
        for(int index = 0; index < 10; index++) {
            arrayListOne.add(index, index + 1);
          }

        System.out.println("Storing data inside 'arrayList' without using index :-");
        for(int index = 0; index < 10; index++) {
            arrayList.add(index + 1);
        }
        /**
         * Ok now we have learnt how to store a data in ArrayList.
         * let try to iterate through the array and print them down.
         * Reminder ,From ArrayDataStructure class you have learnt how to iterate through the data structure.
         */

        // iterate using foreach.

        System.out.println("Traversing the ArrayList using For Each :-");
        for(Integer data:arrayListOne){
            System.out.println(data);
        }

        /**
         * We also have an Interface called Iterator used to travers through collection.
         */

        System.out.println("Traversing the ArrayList using Iterator :-");
        Iterator iterator = arrayList.iterator();

        while(iterator.hasNext()) {
        System.out.println(iterator.next());
        }

        /**
         * what is the point of storing data using index if we are not able to get the data using index.
         */

        System.out.println("Getiing the data using its index");
        System.out.println(arrayListOne.get(1));  // 1 is the index which has '2' in the arrayListOne.

        /**
         * Check weather the ArrayList is empty.
         */
        System.out.println("Checking the ArrayList is empty or not :-" +list.isEmpty());

        /**
         * Do you want to add all the elements in one arrayList to another .
         * Yes you can we have method for that i.e addAll().
         * Let's check it out.
         */

        list.addAll(arrayList);
        // traverse and check for the data inside the list.

        /**
         * do you want to add all the elements from the specified index .
         * yes you can.
         * Let's check it out.
         */
        list.addAll(10,arrayListOne);

        /**
         * you want to remove all the elements from the ArrayList.
         * Yes you can...!, By using clear() method.
         */
        list.clear();

        /**
         * We also have option to check weather the element is in the ArrayList or not.
         */

        System.out.println("Check the element 1 present in the Arraylist :-" + arrayList.contains(2));

        /**
         * we can also remove an element in the ArrayList at a specific index.
         */

        System.out.println(" Delete the element from the ArrayList :- " +arrayList.remove(2));
        // check how data is arranged after removing the elements.


        /**
         * Still many functionalities present in the ArrayList.
         * sort, clone,trimToSize, indexOf, toArray.
         */

    }
}
