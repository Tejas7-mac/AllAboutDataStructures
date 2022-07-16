package Arrays;

public class ArrayDataStructure {

    /**
     * The Array is the Object which contains elements of similar data type.
     * We can store only fixed set of elements in java Array.
     */


    /**
     * Creating the Method to take the array as a Parameter.
     */
    public static void inputArrayAsParameter(int[] array) {

        int smallestNumber = Integer.MAX_VALUE;

        for(int elementsInTheArray: array) {

            if(elementsInTheArray <= smallestNumber ) {
                smallestNumber = elementsInTheArray;
            }
        }

        System.out.println("the Smallest Number In the Array is :- " +smallestNumber);
    }


    /**
     * creating an array to swap the elements at First index with Last Index.
     * @param array
     */

    public static int[] getSwappedArray(int[] array) {
        int newArray[] = array;
        int temp = newArray[0];
        newArray[0] = newArray[newArray.length -1 ];
        newArray[newArray.length -1 ] = temp;

        return newArray;
    }



    public static void main(String args[]) {

        /**
         * Type of Syntax to declare an array.
         * 1) DataType[] arr.
         * 2) DataType []arr.
         * 3) DataType arr[].
         */
        int sizeOfArray = 5;

        /**
         * Declaration and instantiation has 2 types.
         */
        // Type 1.
        int array[] = new int[sizeOfArray];

        //Type 2

        int arrayTwo[] = {5,6,7,8,9,0};

        // Storing the data in the Array.

        array[0] = 1; //array[0] represents that the element 1 is stored at the location i.e index '0' in the array.
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        /**
         * Iterating through the array using for loop.
         */
        int lengthOfArray = array.length;
        System.out.println("Printing elements in the array :- ");

        for(int index = 0; index < lengthOfArray; index++) {

            System.out.println(array[index]);

        }

        /**
         * Iterating through the array using forEach.
         */
        System.out.println("Printing elements in the arrayTwo :- ");

        for(int numbers:arrayTwo) {

            System.out.println(numbers);

        }

        /**
         * Let's learn to pass the created array to the method.
         * we have created a method inputArrayAsParameter and passing the elements to it .
         * this inside the method we are trying to find the smallest element on the array and print it.
         * This is Also called as Anonymous Array in the java . i.e to pass the array in any method without Declaration.
         */

        inputArrayAsParameter(array);


        /**
         * So we have a use case where we need to swap elements at the first index to last and the elements at the last index to first.
         * Then return a new array with the swapped elemets.
         * Here we can achive this by returning the array.
         * This Idea means the array supports return types.
         */

        int thirdArray[] = getSwappedArray(arrayTwo); // user can iterate through the "thirdArray" to check the swapped elements.


        /**
         * Ever wondered..? what is the class name of the Array.
         * Lets Check it out..!
         */

           Class arrayClass = array.getClass();
           String nameOfArrayClass = arrayClass.getName();
           System.out.println(nameOfArrayClass);

        /**
         * Copy is the most important thing in our lives.
         * Do you remember the last time you copied in exams ...! or steeling you friends code haha.
         * I love copying .
         * Array also helps us to copy its data into another array by its in built Method, lets try it out.
         */

        // creating the char array .
           char copyFrom[] = {'a', 'b', 'c', 'd', 'f', 'g', 'h', 'i'};

        // creating an another array to copy.
           char copyTo[] = new char[5];

        // copying the elements from copyFrom from index 1 to 5 and adding them to copyTo array.
           System.arraycopy(copyFrom, 2, copyTo, 0, 5);
           System.out.println("Printing The Copied Array :- " + String.valueOf(copyTo));

        /**
         * we have another Way to copy the Array i.e Clone.
         * Since The Array Implements the Cloneable InterFace we can Create the Clone of the Array , Which does the Deep Copy.
         * Lets try to create the clone Of "array".
         */

          int clonedArray[] = array.clone();
          // Are you sure the data has copied , few times people lie please do confirm yourself by iterating "clonedArray" .
    }

    /**
     * It's time to check yourself the Problem solving Skills on the  Array.
     * control + click the below link.
     * https://leetcode.com/problemset/all/?page=1&topicSlugs=array&difficulty=EASY
     */

}
