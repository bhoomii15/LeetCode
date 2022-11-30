package com.company;

import java.util.Arrays;

public class CreateTargetArrayintheGivenOrder {

    static int[] TargetArr(int[] arr, int[] index){

        int[] target = new int[index.length];
        for(int i =0; i<arr.length; i++){
            int ind = index[i];
            int value = arr[i];

            for(int j = target.length -1; j>ind; j--){
                target[j] = target[j-1];
            }
            target[ind] = value;
        }

        return target;
    }

    public static void main(String[] args) {

        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(TargetArr(nums, index)));


    }
}
