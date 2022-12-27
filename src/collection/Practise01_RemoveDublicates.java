package collection;

import java.util.*;

public class Practise01_RemoveDublicates {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, -5, 10, 1, 2, 5})));
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, 1, 2, 5})));
        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{})));
    }



    /*
    Create a method that takes an array of numbers below
    -5, 10, -5, 10, 1, 2, 5
    Remove all duplicates and return a new array
    [-5, 1, 2, 5, 10]
     */

    public static Integer[] removeDuplicates(Integer[] arr) {
        // return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
        // Integer array -> Integer List -> LinkedHashSet -> Object array -> Integer array

        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        Integer[] newArr = set.toArray(new Integer[0]);
        return newArr;
    }
}
