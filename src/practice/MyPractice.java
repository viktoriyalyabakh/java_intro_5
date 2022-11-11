package practice;

import java.util.Scanner;

public class MyPractice {

    static int[] arr ={12, 14, 38, 34};
    public static void main(String[] args) {

        System.out.println(SumOfArr(arr.length-1));
        }
        public static int SumOfArr(int n){

        if(n == 0) return arr[n];
        return arr[n] + SumOfArr(n-1);
        }

    }





