package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        int[] numbers = {10, 5, 6, 7, 8, 5, 15, 15};
        String[] words = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        String[] words1 = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findGreatestAndSmallestWithSort(numbers);
        findGreatestAndSmallest(numbers);
        findSecondGreatestAndSmallestWithSort(numbers);
        findSecondGreatestAndSmallest(numbers);
        findDuplicatedElementsInAnArray(words);
        findMostRepeatedElementInAnArray(words1);

    }
    /*
        TASK-1 - findGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find
    the greatest and smallest elements from the array and print them.
    Complete task using sort() method.
    Test data:
    [10, 7, 7, 10, -3, 10, -3]
    Expected output:
    Smallest = -3
    Greatest = 10
     */

    public static void findGreatestAndSmallestWithSort(int[] arr){

        Arrays.sort(arr);
        System.out.println("Smallest = " + arr[0]);
        System.out.println("Greatest = " + arr[arr.length-1]);
    }


    /*
        TASK-2 findGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find
    the greatest and smallest elements from the array and print them. DO NOT
    sort the array and complete task without sorting.
    Test data:
    [10, 7, 7, 10 -3, 10, -3]
    Expected output:
    Smallest = -3
    Greatest = 10
     */

    public static void findGreatestAndSmallest(int[] arr){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i <= arr.length-1; i++){
           if(arr[i] > max){
               max = arr[i];
           }
           if(arr[i] < min){
               min = arr[i];
           }
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    /*
        TASK-3 - findSecondGreatestAndSmallestWithSort() method
    Write a method that takes an int array that has at least one element. Find
    the second greatest and second smallest elements from the array and print
    them. Complete task using sort() method.
    Test data:
    [10, 5, 6, 7, 8, 5, 15, 15]
    Expected output:
    Second Smallest = 6
    Second Greatest = 10
     */

    public static void findSecondGreatestAndSmallestWithSort(int[] arr){


        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;

        Arrays.sort(arr);
        int max = arr[arr.length-1];
        int min = arr[0];

        for(int element : arr){
            if(element > secondMax && element != max){
                secondMax = element;
            }
            if(element < secondMin && element != min){
                secondMin = element;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }



        /*
        TASK-4 - findSecondGreatestAndSmallest() method
    Write a method that takes an int array that has at least one element. Find
    the second greatest and second smallest elements from the array and print
    them. DO NOT sort the array and complete task without sorting.
    Test data:
    [10, 5, 6, 7, 8, 5, 15, 15]
    Expected output:
    Second Smallest = 6
    Second Greatest = 10
     */

    public static void findSecondGreatestAndSmallest(int[] arr){

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int element : arr) {
            if (element > max){
                max = element;
            }
            if (element < min){
                min = element;
            }
        }
        for (int element : arr) {
            if (element > secondMax && element != max){
                secondMax = element;
            }
            if (element < secondMin && element != min){
                secondMin = element;
            }
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);

    }

    /*
        TASK-5 - findDuplicatedElementsInAnArray() method
    Write a method that takes a String array. Find all duplicated elements and
    print them.
    NOTE: It is case-sensitive!
    Test data:
    [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]
    Expected output:
    bar
    6
     */

    public static void findDuplicatedElementsInAnArray( String[] str){


        for(int i = 0; i < str.length; i++){
            for(int j = i+1; j < str.length; j++){
                if(str[i].equals(str[j])){
                    System.out.println(str[i]);
                    break;
                }
            }
        }
    }

    /*
        TASK-6 findMostRepeatedElementInAnArray() method
    Write a method that takes a String array. Find the most repeated element
    and print it.
    Test data:
    [“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]
    Expected output:
    pen
     */

    public static void findMostRepeatedElementInAnArray(String[] str){

        int count = 0;
        int mostCount = 0;
        String mostCountWords = "";

        for(int i = 0; i < str.length; i++){
            for(int j = i+1; j < str.length; j++){
                if(str[i].equals(str[j])) count++;
            }
            if(count > mostCount){
                mostCount = count;
                mostCountWords = str[i];
            }
            count = 0;
        }
        System.out.println(mostCountWords);
        System.out.println(mostCount);



    }

}
