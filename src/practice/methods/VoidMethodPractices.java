package practice.methods;

public class VoidMethodPractices {
    public static void main(String[] args) {
    VoidMethodPractices.checkAge(22);
    VoidMethodPractices.checkCreditScore(0.6);
    }
    static public void checkAge(int age){
        if(age >= 0 && age <= 19)
            System.out.println("You are a teenager");
        else if(age > 21)
            System.out.println("You can drink coke");
        else System.out.println("You can drive");

    }
    static public void checkCreditScore(double balance){
        if(balance >= 0.0 && balance <= 999.00)
            System.out.println("Low credit score");
        else if(balance >= 1000.00 && balance <= 1999.00)
            System.out.println("Medium credit score");
        else if(balance >= 2000.00 && balance <= 2999.99 )
            System.out.println("Good credit score");
        else System.out.println("No valid credit score!");
    }
}
