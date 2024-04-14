package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ex1 {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> myList = new ArrayList<>();

        // Adding elements from an array to ArrayList using Collections.addAll
        String[] myArray = {"apple", "banana", "orange", "grape"};
        Collections.addAll(myList, myArray);

        // Displaying the ArrayList
        System.out.println("ArrayList after adding elements from the array: " + myList);
    }
}
