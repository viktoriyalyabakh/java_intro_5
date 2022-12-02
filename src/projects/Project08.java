package projects;

import java.util.Arrays;

public class Project08 {

   /* TASK-1 - findClosestDistance() method
•Write a method that takes a int[] array as an argument and returns the
    closest difference between the numbers
•This method will return an int which is the closest difference between 2
    elements in the array
•NOTE: if array does not have at least 2 elements, then return -1.
    Test data1:
            [4]
    Expected output:
            -1
            -The reason the result is -1 for above example is because the array length is
    less than 2 and we return -1 in this case.
    Test data2:
            [4, 8, 7, 15]
    Expected output:
            1
            -The reason the result is 1 for above example is because 8 and 7 are closest
    elements in the array and the difference between them is 1.
    Test data2:
            [10, -5, 20, 50, 100]
    Expected output:
            10
    The reason the result is 1 for above example is because 10 and 20 are
    closest elements in the array and the difference between them is 10.
    */

    public static int findClosestDistance(int[] arr) {

        int result = 0;
        int check = Integer.MAX_VALUE;

        if (arr.length < 2) return -1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (check > Math.abs(arr[i] - arr[j]))
                    check = Math.abs(arr[i] - arr[j]);
                result = check;
            }
        }
        return result;
    }

        /*
        TASK-2 – findSingleNumber() method
        Write a method that takes an int[] array as an argument and returns the
        element occurs only once.
        You will be given a non-empty array in which all the elements appears
        twice except for one.
        Test data 1:
        [2]
        Expected output 1:
        2
        Test data 2:
        [5, 3, -1, 3, 5, 7, -1]
        Expected output 2:
        7
        */
        public static int findSingleNumber ( int[] arr){

            if(arr.length == 1) return arr[0];

            for (int i = 0; i < arr.length; i++) {
                int result = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) result++;
                }
                if (result == 1)
                return arr[i];
            }
            return -1;
        }
        /*
        TASK-3 - findFirstUniqueCharacter() method
        Write a method that takes a non-empty String as an argument and
        returns the first unique character in the String.
        This method returns a char.
        If there is no unique character in the String, then return space by default.
        This task is case-sensitive.
        Test data 1:
        Hello
        Expected output 1:
        H
        Test data 2:
        abc abc d
        Expected output 2:
        d
        Test data 3:
        abab
        Expected output 3:
        Space
         */
    public static char findFirstUniqueCharacter(String str){

        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i)))
                return str.charAt(i);
        }
        return ' ';
    }

    /*
    TASK-4 – findMissingNumber() method
    Write a method that takes a int[] array as an argument and returns the
    missing element.
    You will be given an array length of 2 at least.
    Array elements will be representing a sequence of numbers that increases
    by 1.
    Test data 1:
    [2, 4]
    Expected output 1:
    3
    Test data 2:
    [2, 3, 1, 5]
    Expected output 2:
    4
    Test data 3:
    [4, 7, 8, 6]
    Expected output 2:
    5
     */

    public static int findMissingNumber(int[] arr){

        Arrays.sort(arr);
        int counter = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == counter) counter++;
        }
       return counter;
    }

    public static void main(String[] args) {
        System.out.println(findClosestDistance(new int[] {10, -5, 20, 50, 100}));
        System.out.println(findSingleNumber(new int[] {5, 3,8, 8, 7, 7, 9, -1,9,10, 3, 5, -1}));
        System.out.println(findFirstUniqueCharacter("Hello"));
        System.out.println(findMissingNumber(new int[] {4, 7, 8, 6}));
    }
}
