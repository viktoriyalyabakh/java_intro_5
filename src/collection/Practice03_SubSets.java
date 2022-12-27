package collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice03_SubSets {
    public static void main(String[] args) {

        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(3, 2, 7, 10, 15, 20, 7, 5));
        Integer[] number = {3, 2, 7, 10, 15, 20, 7, 5};

        System.out.println(nums.tailSet(7, false));
        System.out.println(nums.headSet(5,true));
        System.out.println(nums.subSet(5,true, 15, true));
        System.out.println(Arrays.toString(lessThenN(number, 7)));

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(7);
        numbers.add(10);
        System.out.println(numbers.first());
        System.out.println(numbers);

        System.out.println(numbers.pollFirst());
        System.out.println(numbers);

        numbers.clear();

        System.out.println(numbers.last());//NoSuchElementException
        System.out.println(numbers.first());//NoSuchElementException

        System.out.println(numbers.pollFirst());//null
        System.out.println(numbers.pollLast());//null

    }
    public static Integer[] lessThenN(Integer[] arr, int n){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        return set.headSet(n, true).toArray(new Integer[0]);
    }
}
