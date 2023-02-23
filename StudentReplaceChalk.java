package com.company;

//https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/?envType=study-plan&id=binary-search-ii
public class StudentReplaceChalk {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2};
        int k = 25;
        System.out.println(chalkReplacer(arr, k));
    }

    static int chalkReplacer(int[] chalk, int k){
        long sum = 0;
        for(int chalks : chalk){
            sum += chalks;
        }

        long l = k % sum;

        for(int i = 0; i < chalk.length; i++){
            if( l >= chalk[i]){
                l -= chalk[i];
            } else {
                return i;
            }
        }

        return -1;

    }
}
