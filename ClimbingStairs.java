package com.company;


//https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public static void main(String[] args) {

        int n = 2;
        System.out.println(climbStairs(n));
    }

    static int climbStairs(int n){   //we'll use dynamic programming here


        int[] dp = new int[n+1];  //n+1 to cover all the base cases

        dp[0] = 1; //the way to climb zero stairs is 1
        dp[1] = 1; //the way to climb one stair is 1

        for(int i =2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
