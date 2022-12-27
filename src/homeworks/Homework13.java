package homeworks;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework13 {
    /*
    -Create a method called hasLowerCase()
    -This method will take a String argument, and it will
    return boolean true if there is lowercase letter and false if it doesn’t.
    Test Data 1: “”
    Expected Result 1: false
    Test Data 2: “JAVA”
    Expected Result 2: false
    Test Data 3: “125$”
    Expected Result 3: false
    Test Data 4: “hello”
    Expected Result 4: true
     */
    public static boolean hasLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase((str.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    /*
    -Create a method called noZero()
    -This method will take one Integer ArrayList argument
    and it will return an ArrayList with all zeros removed
    from the original Integer ArrayList.
    NOTE: Assume that ArrayList size will be at least 1.
    Test Data 1: [1]
    Expected Result 1: [1]
    Test Data 2: [1, 1, 10]
    Expected Result 2: [1, 1, 10]
    Test Data 3: [0, 1, 10]
    Expected Result 3: [1, 10]
    Test Data 4: [0, 0, 0]
    Expected Result 4: []
     */
    public static ArrayList noZero(ArrayList<Integer> arrList) {
        arrList.removeIf(n -> n == 0);
        return arrList;
    }

    /*
    -Create a method called numberAndSquare()
    -This method will take an int array argument and it will
    return a multidimensional array with all numbers
    squared.
    NOTE: Assume that array size is at least 1.
    Test Data 1: [1, 2, 3]
    Expected Result 1: [[1, 1], [2, 4], [3, 9]]
    Test Data 2: [0, 3, 6]
    Expected Result 2: [[0, 0], [3, 9], [6, 36]]
    Test Data 3: [1, 4]
    Expected Result 3: [[1,1], [4, 16]]
     */

    public static int[][] numberAndSquare(int[] arr) {
        int[][] multyArr = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            multyArr[i][0] = arr[i];
            multyArr[i][1] = arr[i] * arr[i];
        }
        return multyArr;
    }

    /*
    -Create a method called containsValue()
    -This method will take a String array and a String
    argument, and it will return a boolean. Search the
    variable inside of the array and return true if it exists in
    the array. If it doesn’t exist, return false.
    NOTE: Assume that array size is at least 1.
    NOTE: The method is case-sensitive
    Test Data 1: [“abc”, “foo”, “java”], “hello”
    Expected Result 1: false
    Test Data 2: [“abc”, “def”, “123”], “Abc”
    Expected Result 2: false
    Test Data 3: [“abc”, “def”, “123”, “Java”, “Hello”], “123”
    Expected Result 3: true
    Hint: Use binarySearch() for easy solution
     */
    public static boolean containsValue(String[] str, String key) {

        Arrays.sort(str);
        return Arrays.binarySearch(str, key) >= 0;
    }
    /*
    -Create a method called reverseSentence()
    -This method will take a String argument and it will
    return a String with changing the place of every word.
    All words should be in reverse order. Make sure that there
    are two words inside the sentence at least. If there is no
    two words return “There is not enough words!”.
    NOTE: After you reverse, only first letter must be
    uppercase and the rest will be lowercase!
    Test Data 1: “Hello”
    Expected Result 1: “There is not enough words!”
    Test Data 2: “Java is fun”
    Expected Result 2: “Fun is java”
    Test Data 3: “This is a sentence”
    Expected Result 3: “Sentence a is this”
    Hint: Use split() for easy solution
    Note: Make the new first word’s first letter upper case
    and make the old first word’s first letter lower case
     */

    public static String reverseSentence(String str) {
        if (str.contains(" ")) {
            StringBuilder sb = new StringBuilder();
            String[] strArr = str.split(" ");

            for (int i = strArr.length - 1; i >= 0; i--) {
                sb.append(strArr[i].toLowerCase() + " ");
            }
            return sb.substring(0, 1).toUpperCase() + sb.substring(1).trim();
        }
        return "There is not enough words!";
    }

    /*
    -Create a method called removeStringSpecialsDigits()
    -This method will take a String as argument, and it will
    return a String without the special characters or digits.
    NOTE: Assume that String length is at least 1.
    NOTE: Do not remove spaces.
    Test Data 1: “123Java #$%is fun”
    Expected Result 1: “Java is fun”
    Test Data 2: “Selenium”
    Expected Result 2: “Selenium”
    Test Data 3: “Selenium 123#$%Cypress”
    Expected Result 3: “Selenium Cypress”
     */

    public static String removeStringSpecialsDigits(String str) {

            String s = str.replaceAll("[^a-zA-Z ]", "");
            return s;
        }
    public static String removeStringSpecialsDigits2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i)) || Character.isLetterOrDigit(str.charAt(i)))
                result += str.charAt(i) + "";
        }
        return result;
    }

        /*
        -Create a method called removeArraySpecialsDigits()
        -This method will take a String array as argument, and
        it will return a String array without the special
        characters or digits from the elements.
        NOTE: Assume that array size is at least 1.
        Test Data 1: [“123Java”, “#$%is”, “fun”]
        Expected Result 1: [“Java”, “is”, “fun”]
        Test Data 2: [“Selenium”, “123$%”, “###”]
        Expected Result 2: [“Selenium”, “”, “”]
        Test Data 3: [“Selenium”, “123#$%Cypress”]
        Expected Result 3: [“Selenium”, “Cypress”]
         */

    public static String[] removeArraySpecialsDigits(String[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("[^a-zA-Z ]", "");
        }
        return arr;
    }

    /*
    -Create a method called removeAndReturnCommons()
    -This method will take two String ArrayList and it will
    return all the common words as String ArrayList.
    NOTE: Assume that both ArrayList sizes are at least 1.
    Test Data 1: [“Java”, “is”, “fun”], [“abc”, “xyz”, “123”]
    Expected Result 1: []
    Test Data 2: [“Java”, “is”, “fun”], [“Java”, “C#”,
    “Python”]
    Expected Result 2: [“Java”]
    Test Data 3: [“Java”, “C#”, “C#”], [“Python”, “C#”, “C+
    +”]
    Expected Result 3: [“C#”]
     */

    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> arr1, ArrayList<String> arr2){

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < Math.min(arr1.size(), arr2.size()); i++) {
            if(arr1.get(i).equals(arr2.get(i))) result.add(arr1.get(i));
        }
        return result;
    }

    /*
    -Create a method called noXInVariables()
    -This method will take an ArrayList argument, and it will
    return an ArrayList with all the x or X removed from
    elements.
    If the element itself equals to x or X or contains only x
    letters, then remove that element.
    NOTE: Assume that ArrayList size is at least 1.
    Test Data 1: [abc, 123, #$%]
    Expected Result 1: [abc, 123, #$%]
    Test Data 2: [xyz, 123, #$%]
    Expected Result 2: [yz, 123, #$%]
    Test Data 3: [x, 123, #$%]
    Expected Result 3: [123, #$%]
    Test Data 4: [xyXyxy, Xx, ABC]
    Expected Result 4: [yyy, ABC]
     */

    public static ArrayList<String> noXInVariables(ArrayList<String> strArr){

        ArrayList<String> result = new ArrayList<>();

        for (String s : strArr) {
            result.add(s.replaceAll("[xX]", ""));
            result.removeIf(String::isEmpty);
        }
        return result;
    }

        public static void main (String[]args){
            System.out.println(hasLowerCase("hello"));
            System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 0, 0))));
            System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 2})));
            System.out.println(containsValue(new String[]{"asd", "fds", "qaz", "123"}, "123"));
            System.out.println(reverseSentence("Java"));
            System.out.println(removeStringSpecialsDigits("Selenium 123#$%Cypress"));
            System.out.println(Arrays.asList(removeArraySpecialsDigits(new String[]{"lll%55", "34(kkk", "hh8*h"})));

            ArrayList<String> a1 = new ArrayList<>(Arrays.asList("Xox","hforx", "X", "x", "Soon", "cat"));
            ArrayList<String> a2 = new ArrayList<>(Arrays.asList(" ", " "));
            System.out.println(removeAndReturnCommons(a1, a2));

            System.out.println(noXInVariables(a1));
        }

    }

