package com.company;
import java.util.Scanner;

public class NumberofGoodPairs {

    static boolean isPrime(double n){
        int c = 2;
        int m = (int) Math.sqrt(n);
        boolean temp = true;
        while(c<n){
            if(m%c == 0){
                temp = false;
            }
            c++;
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(isPrime(a));
    }
}
