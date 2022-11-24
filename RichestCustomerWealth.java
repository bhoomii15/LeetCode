package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class RichestCustomerWealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] arr = new int [n][];
        for(int row =0; row<n; row ++){
            for (int col = 0; col <m; col ++){
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
