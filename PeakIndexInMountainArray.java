package com.company;

public class PeakIndexInMountainArray {

    public static void main(String[] args) {

        int[] nums = {0,2,1,0};
        System.out.println(peakIndexInMountainArray(nums));

    }

    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                // this is decreasing part of the arr
                end = mid;
            } else{
                // this is increasing part of the arr
                start = mid +1;
            }
        }
        return end;
    }
}
