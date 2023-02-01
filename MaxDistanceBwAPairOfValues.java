package com.company;

public class MaxDistanceBwAPairOfValues {
    public static void main(String[] args) {

        int[] nums1 = {55,30,5,4,2};
        int[] nums2 = {100,20,10,10,5};
        System.out.println(maxDist(nums1, nums2));
    }

    static int maxDist(int[] nums1, int[] nums2){
        int res = 0;
        int i = 0;
        int j = 0;

        while( i < nums1.length && j < nums2.length ){
            if(nums1[i] > nums2[j]){
                ++i;
            } else{
                res = Math.max(res, j++ - i);
            }
        }

        return res;
    }
}
