package practice.methods;

import utilities.ScannerHelper;

public class TestClass {

    public static void main(String[] args) {

        int input;
        int sum1 = 0;

        do{
            input = ScannerHelper.getANumber();
            if(input > 100){
                System.out.println("This number is already more than 100");
                break;
            }
            if(input + sum1 <= 100)
                sum1 += input;
        } while(sum1 < 100);

        if(sum1 >= 100)
            System.out.println("Sum of the entered numbers is at least " + sum1);
    }
}
