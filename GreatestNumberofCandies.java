package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestNumberofCandies {

    static List<Boolean> MaxCandies(int[] arr, int n){
        int max = 0;
        for(int candies : arr){
            max = Math.max(max, candies);
        }

        List <Boolean> ans = new ArrayList<>();
        for(int candies : arr){
            ans.add(candies + n >=max);
        }

        return ans;
    }

    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(MaxCandies(candies, extraCandies));
    }

}
