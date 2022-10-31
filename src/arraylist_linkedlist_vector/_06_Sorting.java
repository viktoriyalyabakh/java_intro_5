package arraylist_linkedlist_vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class _06_Sorting {
    public static void main(String[] args) {

        System.out.println("\n-----------Task 01-----------\n");

        /*
        Create below LinkedList to store data

        1 -> 10, -3, 5, 15
        2 -> Remote, Phone, Laptop

        Print the LinkedLists
        Sort the LinkedLists and print them again

        EXPECTED:
        [10, -3, 5, 15]
        [Remote, Phone, Laptop]
        [-3, 5, 10, 15]
        [Laptop, Phone, Remote]
         */


        System.out.println("\n---------before sorting-------\n");
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        LinkedList<String> objects = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

        System.out.println(numbers);
        System.out.println(objects);

        System.out.println("\n---------after sorting-------\n");
        Collections.sort(numbers);
        Collections.sort(objects);

        System.out.println(numbers);
        System.out.println(objects);


    }
}
