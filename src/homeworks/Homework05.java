package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;
import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args){

        System.out.println("\n----------Task-1---------\n");

        /*
        Write a program that prints all the numbers that are
        dividable by 7 starting from 1 to 100 (1 and 100 are
        included)
        NOTE: Result must be in one line with space and
        dash separators
        Expected Output:
        7 – 14 – 21 - 28 . . . 77 - 84 - 91 - 98
         */
        String box1 = "";

        for (int i = 0; i < 101; i++) {
            if (i % 7 == 0 && i != 100)
                box1 += i + " - ";
        }
        System.out.println(box1.substring(0, box1.length() - 3));


        System.out.println("\n----------Task-2---------\n");

        /*
        Write a program that prints all the numbers that are
        dividable by both 2 and 3 starting from 1 to 50 (1 and
        50 are included)
        NOTE: Result must be in one line with space and
        dash separators
        Expected Output:
        6 – 12 – 18 . . . 36 – 42 - 48
         */

        String box2 = "";

        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0 && i != 50) box2 += i + " - ";
        }
        System.out.println(box2.substring(0, box2.length() - 3));


        System.out.println("\n----------Task-3---------\n");

        /*
        Write a program that prints all the numbers that are
        dividable by 5 starting from 100 to 50 (100 and 50 are
        included)
        NOTE: Result must be in one line with space and
        dash separators
        Expected Output:
        100 – 95 – 90 . . . - 60 - 55 - 50
         */

        String box3 = "";

        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0 && i != 49) box3 += i + " - ";
        }
        System.out.println(box3.substring(0, box3.length() - 3));


        System.out.println("\n----------Task-4---------\n");

        /*
        Write a program that prints the squares of all numbers
        starting from 0 to 7 (0 and 7 are included)
        NOTE: Use loop!!!
        Expected Output:
        The square of 0 is =  0
        The square of 1 is =  1
        The square of 2 is =  4
        The square of 3 is =  9
        The square of 4 is =  16
        The square of 5 is =  25
        The square of 6 is =  36
        The square of 7 is =  4
         */

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " + (i * i));

        }


        System.out.println("\n----------Task-5---------\n");

        /*
        Write a program that finds sum of the numbers starting
        from 1 to 10
        Calculation => 1+2+3+4+5+6+7+8+9+10
        NOTE: Use loop!!!
        Expected Output:
        55
         */

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("\n----------Task-6---------\n");

        /*
        Write a program that asks user to enter a positive number
        And find the factorial of the number
        0! = 1
        1! = 1
        2! = 1*2 = 2
        3! = 1*2*3 = 6
        Test Data 1:
        5
        Expected Output 1:
        120
        NOTE:
        5! = 1*2*3*4*5 = 120
        Test Data 2:
        7
        Expected Output 2:
        5040
        NOTE:
        5! = 1*2*3*4*5*6*7 = 5040
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a positive number");
        int factorialNumber = scan.nextInt();
        int factorial = 1;

        for (int i = 1; i <= factorialNumber; i++) {
            factorial *= i;
        }
        System.out.println(factorial);


        System.out.println("\n----------Task-7---------\n");

        /*
        Write a program that asks user to enter their first and last name
        And count how many vowel letters they have in their first and last name
        Vowel letters = a, e, i, o, u
        Example program1:
        Program: Please enter your full name
        User : Chris Thompson
        Program: There are 3 vowel letters in this full name
        Example program2:
        Program: Please enter your full name
        User : Alexander George
        Program: There are 7 vowel letters in this full name
         */

        System.out.println("Please enter your full name");
        scan.nextLine();
        String fullName = scan.nextLine().toLowerCase();

        int countVowel = 0;

        for (int i = 0; i <= fullName.length() - 1; i++) {
            if (fullName.charAt(i) == 'e' || fullName.charAt(i) == 'a' || fullName.charAt(i) == 'i' ||
                    fullName.charAt(i) == 'o' || fullName.charAt(i) == 'u')
                countVowel++;
        }
        System.out.println("There are " + countVowel + " vowel letters in this full name");


        System.out.println("\n----------Task-8--------\n");

        /*
        Write a program that asks user to enter a number
        If number is less than 100, then ask user to enter another number
        and find sum of entered 2 numbers.
        Keep asking user to enter numbers until the sum of all entered
        numbers is at least 100.
        If first number entered by user more than or equal to 100, print
        message “This number is already more than 100” and do not ask
        user to enter any other numbers
        NOTE: Use do while loop!!!
        Example program1:
        Program: Please enter a number
        User : 120
        Program: This number is already more than 100
        Example program2:
        Program: Please enter a number
        User : 50
        Program: Please enter a number
        User : 75
        Program: Sum of the entered numbers is at leas
         */


//        System.out.println("\n-----while_loop-----\n");
//        int number1 = ScannerHelper.getANumber();
//        int sumOfNumbers = number1;
//        if (number1 > 100) System.out.println("This number is already more than 100");
//
//        while (sumOfNumbers <= 100) {
//            int number2 = ScannerHelper.getANumber();
//            sumOfNumbers += number2;
//            if (sumOfNumbers > 100) System.out.println("Sum of the entered numbers is at list 100");
//        }
//
//
//        System.out.println("\n-----do_while_loop-----\n");
//
//
//        int num1 = ScannerHelper.getANumber();
//        if(num1 > 100) System.out.println("This number is already more than 100");
//        else {
//            int sumOfNumber = num1;
//            do {
//                int num2 = ScannerHelper.getANumber();
//                sumOfNumber += num2;
//            }
//            while (sumOfNumber < 100);
//            System.out.println("Sum of the entered numbers is at list 100");
//        }
//

            System.out.println("\n----------Task-9---------\n");

        /*
        •Assume that you are given a number and you are
        asked to find series of Fibonacci numbers
        •What is Fibonacci numbers: a series of numbers in
        which each number ( Fibonacci number ) is the sum
        of the two preceding numbers
        •It always starts with 0 and 1
        •EX: 0, 1, 1, 2, 3, 5, 8, 13, 21
        NOTE: Write a program that handles any n series of
        numbers
        Test data 1:
        5

        Expected output 1:
        0 – 1 – 1 – 2 – 3
        Test data 2:
        7

        Expected output 2:
        0 – 1 – 1 – 2 – 3 – 5 - 8
         */

        int fibonacciNumber = 3;

        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= fibonacciNumber; i++) {

            if(i != fibonacciNumber) System.out.print(n1 + " - ");
            else System.out.print(n1);
            int total = n1 + n2;
            n1 = n2;
            n2 = total;
        }



            System.out.println("\n----------Task-10---------\n");

        /*
        Write a program that asks user to enter a name
        If name starts with j or J, then finish the program
        But, if the name does not start with j or J, then keep asking
        until user gives a name that starts with j or J.
        Example program1:
        Program: Please enter a name
        User : Jessie
        Program: End of the program
        Example program2:
        Program: Please enter a name
        User : Alexander
        Program: Please enter a name
        User : Chris
        Program: Please enter a name
        User : Jordan
        Program: End of the program
         */
        String name = ScannerHelper.getAName();

        while(!name.toLowerCase().startsWith("j")){
            name = ScannerHelper.getAName();
        }
        System.out.println("End of the program");
    }
}


