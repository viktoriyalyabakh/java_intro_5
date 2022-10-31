package practice.methods;

import java.util.Locale;

public class MethodPractices {
    public static void main(String[] args) {
        //MethodPractices.printStringValue("John");
       // MethodPractices.printFirstTwoMiddleLastTwo("abc");
        MethodPractices.checkLength("fyre");
    }

    public static void printStringValue(String str) {
        if (str.isEmpty()) System.out.println("Length is zero");
        else {

            System.out.println("Length is = " + str.length() +
                    "\nFirst char is = " + str.charAt(0) +
                    "\nLast char is = " + str.charAt(str.length() - 1));
            if (str.toLowerCase().contains("a") || str.toLowerCase().contains("o") ||
                    str.toLowerCase().contains("i") || str.toLowerCase().contains("e") ||
                    str.toLowerCase().contains("u")) {
                System.out.println("This string has vowel!");
            } else {
                System.out.println("This String doesn`t have vowels ");
            }
        }
    }

    public static void printMiddle(String str){

        if (str.length() < 3) {
            System.out.println("Length is less than 3");
        } else
            if (str.length() % 2 == 0) {
            System.out.println(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
        } else {
            System.out.println(str.charAt(str.length() / 2));
        }

    }

    public static void printFirstTwoMiddleLastTwo(String str){
        if(str.length() < 4){
            System.out.println("INVALID INPUT");
        }
        else{
            System.out.println("First two characters are + " + str.substring(0, 2) +
                    "\nLast two characters are + " + str.substring(str.length() - 2) +
                    "\nThe other character are = " + str.substring(2, str.length() - 2));
        }
    }


    public static void checkLength(String str) {
        if (str.length() < 2) {
            System.out.println("Length is less than 2");
        } else
            System.out.println(str.substring(0, 2).equals(str.substring(str.length() - 2)));


    }
    }


