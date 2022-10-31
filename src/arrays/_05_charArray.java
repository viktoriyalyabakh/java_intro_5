package arrays;

import java.util.Arrays;

public class _05_charArray {
    public static void main(String[] args) {


        System.out.println("\n-------TASK-1--------\n");
        /*
        TASK-1
        Create a char array and store values below
        #
        $
        5
        A
        b
        H

        Print the array

        EXPECTED:
        [#, $, 5, A, b, H]
         */

        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        System.out.println(Arrays.toString(characters));


        System.out.println("\n----------TASK-2-----------\n");
        /*
        TASK-2
        Print the size of the array with a message

        EXPECTED:
        The size of the array is = 6
         */

        System.out.println("The size of the array is = " + characters.length);


        System.out.println("\n----------TASK-3-----------\n");
        /*
        TASK-3
        Print each element using fori loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
        */

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);

            System.out.println("\n----------TASK-4-----------\n");
        /*
        TASK-3
        Print each element using for each loop

        EXPECTED:
        #
        $
        5
        A
        b
        H
        */
            for (char character : characters) {
                System.out.println(character);
            }

            System.out.println("\n----------TASK-5-----------\n");
        /*
        TASK-5
        Print each element that are letters

        EXPECTED:
        A
        b
        H
         */
            System.out.println("\n----------for each loop-----------\n");

            for(char element : characters){
                if(Character.isLetter(element)) System.out.println(element);
            }


            System.out.println("\n----------fori loop-----------\n");

            //for (int i = 0; i < characters.length; i++) {
               // if(Character.isLetter(characters[i])) System.out.println(characters[i]);
            }


                System.out.println("\n----------TASK-6-----------\n");

            /*
            TASK-6
            Count how many uppercase characters you have in the array

            EXPECTED:
            2
             */
            int countUpperCase = 0;
            for (int j = 0; j < characters.length; j++) {
                if(Character.isUpperCase(characters[j])) countUpperCase++;
            }
            System.out.println(countUpperCase);


        System.out.println("\n----------TASK-7-----------\n");

        /*
        Count how many even numbers you have

        EXPECTED:
        6
         */

        int[] numbers = {3, 56, 7, 3, 0, 88, 25};
        int even1 = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) even1++;
        }

        System.out.println(even1);

        int even2 = 0;

        for(int number : numbers){
            if(number % 2 == 0) even2++;
        }

        System.out.println(even2);
        }
    }



