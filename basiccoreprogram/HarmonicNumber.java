package com.basiccoreprogram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int number = scan.nextInt();
        float harmonicNumberIs = 0;

        if (number > 0) {
            for (float i = 1; i <= number; i++) {
                harmonicNumberIs = 1 / i + harmonicNumberIs;
            }
            System.out.print("Harmonica Number is " + harmonicNumberIs);
        } else {
            System.out.println("You entered 0 number kindly enter other number.");
        }
    }
}
