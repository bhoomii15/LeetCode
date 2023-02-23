package com.company;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/find-k-closest-elements/?envType=study-plan&id=binary-search-ii
public class FindKClosestElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        int y = -1;
        System.out.println(findClosestElements(arr,k,x));
        System.out.println(findClosestElements(arr, k, y));
    }

    static List<Integer> findClosestElements(int[] arr, int k, int x){

        int start = 0;
        int end = arr.length - k;

        while(start < end){
            int mid = start + (end - start)/2;
            if( x - arr[mid]  > arr[mid + k] - x){
                start = mid + 1;
            } else{
                end = mid;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = start; i < start + k; i++){
            res.add(arr[i]);
        }

        return res;
    }
}
