package practice;

import java.util.Scanner;

public class MyPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.next();

        String reversedWord = "";
        if(word.length() < 1) System.out.println("This word does not have 1 or more characters");
        else {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i);
            }
            System.out.println(word.length() > 1 && reversedWord.equals(word) ?
                    "This word is palindrome" : "This word is not palindrome");
        }


    }
}




