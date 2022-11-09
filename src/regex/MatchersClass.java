package regex;

import utilities.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchersClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");
        Matcher matcher = pattern.matcher("hello");

        System.out.println(matcher.matches());



        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();

        pattern = Pattern.compile("[A-Za-z]{1,}");
        matcher = pattern.matcher(sentence);

        int counter = 0;

        while(matcher.find()){
            System.out.println(matcher.group());
            counter++;
        }
        System.out.println("This sentence contains " + counter + " words");


        pattern = Pattern.compile("[a-zA-Z0-9_-]{8,15}");

    }
}
