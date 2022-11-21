package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n--------Task 1---------\n");
    /*
    Write a program to find the first duplicated number in an int array
    It should print “There is no duplicates” if there are no duplicate
    elements.
    NOTE: Make your code dynamic that works for any given int array.
    Test data 1:
    int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

    Expected output 1:
    0
    Test data 2:
    int[] numbers = {-8, 56, 7, 8, 65};

    Expected output 2:
    There is no duplicates
    Test data 3:
    int[] numbers = {3, 4, 4, 3, 5, 5, 6, 6, 7};

    Expected output 2:
    3
     */
        int[] numbers = {3, 4, 4, 3, 5, 5, 6, 6, 7};

            boolean isDublicate = false;
            for (int i = 0; i < numbers.length; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    if(numbers[i] == numbers[j]) {
                        isDublicate = true;
                        System.out.println(numbers[i]);
                        break;
                    }
                }
                if(isDublicate) break;
            }
            if(!isDublicate) System.out.println("There is no duplicates");


            System.out.println("\n--------Task 2---------\n");

            /*
            Write a program to find the first duplicated String in a String array, ignore
            cases. It should print “There is no duplicates” if there are no duplicate
            elements.
            NOTE: Make your code dynamic that works for any given String array.
            Test data 1:
            String[] words = {“Z”, “abc”, “z”, “123”, “#” };

            Expected output 1:
            Z
            Test data 2:
            String[] words = {“xyz”, “java”, ”abc”};

            Expected output 2:
            There is no duplicates
            Test data 3:
            String[] words = {“a”, “b”, “B”, “XYZ”, “123”};

            Expected output 2:
            b
             */


        String[] words = {"a", "c", "b", "XYZ", "a", "123"};

        boolean dublicate = false;
        for(int i = 0; i < words.length; i++){
            for (int j = i+1; j < words.length; j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    dublicate = true;
                    System.out.println(words[i]);
                    break;
                }
            }
            if(dublicate) break;
        }
        if(!dublicate) System.out.println("There is no duplicates");


        System.out.println("\n--------Task 3---------\n");

        /*
        Write a program to find the all duplicates in an int array. It
        should print “There is no duplicates” if there are no
        duplicate elements.
        NOTE: Make your code dynamic that works for any given
        int array.
        Test data 1:
        int[] numbers = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        Expected output 1:
        0
        -7
        Test data 2:
        int[] numbers = {1, 2, 5, 0, 7};

        Expected output 2:
        There is no duplicates
         */

        int[] nums = {-4,-7, 0, 5, 10,45};

        ArrayList<Integer> result = new ArrayList<>();

        boolean flag = false;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (!result.contains(nums[i])) result.add(nums[i]);
                    flag = true;
                }
            }
        }
        result.forEach(System.out::println);

        if(!flag) System.out.println("There is no duplicates");



        System.out.println("\n--------Task 4---------\n");
        /*
        Write a program to find the all duplicates in a String array,
        ignore cases. It should print “There is no duplicates” if
        there are no duplicate elements.
        NOTE: Make your code dynamic that works for any given
        String array.
        Test data 1:
        String[] words = {“A”, “foo”, “12” , “Foo”, “bar”, “a”, “a”,
        “java”};

        Expected output 1:
        A
        foo
        Test data 2:
        String[] words = {“python”, “foo”, “bar”, “java”, “123” };

        Expected output 2:
        There is no duplicates
         */

        String[] words1 = {"java", "java", "python", "foo","foo","foo","foo", "bar", "java", "123"};

        ArrayList<String> result1 = new ArrayList<>();

        for (int i = 0; i < words1.length; i++) {
            for (int j = i + 1; j < words1.length; j++) {
                if (words1[i].equalsIgnoreCase(words1[j])) {
                    if(!result1.contains(words1[i])) result1.add(words1[i]);
                }
            }
        }
        result1.forEach(System.out::println);

        if(result1.isEmpty()) System.out.println("There is no duplicates");



        System.out.println("\n--------Task 5---------\n");

        /*
        Write a program to reverse elements in an array, then print array.
        NOTE: Make your code dynamic that works for any
        given array.
        Test data 1:
        String[] words1 = {“abc”, “foo”, “bar”};

        Expected output 1:
        [bar, foo, abc]
        Test data 2:
        String[] words2 = {“java”, “python”, “ruby”};

        Expected output 2:
        [ruby, python, java]
         */

        String[] words2 = {"java", "python", "ruby"};

        List<String> newArray = new ArrayList<>();

        for (int i = words2.length - 1; i >= 0 ; i--) {
            newArray.add(words2[i]);
        }
        System.out.println(newArray);


        System.out.println("\n--------Task 6---------\n");

        /*
        Write a program to reverse each word in a given String
        NOTE: Make your code dynamic that works for any
        given String.
        Test data 1:
        String str = “Java is fun”;

        Expected output 1:
        avaJ si nuf
        Test data 2:
        String str = “Today is a fun day”;

        Expected output 2:
        yadoT si a nuf yad
         */


        String str = "Today is a fun day";
       String[] strArray = str.split(" ");

       StringBuilder reverseStr = new StringBuilder();
        for (String element : strArray) {
            reverseStr.append(new StringBuilder(element).reverse().append(" "));
        }
        System.out.println(reverseStr.toString().trim());;
        }
    }


