package homeworks;

import java.util.Scanner;

public class Homework03 {

    public static void main(String[] args) {

        System.out.println("----------Task-1----------");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));


        System.out.println("----------Task-2----------");

        System.out.println("Please enter five numbers");

        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        System.out.println("Max value = " + Math.max(Math.max(Math.max(n1, n2),Math.max(n3, n4)), n5));
        System.out.println("Min value = " + Math.min(Math.min(Math.min(n1, n2),Math.min(n3, n4)), n5));


        System.out.println("----------Task-3----------");

        int number1 = (int)(Math.random() * 51) + 50;
        int number2 = (int)(Math.random() * 51) + 50;
        int number3 = (int)(Math.random() * 51) + 50;

        System.out.println("Number 1 = " + number1 + "\nNumber 2 = " + number2 +
                "\nNumber 3 = " + number3);
        System.out.println("The sum of numbers is = " + (number1 + number2 + number3));


        System.out.println("----------Task-4----------");

        double moneyOfAlex = 125, moneyOfMike = 220;

        double givenByAlex = 25.5;

        moneyOfAlex -= givenByAlex;
        moneyOfMike += givenByAlex;

        System.out.println("Alex’s money: $" + moneyOfAlex);
        System.out.println("Mike’s money: $" + moneyOfMike);


        System.out.println("----------Task-5----------");

        double priceOfBicycle = 390, savePerDay = 15.6;

        System.out.println((int)(priceOfBicycle / savePerDay));


        System.out.println("----------Task-6----------");

        String s1 = "5", s2 = "10";

        int i1 = Integer.parseInt(s1), i2 = Integer.parseInt(s2);

        System.out.println("Sum of " + i1 + " and " + i2 + " is = " + (i1 + i2));
        System.out.println("Product of " + i1 + " and " + i2 + " is = " + (i1 * i2));
        System.out.println("Division of " + i1 + " and " + i2 + " is = " + (i1 / i2));
        System.out.println("Subtraction of " + i1 + " and " + i2 + " is = " + (i1 - i2));
        System.out.println("Remainder of " + i1 + " and " + i2 + " is = " + (i1 % i2));


        System.out.println("----------Task-7----------");

        String s3 = "200", s4 = "-50";

        int i3 = Integer.parseInt(s3), i4 = Integer.parseInt(s4);

        System.out.println("The greatest value is = " + Math.max(i3, i4));
        System.out.println("The smallest value is = " + Math.min(i3, i4));
        System.out.println("The average is = " + (i3 + i4)/2);
        System.out.println("The absolute difference is = " + Math.abs(i3 - i4));


        System.out.println("----------Task-8----------");

        double saveCoinPerDay = 0.96;

        System.out.println((int)(24 / saveCoinPerDay) + " days");
        System.out.println((int)(168 / saveCoinPerDay) + " days");
        System.out.println("$" + (150 * saveCoinPerDay));


        System.out.println("----------Task-9----------");

        double computerPrice = 1250, savingPerDay = 62.5;

        System.out.println((int)(computerPrice / savingPerDay));


        System.out.println("----------Task-10----------");

        double saveForCar = 14265, option1 = 475.5, option2 =  951;

        System.out.println("Option 1 will take " + (int)(saveForCar/ option1) + " months");
        System.out.println("Option 2 will take " + (int)(saveForCar/ option2) + " months");


        System.out.println("----------Task-11----------");

        System.out.println("Number 1 = ");
        int numberA = input.nextInt();

        System.out.println("Number 2 = ");
        int numberB = input.nextInt();

        System.out.println((double)numberA / (double)numberB);


        System.out.println("----------Task-12----------");

        int a1 = (int)(Math.random() * 101), a2 = (int)(Math.random() * 101), a3 = (int)(Math.random() * 101);

        if(a1 >= 26 && a2 >= 26 && a3 >= 26) System.out.println(true);
        else System.out.println(false);


        System.out.println("----------Task-13----------");

        System.out.println("Hey user, enter number between 1 and 7 included");
        int dayNumber = input.nextInt();

        if(dayNumber == 1)
            System.out.println("The number entered returns MONDAY");
        else if(dayNumber == 2)
            System.out.println("The number entered returns TUESDAY");
        else if(dayNumber == 3)
            System.out.println("The number entered returns WEDNESDAY");
        else if(dayNumber == 4)
            System.out.println("The number entered returns THURSDAY");
        else if(dayNumber == 5)
            System.out.println("The number entered returns FRIDAY");
        else if(dayNumber == 6)
            System.out.println("The number entered returns SATURDAY");
        else
            System.out.println("The number entered returns SUNDAY");


        System.out.println("----------Task-14----------");

        System.out.println("Tell me your exam result?");
        int examResult1 = input.nextInt();
        int examResult2 = input.nextInt();
        int examResult3 = input.nextInt();

        if(((examResult1 + examResult2 + examResult3) / 3) >= 70)
            System.out.println("YOU PASSED!");
        else
            System.out.println("YOU FAILED!");



        System.out.println("----------Task-15----------");

        System.out.println("Enter 3 numbers");

        int b1 = input.nextInt();
        int b2 = input.nextInt();
        int b3 = input.nextInt();

        if(b1 == b2 && b2 == b3)
            System.out.println("TRIPLE MATCH");
        else if(b1 != b2 && b2 != b3 && b1 != b3)
            System.out.println("NO MATCH");
        else
            System.out.println("DOUBLE MATCH");

    }
}
