package projects;

import utilities.MathHelper;

import java.util.Random;

public class Project03 {
    public static void main(String[] args) {

        System.out.println("-----------Tas-1----------");
        /*
        -Assume that you are given below Strings
        String s1 = “24”, s2 = “5”;
        -Find the sum, subtraction, division, multiplication and remainder of the s1 and s2.
        The sum of 24 and 5 = 29
        The subtraction of 24 and 5 = 19
        The division of 24 and 5 = 4.8
        The multiplication of 24 and 5  = 120
        The remainder of 24 and 5 = 4
         */

        String s1 = "24", s2 = "5";

        int i1 = Integer.parseInt(s1), i2 = Integer.parseInt(s2);

        System.out.println("The sum of " + i1 + " and " + i2 + " = " + (i1 + i2) +
                "\nThe subtraction of " + i1 + " and " + i2 + " = " + (i1 - i2) +
                "\nThe division of " + i1 + " and " + i2 + " = " + (double)i1 / (double)i2 +
                "\nThe multiplication of " + i1 + " and " + i2 + " = " + (i1 * i2) +
                "\nThe remainder of " + i1 + " and " + i2 + " = " + (i1 % i2));


        System.out.println("-----------Tas-2----------");

        /*
        -Write a program that generates a random number between 1 to 35 (1 and 35 are
        included)
        -Find if the given number is a Prime Number
        -If random number generated is a prime one, then print “THE NUMBER IS A
        PRIME NUMBER”.
        -Otherwise, print “THE NUMBER IS NOT A PRIME NUMBER”
        Prime number is a number that can be divided only by itself and 1. It cannot be
        divided by any other number. The smallest prime number is 2 and 2 is the only
        even prime number.
        So, from this definition, prime numbers between 1 and 35 are: 2, 3, 5, 7, 11, 13, 17,
        19, 23, 29, 31
        Test data 1:
        Random number = 11
        Expected result 1:
        11 IS A PRIME NUMBER
        Test data 2:
        Random number = 15
        Expected result 2:
         */

        int rand = (int)(Math.random() * 35) + 1;
        System.out.println("Random number = " + rand);


        if(rand > 2 && rand != 3 && rand != 5 && (rand % 2 == 0 || rand % 3 == 0 || rand % 5 == 0) || rand == 1)
            System.out.println(rand + "  IS NOT A PRIME NUMBER");
        else
            System.out.println(rand + " IS THE PRIME NUMBER");





        System.out.println("-----------Tas-3----------");

        /*
        Write a program that generates 3 random numbers are between 1 and 50 (1 and 50 are included)
        -Find and print each number in ascending order
        -Ascending order is ordering from lowest to greatest
        NOTE: if 2 or 3 numbers are equal to each other, ignore it. It is out of scope for this
        task.
        Test data: Assume below numbers are generated
        Random number 1 = 43
        Random number 2 = 7
        Random number 3 = 30
        Expected result:
        Lowest number is = 7
        Middle number is = 30
        Greatest number is = 43
         */

        int a=(int)(Math.random() * 51) + 1;
        int b =(int)(Math.random() * 51) + 1;
        int c=(int)(Math.random() * 51) + 1;

        System.out.println("Random number 1 = " + a);
        System.out.println("Random number 2 = " + b);
        System.out.println("Random number 3 = " + c);

        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);

        if(a != b && b != c) {
            if (a != min && a != max)
                System.out.println("Lowest number is = " + min + "\nMiddle number is = " + a + "\nGreatest number is = " + max);
            else if (b != min && b != max)
                System.out.println("Lowest number is = " + min + "\nMiddle number is = " + b + "\nGreatest number is = " + max);
            else
                System.out.println("Lowest number is = " + min + "\nMiddle number is = " + c + "\nGreatest number is = " + max);
        }
        else System.out.println("Numbers are out of scope");

        System.out.println("-----------Tas-4----------");

        /*
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If the given char is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out if it is an uppercase or a lowercase letter.
        -If the letter is uppercase, then print “The letter is uppercase”, else print “The
        letter is lowercase”.
        NOTE: You need to use ASCII table and casting for this task
        Test data 1: Assume you are given 5
        char c = ‘5’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given a
        char c = ‘a’;
        Expected result 2:
        The letter is lowercase
        Test data 3: Assume you are given R
        char c = ‘R’;
        Expected result 3:
        The letter is uppercase
         */

