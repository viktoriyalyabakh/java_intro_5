package homeworks;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n----------Task_1----------\n");

        /*
        -Create an int array having size of 10
        -Assign 23 to index of 2
        -Assign 12 to index of 4
        -Assign 34 to index of 7
        -Assign 7 to index of 9
        -Assign 15 to index of 6
        -Assign 89 to index of 0
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 9
        -Print the entire array
        Expected Result:
        0
        89
        7
        [89, 0, 23, 0, 12, 0, 15, 34, 0, 7]
         */

        int[] numbers = new int[10];
        numbers[2] = 23;
        numbers[4] = 25;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;

        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));




        System.out.println("\n----------Task_2----------\n");

        /*
        -Create a String array having size of 5
        -Assign “abc” to index of 1
        -Assign “xyz” to index of 4
        THEN:
        -Print element at index of 3
        -Print element at index of 0
        -Print element at index of 4
        -Print the entire array
        Expected Result:
        null
        null
        xyz
        [null, abc, null, null, xyz]
         */

        String[] arr = new String[5];
        arr[1] = "abc";
        arr[4] = "xyz";

        System.out.println(arr[3]);
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(Arrays.toString(arr));




        System.out.println("\n----------Task_3---------\n");

        /*
        -Create an int array that stores numbers below
        23, -34, -56, 0, 89, 100
        THEN:
        -Print the entire array
        -Print the entire array sorted in ascending order
        Expected Result:]
        [23, -34, -56, 0, 89, 100]
        [-56, -34, 0, 23, 89, 100
         */

        int[] nums ={23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));




        System.out.println("\n----------Task_4---------\n");

        /*
        -Create a String array that stores countries below
        Germany, Argentina, Ukraine, Romania
        THEN:
        -Print the entire array
        -Print the entire array sorted lexicographically
        Expected Result:
        [Germany, Argentina, Ukraine, Romania]
        [Argentina, Germany, Romania, Ukraine
         */

        String[] countries ={"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));

        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));




        System.out.println("\n----------Task_5---------\n");

        /*
        -Create a String array that stores cartoon dogs below
        Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky
        THEN:
        -Print the entire array
        -Then, check if it contains Pluto
        if it contains Pluto, then print true
        if it does not contain Pluto, print false
        Expected Result:
        [Scooby Doo, Snoopy, Blue, Pluto, Dino, Sparky]
        true
         */

        String[] cartoonDogs ={"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(cartoonDogs));

        boolean hasPluto = false;
        for(String element : cartoonDogs){
           if(element.equals("Pluto")) {
               hasPluto = true;
               break;
           }
        }
        System.out.println(hasPluto);




        System.out.println("\n----------Task_6---------\n");

        /*
        -Create a String array that stores cartoon cats below
        Garfield, Tom, Sylvester, Azrael
        THEN:
        -Print the entire array sorted lexicographically
        -Then, check if it contains Garfield and Felix
        if it contains both, then print true
        if it does not contain both, print false
        Expected Result:
        [Azrael, Garfield, Sylvester, Tom]
        false
         */

        String[] cartoonCats ={"Garfield", "Tom", "Sylvester", "Azrael", "Felix"};

        Arrays.sort(cartoonCats);
        System.out.println(Arrays.toString(cartoonCats));
        System.out.println(Arrays.binarySearch(cartoonCats,"Garfield") >= 0 &&
                Arrays.binarySearch(cartoonCats,"Felix") >= 0);




        System.out.println("\n----------Task_7---------\n");

        /*
        -Create a double array that stores numbers below
        10.5, 20.75, 70, 80, 15.75
        THEN:
        -Print the entire array
        -Print each element
        Expected Result:
        [10.5, 20.75, 70.0, 80.0, 15.75]
        10.5
        20.75
        70
        80
        15.75
         */

        double[] numbers1 = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(numbers1));

        for(double element : numbers1){
            if(element % (int)element == 0) System.out.println((int)element);
            else System.out.println(element);
        }




        System.out.println("\n----------Task_8---------\n");

        /*
        -Create a char array that stores characters below
        A, b, G, H, 7, 5, &, *, e, @, 4
        THEN:
        -Print the entire array
        -Print the total count of the letters
        -Print the total count of lowercase letters
        -Print the total count of uppercase letters
        -Print the total count of digits
        -Print the total count of special characters
        Expected Result:
        [A, b, G, H, 7, 5, &, *, e, @, 4]
        Letters = 5
        Uppercase letters = 3
        Lowercase letters = 2
        Digits = 3
        Special characters = 3
         */

        char[] characters ={'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(characters));

        int countLetters = 0;
        int countLowercase = 0;
        int countUppercase = 0;
        int countDigits = 0;
        int countSpecialCharacters = 0;

        for(char element : characters){
            if(Character.isLetter(element)){
                countLetters++;
                if(Character.isLowerCase(element)) countLowercase++;
                else countUppercase++;
            }
            else if(Character.isDigit(element)) countDigits++;
            else if(!Character.isWhitespace(element)) countSpecialCharacters++;
        }
        System.out.println("Letters = " + countLetters);
        System.out.println("Uppercase letters = " + countUppercase);
        System.out.println("Lowercase letters = " + countLowercase);
        System.out.println("Digits = " + countDigits);
        System.out.println("Special characters = " + countSpecialCharacters);




        System.out.println("\n----------Task_9---------\n");

        /*
        -Create a String array that stores objects below
        Pen, notebook, Book, paper, bag, pencil, Ruler
        THEN:
        -Print the entire array
        -Print how many elements starts with uppercase
        -Print how many elements starts with lowercase
        -Print how many elements starts with B or P, ignoring cases
        -Print how many elements has “book” or “pen” in it, ignoring
        cases
        Expected Result:
        [Pen, notebook, Book, paper, bag, pencil, Ruler]
        Elements starts with uppercase = 3
        Elements starts with lowercase = 4
        Elements starting with B or P = 5
        Elements having ”book” or “pen”= 4
         */

        String[] objects ={"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(objects));

        int countUpper = 0;
        int countLower = 0;
        int countBorP = 0;
        int havingBookOrPen = 0;
        for (String element : objects) {
            if(Character.isUpperCase(element.charAt(0))){
                countUpper++;
            }
            else{
                countLower++;
            }
            if(element.toLowerCase().startsWith("b") || element.toLowerCase().startsWith("p")) countBorP++;
            if(element.toLowerCase().contains("book") || element.toLowerCase().contains("pen")) havingBookOrPen++;
        }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements starting with B or P = " + countBorP);
        System.out.println("Elements having ”book” or “pen” = " + havingBookOrPen);





        System.out.println("\n----------Task_10---------\n");

        /*
        Create an int array that stores numbers below
        3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
        THEN:
        -Print the entire array
        -Print how many elements are more than 10
        -Print how many elements are less than 10
        -Print how many elements are 10
        Expected Result:
        [3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78]
        Elements that are more than 10 = 5
        Elements that are less than 10 = 4
        Elements that are 10 = 2
         */

        int[] numbers2 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        System.out.println(Arrays.toString(numbers2));

        int countMoreThan10 = 0;
        int countLessThan10 = 0;
        int count10 = 0;

        for(int element : numbers2){
            if(element > 10) countMoreThan10++;
            else if(element < 10) countLessThan10++;
            else count10++;
        }
        System.out.println("Elements that are more than 10 = " + countMoreThan10);
        System.out.println("Elements that are less than 10 = " + countLessThan10);
        System.out.println("Elements that are 10 = " + count10);





        System.out.println("\n----------Task_11---------\n");

        /*
        -Create 2 int arrays that stores numbers below
        First -> 5, 8, 13, 1, 2
        Second -> 9, 3, 67, 1, 0
        THEN:
        -Print both arrays
        –Then, create a new array called that will take
        greatest of same index from first 2 arrays
        -Print third array as well
        Expected Result:
        1st array is =  [5, 8, 13, 1, 2]
        2nd array is = [9, 3, 67, 1, 0]
        3rd array is =  [9, 8, 67, 1, 2]
         */

        int[] arr1 = {5, 8, 13, 1, 2};
        int[] arr2 = {9, 3, 67, 1, 0};

        System.out.println("1st array is =  " + Arrays.toString(arr1));
        System.out.println("2nd array is =  " + Arrays.toString(arr2));

        int[] newArr = new int[arr1.length];

        for(int i = 0; i < newArr.length; i++){
           newArr[i] = Math.max(arr1[i], arr2[i]);
                }
        System.out.println("3rd array is =  " + Arrays.toString(newArr));
            }
        }


