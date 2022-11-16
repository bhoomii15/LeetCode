package com.company;


import java.util.Arrays;

//Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
public class BuildArrayPermutation {

    static void BuildArr(int[] arr){
        int [] ans = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            ans[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        BuildArr(nums);

    }
}
