package com.company;

//https://leetcode.com/problems/binary-search/description/
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(arr, target));

    }
    static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end -start)/2;
            if(target == nums[mid]){
                return mid;
            } if(target > nums[mid]){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return -1;
    }
}
