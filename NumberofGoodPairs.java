package com.company;
import java.util.Scanner;
public class NumberofGoodPairs {

    static int GoodPairs(int[] arr){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            for(int j =1; j<arr.length; j++){
                if ( arr[i] == arr[j] && i<j){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,1,1,3};
        System.out.println(GoodPairs(nums));
    }

}
