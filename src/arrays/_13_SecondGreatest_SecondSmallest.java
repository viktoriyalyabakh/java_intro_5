package arrays;

import java.util.Arrays;

public class _13_SecondGreatest_SecondSmallest {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 7, 1, 1, 7};
        findSecondMinAndMax(numbers);
        findSecondMinAndMax1(numbers);
    }
        /*
        create a public static method which will take an int array, find the max, second max and min, second min
        from that array then print them out.

        Hint: Find the max and min FIRST.

        Note: Do it with sort and without sort.

        Example:
           Array -> int[] numbers = {2, 3, 7, 1, 1, 7};

        Output:
            max = 7
            second max = 3
            min = 1
            second min= 2
         */

    public static void findSecondMinAndMax(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            } else if (min > nums[i]) {
                min = nums[i];
            }
        }
            for (int j = 1; j < nums.length; j++){
           if(secondMax < nums[j] && secondMax != max){
                secondMax = nums[j];
            }

            else if(secondMin > nums[j] && secondMin != min)
                secondMin = nums[j];
        }
        System.out.println("max = " + max);
        System.out.println("second max = " + secondMax);
        System.out.println("min = " + min);
        System.out.println("second min = " + secondMin);
    }
    public static void findSecondMinAndMax1(int[] nums){

        Arrays.sort(nums);

        System.out.println("max = " + nums[nums.length-1]);
        System.out.println("second max = " + nums[nums.length-2]);
        System.out.println("min = " + nums[0]);
        System.out.println("second min = " + nums[1]);
    }
}
