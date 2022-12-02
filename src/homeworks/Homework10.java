package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework10 {

    /*
    Write a method countWords() that takes a String as an
    argument, and returns how many words there are in the
    the given String
    Test data 1:
    String str = “      Java is fun       ”;
    Expected output 1:
    3
    Test data 2:
    String str = “Selenium is the most common UI automation tool.   ”;
    Expected output 2:
    8
    NOTE: Make your code dynamic that works for any given
    String
    NOTE: Be careful about empty String
    NOTE: Be careful about before and after white spaces
     */

    public static int countWords(String str) {
        if (str.length() < 1) return 0;
        return str.trim().split(" ").length;
    }
        /*
        Write a method countA() that takes a String as an argument,
        and returns how many A or a there are in the the given String
        Test data 1:
        String str = “TechGlobal is a QA bootcamp”;
        Expected output 1:
        4
        Test data 2:
        String str = “QA stands for Quality Assurance”;
        Expected output 2:
        5
        NOTE: Make your code dynamic that works for any given
        String
        NOTE: Be careful about empty String
        NOTE: Be careful about uppercase and lowercase
         */

    public static int countA(String str) {

        return str.replaceAll("[^aA]", "").length();
    }

        /*
        Write a method countPos() that takes an ArrayList of
        Integer as an argument, and returns how many elements
        are positive
        Test data 1:
        [-45, 0, 0, 34, 5, 67]
        Expected output 1:
        3
        Test data 2:
        [-23, -4, 0, 2, 5, 90, 123]
        Expected output 2:
        4
        NOTE: Make your code dynamic that works for any given
        ArrayList of Integer
         */

    public static int countPos(ArrayList<Integer> arr) {

        return (int) arr.stream().filter(x -> x > 0).count();
    }

    /*
    Write a method removeDuplicateNumbers() that takes an
    ArrayList of Integer as an argument, and returns it back
    with removed duplicates
    Test data 1:
    [10, 20, 35, 20, 35, 60, 70, 60]
    Expected output 1:
    [10, 20, 35, 60, 70]
    Test data 2:
    [1, 2, 5, 2, 3]
    Expected output 2:
    [1, 2, 5, 3]
    NOTE: Make your code dynamic that works for any given
    ArrayList of Integer
     */

    public static void removeDuplicateNumbers(ArrayList<Integer> arr) {

        ArrayList<Integer> newArr = new ArrayList<>();

        for (Integer element : arr) {
            if (!newArr.contains(element)) newArr.add(element);
        }
        System.out.println(newArr);
    }

    /*
    Write a method removeDuplicateElements() that takes an
    ArrayList of String as an argument, and returns it back with
    removed duplicates
    Test data 1:
    [“java”, “C#”, “ruby”, “JAVA”, “ruby”, “C#”, “C++”]
    Expected output 1:
    [“java”, “C#”, “ruby”, “JAVA”,  “C++”]
    Test data 2:
    [“abc”, “xyz”, “123”, “ab”, “abc”, “ABC”]
    Expected output 2:
    [“abc”, “xyz”, “123”, “ab”, “ABC”]
    NOTE: Make your code dynamic that works for any given
    ArrayList of String
    NOTE: Be careful about lowercase and uppercases, this method
    is case sensitive
     */

    public static void removeDuplicateElements(ArrayList<String> strList) {

        ArrayList<String> newArr = new ArrayList<>();
        for (String s : strList) {
            if (!newArr.contains(s)) newArr.add(s);
        }
        System.out.println(newArr);
    }

    /*
    Write a method removeExtraSpaces() that takes a String as an
    argument, and returns a String with removed extra spaces
    Test data 1:
    String str = “   I   am      learning     Java      ”;
    Expected output 1:
    I am learning Java
    Test data 2:
    String str = “Java  is fun    ”;
    Expected output 2:
    Java is fun
    NOTE: Make your code dynamic that works for any given
    String
    NOTE: Be careful about empty String
    NOTE: Be careful about before and after white space
     */

    public static String removeExtraSpaces(String str) {
        return str.replaceAll("[ ]+", " ").trim();
    }

    /*
    Write a method add() that takes 2 int[] arrays as arguments and
    returns a new array with sum of given arrays elements.
    Test data 1:
    int[] arr1 = {3, 0, 0, 7, 5, 10};
    int[] arr2 = {6, 3, 2};
    Expected output 1:
    [9, 3, 2, 7, 5, 10]
    Test data 1:
    int[] arr1 =  {10, 3, 6, 3, 2};
    int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
    Expected output 1:
    [16, 11, 9,  3, 2, 7, 5, 10, 34]
    NOTE: Make your code dynamic that works for any given arrays
    NOTE: You will assume that length of arrays are always more than zero
    NOTE: Be careful about arrays length, if they were equal, it would be
    an easy task, but they can be different as given in the example above.
     */

    public static int[] add(int[] arr1, int[] arr2) {

        int[] sum = new int[Math.max(arr1.length, arr2.length)];

        for (int i = 0; i < Math.min(arr1.length, arr2.length); i++) {
            sum[i] = arr1[i] + arr2[i];
        }
        for (int i = Math.min(arr1.length, arr2.length); i < Math.max(arr1.length, arr2.length); i++) {
            if (arr1.length > arr2.length) sum[i] = arr1[i];
            else sum[i] = arr2[i];
        }
        return sum;
    }

    /*
    Write a method findClosestTo10() that takes an int[] array as an
    argument, and returns the closest element to 10 from given array
    Test data 1:
    int[] numbers = {10, -13, 5, 70, 15, 57};
    Expected output 1:
    5
    Test data 2:
    int[] numbers = {10, -13, 8, 12, 15, -20};
    Expected output 2:
    8
    NOTE: You will assume that length of array is always more than
    zero
    NOTE: Make your code dynamic that works for any given int[]
    array
    NOTE: Be careful about element to be 10 (ignore it)
    NOTE: Be careful about 2 numbers to be closest ( 8 and 12) in
    this case return smallest which is 8
     */

    public static int findClosestTo10(int[] arr) {

        Arrays.sort(arr);
        int numberBefore10 = 0;// 5  11-5 = 6
        int numberAfter10 = 0;// 15 10-15 = 4

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) numberBefore10 = arr[i];
            else break;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 10) numberAfter10 = arr[i];
            else break;
        }

        if (arr[0] >= 10) return numberAfter10;
        else if (arr[arr.length - 1] <= 10) return numberAfter10;
        else {
            if (Math.abs(10 - numberBefore10) <= Math.abs(10 - numberAfter10)) return numberBefore10;
            else return numberAfter10;
        }
    }

    public static void main(String[] args) {
        String str = "   I   am      learning     Java      ";
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(10, 20, 35, 60, 60, 60, 70));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        int[] arr4 = {10, 3, 6, 3, 2};
        int[] arr5 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        int[] numbers = {-13, 8, 12, 15, -20};
        System.out.println(countWords(str));
        System.out.println(countA(str));
        System.out.println(countPos(arr));
        removeDuplicateNumbers(arr1);
        removeDuplicateElements(arr2);
        System.out.println(removeExtraSpaces(str));
        System.out.println(Arrays.toString(add(arr4, arr5)));
        System.out.println(findClosestTo10(numbers));
    }
}

