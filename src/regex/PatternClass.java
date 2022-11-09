package regex;

import utilities.ScannerHelper;

import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        System.out.println(pattern);// returns the pattern
        System.out.println(pattern.pattern());// returns the pattern as a String
        System.out.println(pattern.toString());// returns the pattern as a String

        System.out.println(Pattern.matches(pattern.pattern(), "Apple"));//false bc uppercase A
        System.out.println(Pattern.matches(pattern.pattern(), "hello world"));//false bc space and too long


        String name = ScannerHelper.getAName();

        pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");
        //if(name.matches("[a-zA-Z0-9]{5,10}")
        if(Pattern.matches(pattern.pattern(), name)) System.out.println("Valid Username");
        else System.out.println("Error! Username must be 5 to 10 characterrs long and can contain letters and numbers");

    }

    }


