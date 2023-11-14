package com.techmeskills.homework_2;

/**
 * The variable N contains two-digit number
 *  * Create a program that calculate and display sum of digits
 */
public class Task_2 {
    public static void main(String[] args) {
        // Input three-digit number
        int n = 26;
        int a = n % 10;
        int b = n / 10 ;
        int sum = a + b ;
        System.out.println("Output a = "+a);
        System.out.println("Output b = "+b);
        System.out.println("Output sum = "+sum);

    }
}
