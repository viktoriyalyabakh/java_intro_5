package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _04_addAll_removeAll_Methods {
    public static void main(String[] args) {

        ArrayList<String> group1Students = new ArrayList<>();
        group1Students.add("Alex");
        group1Students.add("Mike");

        ArrayList<String> group2Students = new ArrayList<>();
        group1Students.add("John");
        group1Students.add("Jane");
        group1Students.add("James");

        ArrayList<String> group3Students = new ArrayList<>();
        group1Students.add("Leo");
        group1Students.add("Lucy");
        group1Students.add("Lucio");


        ArrayList<String> allStudents = new ArrayList<>();
        allStudents.addAll(group1Students);
        allStudents.addAll(0,group2Students);// put this group at the beginning
        allStudents.addAll(group3Students);


        allStudents.removeAll(group1Students);
        System.out.println(allStudents);
    }
}
