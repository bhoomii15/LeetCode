package com.company;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(binarySearch(piles, h));
    }

    static int binarySearch(int[] piles, int h){
        long start = 1; //min number of bananas she can eat
        long end = Arrays.stream(piles).max().getAsInt(); // to get max element in array

        //binary search
        while (start <= end){
            int mid = (int)(start + (end - start)/2);

            if(canEat(piles,h,mid)){
                end = mid - 1; //to find min value of k, decrease the end pointer
            } else{
                start = mid + 1; //if ans not found increase the right pointer
            }
        }
        return (int)start;
    }

    static boolean canEat(int[] piles, int h, int k){
        long hrs = 0;
        for(long pile : piles){
            int div = (int)pile/k;
            hrs += div;
            if(pile % k != 0){
                ++hrs;
            }
        }
        return hrs <= h;
    }
}
