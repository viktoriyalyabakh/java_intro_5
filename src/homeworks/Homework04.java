package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;

public class Homework04 {
    public static void main(String[] args) {


        System.out.println("-----------Task-1-----------");
        /*
        Requirement:
        Write a program that asks user to enter their names
        1. Print out the length of name
        2. Find the first character in the name and print it
        3. Find the last character in the name and print it
        4. Find the first 3 characters in the name and print them
        5. Find the last 3 characters in the name and print them
        6.      Check if name starts with character A (or a) or not and print
        messages below
        If name starts with A or a, print “You are in the club!”
        If name does not start with A or a, print “Sorry, you are not in
        the club”
        Test Data:
        David
        Expected Output:
        The length of the name is = 5
        The first character in the name is = D
        The last character in the name is = d
        The first 3 characters in the name are = Dav
        The last 3 characters in the name are = vid
        Sorry, you are not in the club
        */

        String name = ScannerHelper.getAName();

        System.out.println("The length of the name is = " + name.length() +
                "\nThe first character in the name is = " + name.charAt(0) +
                "\nThe last character in the name is = " + name.charAt(name.length()-1) +
                "\nThe first 3 characters in the name are = " + name.substring(0, 3) +
                "\nThe last 3 characters in the name are = " + name.substring(name.length() - 3));

        if(name.toLowerCase().startsWith("a")) System.out.println("You are in the club!");
        else System.out.println("Sorry, you are not in the club");



        System.out.println("-----------Task-2-----------");

        /*
        Write a program that asks user to enter their full address
        Check if city is Chicago (ignore cases) in the address
        If city is Chicago, then print “You are in the club”
        If city is Des Plaines, then print “You are welcome to join to
        the club”
        If city is any other city, then print “Sorry, you will never be in
        the club”
        Test Data 1:
        2860 S River Rd, Des Plaines, IL 60018
        Expected Output 1:
        You are welcome to join the club
        Test Data 2:
        3535 Abc St, Chicago, IL 12345
        Expected Output 2:
        You are in the club
        */

        String address = ScannerHelper.getAnAddress();

        if(address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if(address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");




        System.out.println("-----------Task-3-----------");

        /*
        Write a program that asks user to enter their fav colors, at least 4 colors
        Check If those colors contains “red” and “green”
        If “green” is listed in favorite colors, then print “Green is in the list”
        If “red” is listed in favorite colors, then print “Red is in the list”
        If both “green” and “red” are listed in favorite colors, then print
        “Green and red are in the list”
        Test Data 1:
        blue, purple, yellow, gray,
        brown
        Expected Output 1:
        Green and red are not in the
        list
        Test Data 2:
        Green, RED, blue, piNK
        Expected Output 2:
        Green and red are in the list
        Test Data 3:
        GREen, orange, YELLOW,
        pink
        Expected Output 3:
        Green is in the list
        Test Data 4:
        Yellow, REd, bluE, pink,
        black
        Expected Output 4:
        Red is in the list
        */

        String colors = ScannerHelper.getAColors().toLowerCase();

        if(colors.contains("red") && colors.contains("green"))
            System.out.println("Green and red are in the list");
        else if(colors.contains("red")) System.out.println("Red is in the list");
        else if(colors.contains("green")) System.out.println("Green is in the list");
        else System.out.println("Green and red are not in the list");




        System.out.println("-----------Task-4-----------");

        /*
        Assume that you are given below String
        String str = “   Java is FUN   ”;
        Create 3 new Strings and assign each word from str to those new Strings
        Finally print the results as below
        Expected output:
        The first word in the str is = java
        The second word in the str is = is
        The third word in the str is = fun
        NOTE:
        Make sure that you eliminate white spaces at the beginning and
        at the end of words in the str.
        Make sure that you converted all words to be in lower case in
                your results
        */

        String str = "   Java is FUN   ".trim().toLowerCase();

        System.out.println("The first word in the str is = " + str.substring(0, str.indexOf(" ")));
        System.out.println("The second word in the str is = " + str.substring(str.indexOf(" ")+1, str.lastIndexOf(" ")));
        System.out.println("The third word in the str is = " + str.substring(str.lastIndexOf(" ")+1));

    }
}
