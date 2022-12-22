package com.company;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        System.out.println(splitArray(nums, k));
    }

    static int splitArray(int[] nums, int k){

        int start = 0;
        int end = 0;

        //simple linear search
        for (int i = 0; i<nums.length; i++){
            //start = minAns = max value in arr
            start = Math.max(start, nums[i]);
            //end = maxAns = sum of arr
            end += nums[i];
        }

        //binary search
        while(start < end){

            //trying for mid as potential ans
            int mid = start + (end - start)/2;

            //calculating how many peices you can divide the arr in wiht mid as max sum
            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > mid){
                    //you cannot add it in this subarr, make new
                    //say you add it into new, the sum  = num
                    //peices ++
                    sum = num;
                    pieces++ ;
                } else {
                    sum += num;
                }
            }

            if(pieces > k){
                start = mid + 1;
            } else{
                end = mid;
            }
        }

        return end;
    }
}
