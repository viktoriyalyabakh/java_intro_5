package projects;

import java.util.ArrayList;
import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("------------Task-1------------");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 3 numbers");

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        System.out.println("The product of the numbers entered is = " + (number1 * number2 * number3));


        System.out.println("------------Task-2------------");

        scan.nextLine();

        int currentYear = 2022;

        System.out.println("What is your first name?");
        String firstName = scan.nextLine();

        System.out.println("What is your last name?");
        String lasttName = scan.nextLine();

        System.out.println("What is your year of birth?");
        int yearOfBirth = scan.nextInt();

        System.out.println(firstName + " " + lasttName + "’s age is = " + (currentYear - yearOfBirth) + ".");



        System.out.println("------------Task-3------------");

        double lbsInOneKg = 2.205;

        scan.nextLine();

        System.out.println("What is your full name?");
        String fullName = scan.nextLine();

        System.out.println("What is your weight?");
        double kgWeight = scan.nextDouble();

        System.out.println(fullName + "’s weight is = " + (kgWeight * lbsInOneKg + " lbs."));


        System.out.println("------------Task-4------------");

        scan.nextLine();

        System.out.println("What is your full name?");
        String fullName1 = scan.nextLine();

        System.out.println("What is your age?");
        int age1 = scan.nextInt();

        scan.nextLine();

        System.out.println("What is your full name?");
        String fullName2 = scan.nextLine();

        System.out.println("What is your age?");
        int age2 = scan.nextInt();

        scan.nextLine();

        System.out.println("What is your full name?");
        String fullName3 = scan.nextLine();

        System.out.println("What is your age?");
        int age3 = scan.nextInt();

        System.out.println(fullName1 + "’s age is " + age1 + ".");
        System.out.println(fullName2 + "’s age is " + age2 + ".");
        System.out.println(fullName3 + "’s age is " + age3 + ".");
        System.out.println("The average age is " + (age1 + age2 + age3)/3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(age1, age2), age3) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(age1, age2), age3) + ".");

    }
}
