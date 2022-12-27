package recurtion;

public class Practice02_ReverseString {

    public static String reverseString(String str){

        if(str.length() < 2) return str;
            return reverseString(str.substring(1) + str.charAt(0));

    }
}
