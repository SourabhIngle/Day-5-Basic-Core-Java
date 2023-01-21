package com.basiccoreprogram;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter thr first number :");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number :");
        int secondNumber = scan.nextInt();

        // SWAPPING PROCESS
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("First number is = " + firstNumber);
        System.out.println("Second number is = " + secondNumber);
    }
}
