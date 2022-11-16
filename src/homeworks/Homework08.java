package homeworks;

import utilities.ScannerHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {


        System.out.println(countConsonants("JAVA"));
        System.out.println(wordArray("Hello, nice  to  &%$  meet_ you!!"));
        System.out.println(removeExtraSpaces("Hello,    nice to   meet     you!!"));
        System.out.println(count3OrLess());
        System.out.println(isDateFormatValid("1/20/1991"));
        System.out.println(isEmailFormatValid("ajjjj@student.com"));
    }
    /*
    TASK 1
    Write a method named countConsonants() that takes a String as an argument a returns how many consonants
    are in the String.
    NOTE: You must use regex
    Example program1:
    String str = “hello”;
    Program: 3
    Example program2:
    String str = “JAVA”;
    Program: 2
    Example program2:
    String str = “”;
    Program: 0
     */

    public static int countConsonants(String str) {

        Pattern pattern = Pattern.compile("[^aoiueAOUIE]");
        Matcher matcher = pattern.matcher(str);

        int countConsonants = 0;

        while (matcher.find()) {
            countConsonants++;
        }
        return countConsonants;
    }

        /*
        TASK 2
        Write a method named wordArray() that takes a String
        as an argument a returns a String array with all the
        words in the String
        NOTE: Make as dynamic as possible.
        Example program1:
        String str = “hello”;
        Program: [hello]
        Example program2:
        String str = “java  is    fun”;
        Program: [java, is, fun]
        Example program2:
        String str = “Hello, nice to meet you!!”;
        Program: [Hello, nice, to, meet, you]
         */

    public static String wordArray(String str) {

        String[] s = str.split("[ ,\\W_]+");
        return Arrays.toString(s);

    }

        /*
        TASK 3
        Write a method named removeExtraSpaces() that takes
        a String as an argument a returns the String back with
        all extra spaces removed.
        NOTE: Make sure you use regex
        Example program1:
        String str = “hello”;
        Program: hello
        Example program2:
        String str = “java  is    fun”;
        Program: java is fun
        Example program2:
        String str = “Hello,    nice to   meet     you!!”;
        Program: Hello, nice to meet you!!
         */

    public static String removeExtraSpaces(String str) {

        return str.replaceAll("[ ]+", " ");

    }

       /*
       TASK 4
       Write a method named count3OrLess() that asks the
        user to enter a sentence. Return a count of how many
        words are 3 characters long or less.
        NOTE: You must use regex
        Example program1:
        String str = “I go to TechGlobal”;
        Program: 3
        Example program2:
        String str = “Hi, my name is John Doe”;
        Program: 4
        Example program2:
        String str = “Hello guys”;
        Program: 0
        */

    public static int count3OrLess() {


        String[] strArray = ScannerHelper.getAString().split(" ");

        int counter = 0;

        for (String s : strArray) {
            if (s.matches("[a-zA-Z]{0,3}")) counter++;
        }
        return counter;
    }
        /*
        TASK 5
        Write a method named isDateFormatValid() that takes a
        String dateOfBirth as an argument and checks if the given
        date matches the given DOB requirements.
        This method would return a true or false boolean
        Format: nn/nn/nnnn
        Example program1:
        String dateOfBirth = “01/21/1999”;
        Program: true
        Example program2:
        String dateOfBirth = “1/20/1991”;
        Program: false
        Example program3:
        String dateOfBirth = “10/2/1991”;
        Program: false
        Example program4:
        String dateOfBirth = “12-20 2000”;
        Program: false
        Example program5:
        String dateOfBirth = “12/16/19500”;
        Program: false
         */

        public static boolean isDateFormatValid(String str){
            return Pattern.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}", str);
        }

        /*
        TASK 6
        Write a method named isEmailFormatValid() that takes a String
        email as an argument and checks if the given email matches
        the given email requirements.
        This method would return a true or false boolean.
        Format: <2+chars>@<2+chars>.<2+chars>
        NOTE: Do not use any type of loop. Use Regex
        Example program1:
        String email = “abc@gmail.com”;
        Program: true
        Example program2:
        String email = “abc@student.techglobal.com”;
        Program: true
        Example program3:
        String email = “a@gmail.com”;
        Program: false
        Example program4:
        String email = “abcd@@gmail.com”;
        Program: false
        Example program5:
        String email = “abc@gmail”;
        Program:false
         */

    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("^(.{2,})@(.{2,}).(\\.[com]{2,})$", email);
    }
    }









