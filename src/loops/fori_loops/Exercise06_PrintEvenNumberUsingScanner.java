package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06_PrintEvenNumberUsingScanner {
    public static void main(String[] args) {

        int num1 = ScannerHelper.getANumber();
        int num2 = ScannerHelper.getANumber();

        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
