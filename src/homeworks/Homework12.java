package homeworks;

import java.util.Arrays;

public class Homework12 {
    /*
    -Create a method called noDigit()
    -This method will take one String argument and it will
    return a new String with all digits removed from the
    original String
    Test Data 1: “”
    Expected Result 1: “”
    Test Data 2: “Java”
    Expected Result 2: “Java”
    Test Data 3: “123Hello”
    Expected Result 3: “Hello”
    Test Data 4: “123Hello World149”
    Expected Result 4: “Hello World”
    Test Data 5: “123Tech456Global149”
    Expected Result 5: “TechGlobal”
     */

    public static String noDigit(String str){
        return str.replaceAll("[0-9]", "");
    }

    /*
    -Create a method called noVowel()
    -This method will take one String argument and it will
    return a new String with all vowels removed from the
    original String
    Test Data 1: “”
    Expected Result 1: “”
    Test Data 2: “xyz”
    Expected Result 2: “xyz”
    Test Data 3: “JAVA”
    Expected Result 3: “JV”
    Test Data 4: “125$”
    Expected Result 4: “125$”
    Test Data 5: “TechGlobal”
    Expected Result 5: “TchGlbl”
     */

    public static String noVowel(String str){

//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//
//            if(str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'o'
//                    || str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'u'
//                    || str.toLowerCase().charAt(i) == 'e' )
//                continue;
//            result += str.charAt(i);
//        }
//        return result;

        return str.replaceAll("[aoiueAOUIE]", "");
    }

    /*
    -Create a method called sumOfDigits()
    -This method will take one String argument and it will return an int sum
    of all digits from the original String.
    NOTE: Return zero if there is no digits in the String
    Test Data 1: “”
    Expected Result 1: 0
    Test Data 2: “Java”
    Expected Result 2: 0
    Test Data 3: “John’s age is 29”
    Expected Result 3: 11
    Test Data 4: “$125.0”
    Expected Result 4: 8
     */

    public static int sumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }

    /*
    -Create a method called hasUpperCase()
    -This method will take one String argument and it will return boolean
    true if there is an uppercase letter and false otherwise.
    Test Data 1: “”
    Expected Result 1: false
    Test Data 2: “java”
    Expected Result 2: false
    Test Data 3: “John’s age is 29”
    Expected Result 3: true
    Test Data 4: “$125.0”
    Expected Result 4: false
     */

    public static boolean hasUpperCase(String str){

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
            return true;
        }
        return false;
    }

    /*
    -Create a method called middleInt()
    -This method will take three int arguments and it will return the middle
    int.
    Test Data 1: 1, 1, 1
    Expected Result 1: 1
    Test Data 2: 1, 2, 2
    Expected Result 2: 2
    Test Data 3: 5, 5, 8
    Expected Result 3: 5
    Test Data 4: 5, 3, 5
    Expected Result 4: 5
    Test Data 4: -1, 25, 10
    Expected Result 4: 10
     */

    public static int middleInt(int a, int b, int c){

        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);

        return a + b + c - max - min;
    }

    /*
    -Create a method called no13()
    -This method will take an int array as argument and it will return a new
    array with all 13 replaced with 0.
    NOTE: Assume length will always be more than zero.
    Test Data 1: [1, 2, 3 ,4]
    Expected Result 1: [1, 2, 3 ,4]
    Test Data 2: [13, 2, 3 ]
    Expected Result 2: [0, 2, 3 ]
    Test Data 3:[13, 13, 13 , 13, 13]
    Expected Result 3: [0, 0, 0, 0, 0]
     */

    public static int[] no13(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 13) arr[i] = 0;
        }
       return arr;
    }

    /*
    -Create a method called arrFactorial()
    -This method will take an int array as argument and it will return the
    array with every number replaced with their factorials.
    NOTE: If given array is empty, then return it back empty.
    NOTE: 0! equals to 1
    Test Data 1: [1, 2, 3, 4]
    Expected Result 1: [1, 2, 6, 24]
    Test Data 2: [0, 5]
    Expected Result 2: [1, 120]
    Test Data 3:[5 , 0, 6]
    Expected Result 3: [120, 1, 720]
    Test Data 4:[]
    Expected Result 4: []
     */

    public static int[] arrFactorial(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int factorial = 1;
            for (int j = 1; j <= arr[i]; j++) {
                factorial *= j;
            }
            arr[i] = factorial;
        }
        return arr;
    }

    /*
    -Create a method called categorizeCharacters()
    -This method will take String as an argument and return a String array as
    letters at index of 0, digits at index of 1 and specials at index of 2.
    NOTE: IGNORE SPACES
    NOTE: Assume length will always be more than zero.
    Test Data 1: “     ”
    Expected Result 3: [ , , ]
    Test Data 2: “abc123$#%”
    Expected Result 2: [abc, 123, $#%]
    Test Data 3: “12ab$%3c%”
    Expected Result 3: [abc, 123, $%%]
     */

    public static String[] categorizeCharacters(String str){

        String letters = " ";
        String digits = " ";
        String special = " ";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i))){
                continue;
            }
            else if(Character.isLetter(str.charAt(i))) letters += str.charAt(i);
            else if(Character.isDigit(str.charAt(i))) digits += str.charAt(i);
            else special += str.charAt(i);
        }
        return new String[] {letters, digits, special};
    }
    public static void main(String[] args) {

        System.out.println(noDigit("123Hello World149"));
        System.out.println(noVowel("TechGlobal"));
        System.out.println(sumOfDigits("j9j9j9j9j9"));
        System.out.println(hasUpperCase("88**uh"));
        System.out.println(middleInt(15,5,8));
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{})));
        System.out.println(Arrays.toString(categorizeCharacters("      ")));
    }
}
