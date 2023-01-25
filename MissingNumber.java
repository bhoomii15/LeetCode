package com.company;

public class MissingNumber {
    public static void main(String[] args) {

    }

    static int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            //check if element is at correct positon or not
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        //find the missing number
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != index){
                return index;
            }
        }

        return nums.length;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
