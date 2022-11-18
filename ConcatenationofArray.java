package com.company;


import java.util.Arrays;

public class ConcatenationofArray {

    static int[] ConcatArr(int[] arr){
        int n = arr.length;
        int[] ans = new int[2*n];

        for(int i =0; i<n; i++){
            ans[i] = arr[i];
            ans[i + n] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        System.out.println(Arrays.toString(ConcatArr(nums)));
    }

}
