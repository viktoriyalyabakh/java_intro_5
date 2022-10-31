package practice.methods;

public class StringMethodPractices {
    public static void main(String[] args) {


    }

    public static boolean isCharExisting (String str , char ch, int index){
        return str.charAt(index) == ch;
    }

    public static boolean isCharContained (String str , char ch){
       return str.contains(ch + "");
       // return str.contains(String.valueOf(ch));
    }
}
