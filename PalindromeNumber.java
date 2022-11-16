package com.company;
import java.util.Scanner;

public class PalindromeNumber {
    static boolean isPalindrome(int x) {

        if (x == 0) {
            return true;
        }

        if (x < 0 || x % 10 == 0) {
            return false;
        }

        int reversed_int = 0;
        while (x > reversed_int) {

            int pop;
            pop = x % 10;
            x /= 10;

            reversed_int = (reversed_int * 10) + pop;
        }

        if (x == reversed_int) {
            return true;
        }

        // to account for odd numbers

        else if (x == reversed_int / 10) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println(isPalindrome(a));
    }
}
