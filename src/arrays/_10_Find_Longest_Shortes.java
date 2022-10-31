package arrays;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class _10_Find_Longest_Shortes {

    public static void main(String[] args) {

        String[] colors = {"red", "blue", "yellow", "white"};
        findShortestAndLongest(colors);

    }

        /*
        create a public static method which will take a String array then it will print the longest and shortest
        string from that array.

        Example:
        Array ->  String[] colors = {"red", "blue", "yellow", "white"};

        Output:
            Shortest = red
            Longest = yellow

         */

    public static void findShortestAndLongest(String[] strs){
        /*
        1.create a loop and conteners
        2.check the length of the elements
        3.find shorter and longer
        4.print
         */

        String shortest = strs[0], longest = strs[0];

        for(int i = 1; i < strs.length; i++){
            if(longest.length() < strs[i].length()) {
                longest = strs[i];
            }
            else if(shortest.length() > strs[i].length()) {
                shortest = strs[i];
            }
            }
        System.out.println("Shortest = " + shortest);
        System.out.println("Longest = " + longest);






    }
}
