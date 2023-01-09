package com.company;


import java.util.Arrays;

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class SpecialArrayWithXElementsGreaterThanEqualX {

    public static void main(String[] args) {

        int[] arr = {3,5};
        int[] nums = {0,4,3,0,4};
        int[] array = {0,0};

        System.out.println(specialArray(arr));
        System.out.println(specialArray(nums));
        System.out.println(specialArray(array));
    }

    static int specialArray(int[] nums){

        //sort the array first so BinarySearch can be applied
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length;


        while(start<=end){
            int mid = start + (end - start)/2;
            int count = 0;
            for(int i=0; i<nums.length; i++){
                if(nums[i] >= mid) count++ ;
            }

            if(count == mid){
                return mid;
            } if(count > mid){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        //if no such number is found return -1
        return -1;
    }
}
