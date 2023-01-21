package com.basiccoreprogram;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter year you wont to check this is a leap year or not :");
        int year = scan.nextInt();
        if (999 < year && year < 10000) {

            if (year % 4 == 0 && year % 100 == 1 || year % 400 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not Leap Year");
             }

        } else {
            System.out.println("Please enter 4 digit number");
        }

    }
}
