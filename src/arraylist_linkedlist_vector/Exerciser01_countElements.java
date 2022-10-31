package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.List;

public class Exerciser01_countElements {
    public static void main(String[] args) {

        System.out.println("\n---------Task 01---------\n");

        /*
        Create an ArrayList and store below colors
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple
         */

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Purple");

        System.out.println(colors);
        System.out.println(colors.size());

        for(String color : colors){
            System.out.println(color);
        }

        System.out.println("\n---------Task 02---------\n");

        /*
        Count the elements that has length of 6

        Expected:
        2
         */
        System.out.println("\n---for each loop----\n");
        int counter = 0;
        for (String color : colors) {
            if(color.length() == 6)
              counter++;
        }
        System.out.println(counter);

        System.out.println("\n---for i loop----\n");
        counter =0;
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).length() == 6) counter++;
        }
        System.out.println(counter);


        System.out.println("\n---------Task 03---------\n");

        /*
        Count the elements has 'o'
        //Brown and Yellow

        EXPECTED:
        2
         */
        counter = 0;
        for(String color : colors){
            if(color.toLowerCase().contains("o")) counter++;
        }
        System.out.println(counter);
    }
}
