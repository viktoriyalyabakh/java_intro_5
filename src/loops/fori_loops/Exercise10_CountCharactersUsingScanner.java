package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {

         String str = ScannerHelper.getAName();

         int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == 'l')
                count ++;
        }
        System.out.println(count);
    }
}
