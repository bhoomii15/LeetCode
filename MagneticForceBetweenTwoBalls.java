package com.company;

import java.util.Arrays;

//https://leetcode.com/problems/magnetic-force-between-two-balls/?envType=study-plan&id=binary-search-ii
public class MagneticForceBetweenTwoBalls {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,7};
        int m = 3;

        System.out.println(maxDistance(arr, m));
    }

    static int maxDistance(int[] position, int m){
        Arrays.sort(position);

        int ans = 1; //at least the dist of 1 will be there;

        int start = 1;
        int end = position[position.length - 1] - position[0];

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isPossible(position, m, mid)){
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }


    static boolean isPossible(int[] position, int m, int dist){
        int ballsPlaced = 1;
        int currPosition = position[0];

        for(int i =0; i< position.length && ballsPlaced < m; i++){
            if(position[i] >= currPosition + dist){
                ballsPlaced++;
                currPosition = position[i];
            }
        }

        if(ballsPlaced < m) return false;
        else return true;
    }
}
