package string_methods;

import utilities.ScannerHelper;

public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {

        String name = ScannerHelper.getAName();

        if(name.length() % 2 == 0)
            System.out.println("Middle chars is = " + name.substring(name.length()/2 - 1, name.length()/2 + 1));
        else System.out.println("Middle char is = " + name.charAt(name.length()/2));
    }
}
