package homeworks;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {


        System.out.println("\n---------------Task-1---------------\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter two numbers: ");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("The number 1 entered by user is = " + num1);
        System.out.println("The number 2 entered by user is = " + num2);
        System.out.println("The sum of number 1 and 2 entered by user is = " + (num1 + num2));



        System.out.println("\n---------------Task-2---------------\n");

        System.out.println("Please enter two numbers: ");

        int numA = scan.nextInt();
        int numB = scan.nextInt();

        System.out.println("The product of the given 2 numbers is: " + numA * numB);



        System.out.println("\n---------------Task-3---------------\n");

        System.out.println("Please enter two floating numbers: ");

        double number1 = scan.nextDouble();
        double number2 = scan.nextDouble();

        System.out.println("The sum of the given numbers is = " + (number1 + number2));
        System.out.println("The product of the given numbers is = " + number1 * number2);
        System.out.println("The subtraction of the given numbers is = " + (number1 - number2));
        System.out.println("The division of the given numbers is = " + number1 / number2);
        System.out.println("The remainder of the given numbers is = " + number1 % number2);



        System.out.println("\n---------------Task-4---------------\n");

        System.out.println("1.\t\t" + (-10 + 7 * 5));
        System.out.println("2.\t\t" + (72 + 24) % 24);
        System.out.println("3.\t\t" + (10 + -3 * 9 / 9));
        System.out.println("4.\t\t" + (5 + 18 / 3 * 3 - (6 % 3)));



        System.out.println("\n---------------Task-5---------------\n");

        System.out.println("Please enter two numbers: ");

        int numC = scan.nextInt();
        int numD = scan.nextInt();

        System.out.println("The average of the given numbers is: " + (numC + numD) / 2);



        System.out.println("\n---------------Task-6---------------\n");

        System.out.println("Please enter five numbers: ");

        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();
        int num6 = scan.nextInt();
        int num7 = scan.nextInt();


        System.out.println("The average of the given numbers is: " +
                (num3 + num4 + num5 + num6 + num7) / 5);




        System.out.println("\n---------------Task-7---------------\n");

        System.out.println("Please enter three numbers: ");

        int number3 = scan.nextInt();
        int number4 = scan.nextInt();
        int number5 = scan.nextInt();

        System.out.println("The " + number3 + " multiplied with " + number3 + " is = " + number3 * number3);
        System.out.println("The " + number4 + " multiplied with " + number4 + " is = " + number4 * number4);
        System.out.println("The " + number5 + " multiplied with " + number5 + " is = " + number5 * number5);




        System.out.println("\n---------------Task-8---------------\n");

        System.out.println("Please enter the side of a square: ");

        int squareSide = scan.nextInt();

        System.out.println("Perimeter of the square = " + 4 * squareSide);
        System.out.println("Area of the square = " + squareSide * squareSide);



        System.out.println("\n---------------Task-9---------------\n");

        double yearlySalary = 90_000;

        System.out.println("A Software Engineer in Test can earn $" + yearlySalary * 3 +
                " in 3 \nyears.");



        System.out.println("\n---------------Task-10---------------\n");

        scan.nextLine();

        System.out.println("Hey user, what is your favorite book?");
        String favBook = scan.nextLine();

        System.out.println("Hey user, what is your favorite color?");
        String favColor = scan.next();

        System.out.println("Hey user, what is your favorite number?");
        int favNumber = scan.nextInt();

        System.out.println("User’s favorite book is: " + favBook +
                            "\nUser’s favorite color is: " + favColor +
                            "\nUser’s favorite number is: " + favNumber);



        System.out.println("\n---------------Task-11---------------\n");

        scan.nextLine();

        System.out.println("Please enter your fist name: ");
        String firstName = scan.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scan.nextLine();

        System.out.println("Please enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Please enter your email address: ");
        String emailAddress = scan.nextLine();

        System.out.println("Please enter your phone number: ");
        String phoneNumber = scan.nextLine();


        System.out.println("Please enter your address: ");
        String address = scan.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " + lastName + ". " +
                firstName + "`s age is " + "\n" + age + ". " + firstName + "’s email address is " +
                emailAddress + ", phone number \nis " + phoneNumber + ", and address is " +
                address + ".");

    }
    }

