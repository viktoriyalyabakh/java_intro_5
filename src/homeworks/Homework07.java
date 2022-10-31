package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Homework07 {
    public static void main(String[] args) {
        System.out.println("\n-----------Task-01------------\n");

        /*
        -Create an ArrayList and store below numbers
        10, 23, 67, 23, 78
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 2
        -Print the entire list
        Expected Result:
        23
        10
        67
        [10, 23, 67, 23, 78
         */

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 23, 67, 23, 78));

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);


        System.out.println("\n-----------Task-02------------\n");

        /*
        -Create an ArrayList and store below colors
        Blue, Brown, Red, White, Black, Purple
        THEN:
        -Print element at index of 1
        -Print element at index of 3
        -Print element at index of 5
        -Print the entire list
        Expected Result:
        Brown
        White
        Purple
        [Blue, Brown, Red, White, Black, Purple]
         */

        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Red", "White", "Black", "Purple"));

        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);

        System.out.println("\n-----------Task-03------------\n");

        /*
        -Create an ArrayList and store below numbers
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire list
        -Print the entire list sorted in ascending order
        Expected Result:
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100]
         */

        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(23, -34, -56, 0, 89, 100));

        System.out.println(numbers1);

        Collections.sort(numbers1);
        System.out.println(numbers1);

        System.out.println("\n-----------Task-04------------\n");

        /*
        -Create an ArrayList and store below cities
        Istanbul, Berlin, Madrid, Paris
        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        Expected Result:
        [Istanbul, Berlin, Madrid, Paris]
        [Berlin, Istanbul, Madrid, Paris]
         */

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Istanbul", "Berlin", "Madrid", "Paris"));

        System.out.println(cities);

        Collections.sort(cities);
        System.out.println(cities);


        System.out.println("\n-----------Task-05------------\n");

        /*
        -Create an ArrayList and store Marvel characters below
        Spider Man, Iron Man, Black Panter, Deadpool, Captain America
        THEN:
        -Print the entire list
        -Then, check if it contains Wolwerine
        if it contains Wolwerine, then print true
        if it does not contain Wolwerine, print false
        Expected Result:
        [Spider Man, Iron Man, Black Panter, Deadpool, Captain America]
        false
         */

        List<String> marvelCharacters = new ArrayList<>(Arrays.asList("Spider Man", "Iron Man", "Black Panter", "Deadpool", "Captain America"));

        System.out.println(marvelCharacters);

        System.out.println(marvelCharacters.contains("Wolwerine"));


        System.out.println("\n-----------Task-06------------\n");

        /*
        -Create an ArrayList and store Avengers characters below
        Hulk, Black Widow, Captain America, Iron Man
        THEN:
        -Print the entire list sorted lexicographically
        -Then, check if it contains Hulk and Iron Man
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Black Widow, Captain America, Hulk, Iron Man]
        true
         */

        List<String> avengersChars = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));

        Collections.sort(avengersChars);

        System.out.println(avengersChars);
        System.out.println(avengersChars.contains("Hulk") && avengersChars.contains("Iron Man"));


        System.out.println("\n-----------Task-07------------\n");

        /*
        -Create an ArrayList and store characters below
        A, x, $, %, 9, *, +, F, G
        THEN:
        -Print the entire list
        -Print each element
        Expected Result:
        [A, x, $, %, 9, *, +, F, G]
        A
        x
        $
        %
        9
        *
        +
        F
        G
         */

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));

        System.out.println(characters);

        for(char character : characters) {
            System.out.println(character);
        }


        System.out.println("\n-----------Task-08------------\n");

        /*
        -Create an ArrayList and store below objects
        Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
        THEN:
        -Print the entire list
        -Print the entire list sorted lexicographically
        -Count objects that starts with M or m
        -Count objects that does not have A or a or E or e
        Expected Result:
        [Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter]
        [Adapter, Desk, Laptop, Monitor, Mouse, Mouse-Pad]
        3
        1
         */

        String[] arr = {"Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"};
        List<String> objects = new ArrayList<>(Arrays.asList(arr));

        System.out.println(objects);
        Collections.sort(objects);

        int countM = 0;
        int countAOrE = 0;

        for(String object : objects){
            if(object.toLowerCase().startsWith("m")){
                countM++;
            }
            if(!object.toLowerCase().contains("a") && !object.toLowerCase().contains("e")){
                countAOrE++;
            }
        }
        System.out.println(countM);
        System.out.println(countAOrE);


        System.out.println("\n-----------Task-09------------\n");

        /*
        -Create an ArrayList and store below kitchen objects
        Plate, spoon, fork, Knife, cup, Mixer
        THEN:
        -Print the entire list
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements has P or p
        -Print how many elements starts or ends with P or p
        Expected Result:
        [Plate, spoon, fork, Knife, cup, Mixer]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 3
        Elements having P or p= 3
        Elements starting or ending with P or p = 2
         */

        String[] arr1 = {"Plate", "spoon", "fork", "Knife", "cup", "Mixer"};
        List<String> kitchenObjects = new ArrayList<>(Arrays.asList(arr1));

        int countStartWithUpper = 0;
        int countStartWithLower = 0;
        int hasP = 0;
        int countStartOrEndWithP = 0;

        for(String object : kitchenObjects){
            if(Character.isLetter(object.charAt(0))) {
                if (Character.isUpperCase(object.charAt(0))) countStartWithUpper++;
                else  countStartWithLower++;
            }
            if(object.toLowerCase().contains("p")) hasP++;
            if(object.toLowerCase().startsWith("p") || object.toLowerCase().endsWith("p")) countStartOrEndWithP++;
        }

        System.out.println(kitchenObjects);
        System.out.println("Elements starts with uppercase = " + countStartWithUpper);
        System.out.println("countStartWithLower = " + countStartWithLower);
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending with P or p = " + countStartOrEndWithP);


        System.out.println("\n-----------Task-10------------\n");

        /*
        -Create an ArrayList and store below numbers
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        THEN:
        -Print the entire list
        -Print how many element can be divided by 10
        -Print how many even numbers are greater than 15
        -Print how many odd numbers are less than 20
        -Print how many elements are less than 15 or greater
        than 50
        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that can be divided by 10 = 4
        Elements that are even and greater than 15 = 3
        Elements that are odd and less than 20 = 4
        Elements that are less than 15 or greater than 50 = 8
         */

        List<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));

        int countDividedBy10 = 0;
        int countEvenGreater15 = 0;
        int countOddLess20 = 0;
        int countLess15Greater50 = 0;

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) % 10 == 0) countDividedBy10++;
            if(nums.get(i) % 2 == 0 && nums.get(i) > 15) countEvenGreater15++;
            if(nums.get(i) % 2 == 1 && nums.get(i) < 20) countOddLess20++;
            if(nums.get(i) < 15 || nums.get(i) > 50) countLess15Greater50++;
        }
        System.out.println(nums);
        System.out.println("Elements that can be divided by 10 = " + countDividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + countEvenGreater15);
        System.out.println("Elements that are odd and less than 20 = " + countOddLess20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + countLess15Greater50);
        }
    }

