package com.company;

import java.util.Arrays;

public class RunningSum1D {

    static int[] RunSum(int[] arr){
        int [] sum = new int[arr.length];
        sum[0] = arr[0];

        for(int i = 1; i<arr.length; i++){
            sum[i] = sum[i-1] + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(RunSum(arr)));
    }
}
