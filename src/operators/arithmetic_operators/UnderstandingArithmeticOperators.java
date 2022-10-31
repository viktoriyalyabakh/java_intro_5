package operators.arithmetic_operators;

public class UnderstandingArithmeticOperators {
    public static void main(String[] args) {

        /*
        Create 2 int variables called as num1 and num2
        And store 6 and 4 in these variables respectively
        Find their
        sum
        subtraction
        product
        division
        remainder
        */

        int num1 = 6;
        int num2 = 4;

        System.out.println("The sum of " + num1 + " and " + num2
                + " = " + (num1 + num2));
        System.out.println("The subtraction of " + num1 + " and " + num2
                + " = " + (num1 - num2));
        System.out.println("The multiplication of " + num1 + " and " + num2
                + " = " + num1 * num2);
        System.out.println("The division of " + num1 + " and " + num2
                + " = " + (double)num1/(double)num2);
        System.out.println("The remainder of " + num1 + " and " + num2
                + " = " + (num1 % num2));
    }
}
