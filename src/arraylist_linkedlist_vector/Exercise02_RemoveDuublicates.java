package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise02_RemoveDuublicates {
    public static void main(String[] args) {

        /*
        Assume you have an ArrayList of languages as below
        Java
        JavaScript
        Ruby
        Go
        Java
        Ruby
        Java

        EXPECTED:
        [Java, JavaScript, Ruby, Go]
         */

        List<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Ruby", "Go", "Java", "Ruby", "Java"));

        List<String> uniques = new ArrayList<>();

        for(String l : languages){
            if(!uniques.contains(l)) uniques.add(l);
        }
        System.out.println(uniques);


    }
}
