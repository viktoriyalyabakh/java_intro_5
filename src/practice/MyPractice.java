package practice;

import java.util.*;

public class MyPractice {

    static int[] arr = {12, 14, 38, 34};

    public static void main(String[] args) {

        System.out.println(range(arr));
    }

    public static int range(int[] n) {
        TreeSet<Integer> nums = new TreeSet<>();
        for (Integer num : n) {
            nums.add(num);
        }
        return nums.higher(nums.first());
    }
}





