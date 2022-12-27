package exception_handling.custom_exceptions;

import utilities.ScannerHelper;

import java.security.acl.Permission;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPermition {

    public static void main(String[] args) {

        String name = null;
        int age = 25;

        /*
        Get the first character from the name and print it
        Divide the age by 0 and print the result
        Print {name}'s age is {age}.
        null's age is 25.
         */

        try{
            System.out.println(name.charAt(0));
            System.out.println(age / 0);
        }catch (NullPointerException nullPointerException){
            nullPointerException.printStackTrace();
        }
        catch (ArithmeticException arithmeticException){
            arithmeticException.printStackTrace();
        }

        System.out.println(name + "'s" + " age is " + age + ".");
    }
}
