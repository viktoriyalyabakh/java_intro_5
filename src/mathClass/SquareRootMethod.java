package mathClass;

import java.util.Scanner;

public class SquareRootMethod {
    public static void main(String[] args) {


        int number = 81;
        int number2 = 25;
        int number3 = 64;

        System.out.println("Root of number is " + Math.sqrt(number));
        System.out.println("Root of number2 is " + Math.sqrt(number2));
        System.out.println("Root of number3 is " + Math.sqrt(number3));

        Scanner inoutTaker = new Scanner(System.in);

        System.out.println("Hey user give me a number");
        double userNumber = inoutTaker.nextDouble();

        System.out.println("Your number root is " + Math.sqrt(userNumber));
    }
}
