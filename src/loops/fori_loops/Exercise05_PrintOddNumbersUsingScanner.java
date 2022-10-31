package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {

       int num = ScannerHelper.getANumber();

        for (int i = 0; i <= num; i++) {
            if(i % 2 != 0) System.out.println(i);
        }
    }
}
