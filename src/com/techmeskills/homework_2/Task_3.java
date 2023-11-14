package com.techmeskills.homework_2;

/**
 * The variable N contains thee-digit number
 * Create a program that calculate and display sum of digits
 */
public class Task_3 {
    public static void main(String[] args) {
// Input three-digit number
        int n = 126;
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100;
        int sum = a + b + c;
        System.out.println("Output a = "+a);
        System.out.println("Output b = "+b);
        System.out.println("Output c = "+c);
        System.out.println("Output sum = "+sum);
    }
}
