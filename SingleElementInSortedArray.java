package com.company;

public class SingleElementInSortedArray {
    public static void main(String[] args) {

        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }

    static int singleNonDuplicate(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int mid = start + (end -start)/2;

            if(nums[mid] == nums[mid+1]){
                mid = mid - 1;
            }

            if((mid - start + 1) % 2 != 0){
                end = mid;
            } else{
                start = mid + 1;
            }
        }

        return nums[end];
    }
}
