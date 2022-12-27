package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice05_Maps {
    public static void main(String[] args) {
        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        // Keys: Day, Color, City, Car, Pet
        // Values: Friday, Black, Chicago, Lexus, Turtle

        /*
        Get keys and print them
        [Car, Color, City, Day, Pet]
         */

        System.out.println(favorites.keySet());

        /*
        Print each value with a loop
         */

        for (String value : favorites.values()) {
            System.out.println(value);


            Set<Map.Entry<String, String>> favEntries = favorites.entrySet();

            int i = 1;
            for (Map.Entry<String, String> entry : favEntries) {
                i++;
                System.out.println(i + ". key = " + entry.getKey() + " and the value for it = " + entry.getValue());
            }
        }
    }
}
