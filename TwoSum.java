package com.company;

import java.util.Arrays;

public class TwoSum {

    static int[] twoSum(int[] nums, int target) {

        for(int i =0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){

                int sub = target - nums[i];
                if(nums[j] == sub){
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException("No match found");
    }

    public static void main(String[] args) {

        int[] arr = {2,7,11,15};
        int targ = 9;

        System.out.println(Arrays.toString(twoSum(arr, targ)));

    }
}
