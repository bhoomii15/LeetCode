package com.company;

import java.util.Arrays;

public class NumbersSmallerThanTheCurrentNum {

    static int[] SmallerNums(int[]arr){
        int [] count = new int[arr.length];

        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++) {
                if (i != j && arr[i] > arr[j]) {
                    count[i]++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int [] nums = {8,1,2,2,3};

        System.out.println(Arrays.toString(SmallerNums(nums)));
    }
}
