package homeworks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {


        System.out.println(countConsonants("JAVA"));
    }
    // TASK 1
    /*
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

    public static int countConsonants(String str){

        Pattern pattern = Pattern.compile("[^aoiueAOUIE]");
        Matcher matcher = pattern.matcher(str);

        int countConsonants = 0;

        while (matcher.find()) {
            countConsonants++;
        }
        return countConsonants;
        }

    }

