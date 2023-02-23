package com.company;


//https://leetcode.com/problems/minimum-size-subarray-sum/?envType=study-plan&id=binary-search-ii
public class MinSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int num = 7;

        System.out.println(minSub(nums, num));
    }

    static  int minSub(int[] nums, int target){
        int res = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            while(sum >= target){
                res = Math.min(res, i+1 - left);
                sum -= nums[left];
                left++;
            }
        }

        return (res != Integer.MAX_VALUE) ? res : 0;
    }
}
