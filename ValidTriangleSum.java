package com.company;
import java.util.Arrays;

//https://leetcode.com/problems/valid-triangle-number/?envType=study-plan&id=binary-search-ii
public class ValidTriangleSum {
    public static void main(String[] args) {

        int[] arr = {2,2,3,4};
        System.out.println(validSum(arr));
    }

    static int validSum(int[] nums){
        int n = nums.length;
        int count = 0;
        Arrays.sort(nums);

        for(int i = n-1; i >= 2; i--){
            int j = 0;
            int k = i - 1;

            while (j < k){
                if(nums[j] + nums[k] > nums[i]){
                    count += k - j;
                    k--;
                } else{
                    j++;
                }
            }
        }

        return count;
    }

}
