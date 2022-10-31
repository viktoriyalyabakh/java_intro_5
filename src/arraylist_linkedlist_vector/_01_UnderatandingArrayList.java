package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderatandingArrayList {
    public static void main(String[] args) {

        //1.Declaring an array vs an ArrayList
        String[] names1 = new String[3];
        ArrayList<String> names2 = new ArrayList<>();

        //2. Getting a size of array and arraylist
        System.out.println("The size of array = " + names1.length);
        System.out.println("The size of arraylist = " + names2.size());

        //3. Printing the array and ArrayList
        System.out.println("The array = " + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        //4. Adding elements to specific indexes
        names1[0] = "Alex";

        names2.add(0, "John");

        System.out.println("The array = " + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        //TASK 1
        names1[1] = "Ali";
        names1[2] = "Andrii";

        names2.add("Joe");
        names2.add("Jane");

        System.out.println("The array = " + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);

        //TASK 2

        names2.add("Abdallah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");

        System.out.println(names2);

        //5.Updating an existing element in Array anf ArrayList
        names1[1] = "Mike";
        names2.set(1, "Olena");//change value

        System.out.println("The array = " + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);



    }
}
