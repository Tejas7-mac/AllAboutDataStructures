package Arrays;

public class ExceptionInArray {

    /**
     * By Looking into the Previous ArrayDataStructure Class You Know About The Array.
     * Let's Try to understand the Exceptions that occur while Playing Around the Array.
     */

    /**
     * We have Total Five Situations where we can encounter the exceptions.
     * 1) NullPointerException.
     * 2) NegativeArraySizeException.
     * 3) ArrayIndexOutOfBoundsException.
     * 4) IndexOutOfBoundsException.
     * 5) ClassCastException.
     */

    public static void main(String args[]) {
        int array[] = null;
        int arraySize = 4;
        int arrayInc = -0;
        int output;
        for (int i = 0; i < 6; i++) {
            try {
                // Multiple Switch Conditions
                switch (i) {
                    case 0:
                        output = array[0]; // Generates a NullPointerException because array[0] doesn't contain any data.
                        break;
                    case 1:
                        array = new int[arrayInc]; // Generates a NegativeArraySizeException i.e because "arrayInc" is negative and we cannot create an Array with Negative size.
                        output = array[arrayInc];
                        break;
                    case 2:
                        array = new int[arraySize]; // Generate the
                        // ArrayIndexOutOfBoundsException occurs in two situation either the given index is less than zero or more Than the array size.
                        output = array[arraySize];
                        break;
                    case 3:
                        array = new int[5]; // Generate the
                        // IndexOutOfBoundsException occurs when the given index is more than the size of the Array.
                        output = array[5];
                    case 4:
                        Object newArray = new Integer(0); // Generate the
                        // ClassCastException occurs when the value prsent in the array cannot be cast to another data Type.
                        System.out.println((String) newArray);
                    case 5:
                        Object X[] = new String[-5]; // Generate the
                        // ArrayStoreException occurs when we attempt to store the wrong type of objects into an array.
                        X[0] = new Integer(0);
                        System.out.println(X);
                }
            } catch (NullPointerException ex1) {
                System.out.println("\n Exception Generated: "
                        +
                        ex1.getMessage());
                ex1.printStackTrace();
            } catch (NegativeArraySizeException ex2) {
                System.out.println("\n Exception Generated: "
                        +
                        ex2.getMessage());
                ex2.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException ex3) {
                System.out.println("\n Exception Generated: "
                        +
                        ex3.getMessage());
                ex3.printStackTrace();
            } catch (IndexOutOfBoundsException ex4) {
                System.out.println("\n Exception Generated: "
                        +
                        ex4.getMessage());
                ex4.printStackTrace();
            } catch (ClassCastException ex5) {
                System.out.println("\n Exception Generated: "
                        +
                        ex5.getMessage());
                ex5.printStackTrace();
            } catch (ArrayStoreException ex6) {
                System.out.println("\n Exception Generated: "
                        +
                        ex6.getMessage());
                ex6.printStackTrace();
            }
        }
    }
}
