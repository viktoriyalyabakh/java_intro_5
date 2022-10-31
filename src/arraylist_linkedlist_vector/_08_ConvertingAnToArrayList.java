package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_ConvertingAnToArrayList {
    public static void main(String[] args) {

        /*
        Create an arrayList of cities -> Tokyo, Berlin, Moscow, Denver
        Create a LinkedList of characters -> A, #, 5, +
        Create a Vector of numbers -> 1, 2, 2, 7, 10
         */

        System.out.println("\n------1way ");
        String[] arr1 = {"Tokyo", "Berlin", "Moscow", "Denver"};
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(cities);
    }
}
