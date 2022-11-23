package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class SuffleTheArray {
    static int[] ShuffleArr(int n, int[] arr){
        int[] nums = new int [2*n];
        int j = 0;
        for(int i =0; i<2*n; i+=2){
            nums[i] = arr[j];
            nums[i+1] = arr[j + n];
            j++;
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] array = new int[2*a];
        for(int i=0; i<2*a; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(ShuffleArr(a, array)));
    }
}
