package arrays;

public class _12_partialArray_Practices {

    public static void main(String[] args) {

        /*
        create a public static method which will take an int array then it will get the
        sum of first 3 elements and return it. Note: Given array should be at least 3 elements

        Example:

        Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        Return:
        0

        Example2:

        Array -> int[] numbers = {10, -3, 7, 1, 22};

        Return2:
        14

        */
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        System.out.println(sumLastFiveElements(numbers));


    }

        public static int sumFirstThreeElements(int[] nums){

            int sum = 0;

            for(int i = 0; i <= 3; i++){
                sum += nums[i];
            }
            return sum;

        }

        /*
        create a public static method which will take an int array then it will get the
        sum of last 5 elements and return it.

        Note: Given array should be at least 5 elements
        Note2: Use LOOPS

        Example:
        Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

        Return:
        22

        Example2:
        Array -> int[] numbers = {10, -3, 7, 1, 22};

        Return2:
        38
        */

    public static int sumLastFiveElements(int[] nums){

        int sum = 0;

        for(int i = nums.length-1; i >= nums.length - 5; i--){
            sum += nums[i];
        }
        return sum;

}

}