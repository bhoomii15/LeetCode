package com.company;

public class FindHighestAltitude {

    static int maxArr(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int[] HighestAltArr(int [] array){
        int [] alt = new int[array.length +1];
        alt[0] = 0;
        for(int i=1; i<=array.length; i++){
            int sum =0;
            sum = sum+ array[i-1];
            alt[i] = sum;
        }
        return alt;
    }

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};

        int[] altitudes = HighestAltArr(gain);

        System.out.println(maxArr(altitudes));
    }



}