        char character = '^';

        if(Character.isLetter(character)){
            if(Character.isLowerCase(character))
                System.out.println("The letter is lowercase");
            else if(Character.isUpperCase(character))
                System.out.println("The letter is uppercase");
        }
        else System.out.println("Invalid character detected!!!");



        System.out.println("---------Task-4 with ASCII---------");

        if(character >= 65 && character <= 90) System.out.println("The letter is uppercase");
        else if(character >= 97 && character <= 122) System.out.println("The letter is lowercase");

        else System.out.println("Invalid character detected!!!");




        System.out.println("-----------Tas-5----------");

        /*
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if given char is a letter but not digit or special character.
        -If it is not a letter, then print “Invalid character detected!!!”.
        -If it is a letter, then find out whether it is a vowel or a consonant.
        -If the letter is vowel, then print “The letter is vowel”, else print “The letter is
        consonant”.
        -Vowel letters: a, e, i o, u, A, E, I, O, U
        NOTE: You need to use ASCII table and casting for this example
        Test data 1: Assume you are given #
        char c = ‘#’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given E
        char c = ‘e’;
        Expected result 2:
        The letter is vowel
        Test data 3: Assume you are given R
        char c = ‘R’;
        Expected result 3:
        The letter is  consonant
         */

        char  character1 = 'e';

        if(Character.isLetter(character1)){
            if(character1 == 'a' || character1 == 'e' || character1 == 'i' || character1 == 'o' || character1 == 'u' ||
              character1 == 'A' || character1 == 'E' || character1 == 'I' || character1 == 'O' ||
              character1 == 'U')
                System.out.println("The letter is vowel");
            else System.out.println("The letter is  consonant");
        }
        else System.out.println("Invalid character detected!!!");



        System.out.println("---------Task-5 with ASCII---------");

        if((character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122)){
            if(character1 == 'a' || character1 == 'e' || character1 == 'i' || character1 == 'o' || character1 == 'u' ||
                    character1 == 'y' || character1 == 'A' || character1 == 'E' || character1 == 'I' || character1 == 'O' ||
                    character1 == 'U' || character1 == 'Y')
                System.out.println("The letter is vowel");
            else System.out.println("The letter is  consonant");
        }
        else System.out.println("Invalid character detected!!!");




        System.out.println("-----------Tas-6----------");

        /*
        -Assume you are given a single character. (It will be hard-coded)
        -First, check if the given char is a special character but not a digit or not a letter.
        -If it is not a special character, then print “Invalid character detected!!!”.
        -If it is a special character, then print “Special character is =
        {givenCharacter}”.
        NOTE: You need to use ASCII table and casting for this example
        Test data 1: Assume you are given 8
        char c = ‘8’;
        Expected result 1:
        Invalid character detected!!!
        Test data 2: Assume you are given *
        char c = ‘*’;
         */
        char character2 = '9';

        if(!Character.isLetterOrDigit(character2) || !Character.isWhitespace(character2))
            System.out.println("Special character is = " + character2);
        else System.out.println("Invalid character detected!!!");



        System.out.println("-----------Tas-7----------");

        /*
        Special character is = *
        TASK-7 (Find if given char is a letter or digit or special character)
        -Assume you are given a single character. (It will be hard-coded)
        -If given char is a letter, then print “Character is a letter”
        -If given char is a digit, then print “Character is a digit”
        -Otherwise, print “Character is a special character”
        Test data 1: Assume you are given g
        char c = ‘g’;
        Expected result 1:
        Character is a letter
        Test data 2: Assume you are given 5
        char c = ‘5’;
        Expected result 2:
        Character is a digit
        Test data 3: Assume you are given 5
        char c = ‘@’;
        Expected result 3:
        Character is a special character
         */

        char character3 = '#';

        if(Character.isLetter(character3))
            System.out.println("Character is a letter");
        else if(Character.isDigit(character3))
            System.out.println("Character is a digit");
        else System.out.println("Character is a special character");


        System.out.println("---------Palindrom--------");

        String n = "Civic";
        //System.out.println(MathHelper.palindrome(n) + " message");

        int random = (int)(Math.random() * 100 )+1;
        System.out.println(random);

        for (int i = 2; i < random / 2; i++) {
            if(random % i == 0) {
                System.out.println(random + " is not a prime");
                break;
            }
            else
                System.out.println(random + " is a prime");
        }

    }
}
