package practice.methods;

public class ReturnMethodPractices {
    public static void main(String[] args) {
    ReturnMethodPractices.findDifference(6, 9);
    ReturnMethodPractices.findDifference(6.2, 4.3);
    ReturnMethodPractices.isIncluded("John", "John Doe");
    }


    public static int findDifference (int num1, int num2) {
      return Math.abs(num1 - num2);
    }
    public static double findDifference (double num1, double num2) {
        return Math.abs(num1 - num2);
    }
public static boolean isIncluded (String str1, String str2) {
    if (str1.length() < str2.length()) return str2.contains(str1);
    return str1.contains(str2);

}
}