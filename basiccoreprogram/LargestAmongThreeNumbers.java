package com.basiccoreprogram;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers :");

        System.out.println("Enter first number");
        int numberFirst = sc.nextInt();

        System.out.println("Enter second number");
        int numberSecond = sc.nextInt();

        System.out.println("Enter third number");
        int numberThird = sc.nextInt();

        if (numberFirst == numberSecond || numberSecond == numberThird || numberThird == numberFirst ) {
            System.out.println("Please enter the different numbers");
        } else {
            if (numberThird > numberSecond && numberThird > numberFirst) {
                System.out.println("Largest number is " + numberThird);
            } else if (numberSecond > numberThird && numberSecond > numberFirst) {
                System.out.println("Largest number is " + numberSecond);
            } else {
                System.out.println("Largest number is " + numberFirst);
            }

        }
    }

}
