package com.basiccoreprogram;

public class PowerOfTwo {
    public static void main(String[] args) {

        int number = Integer.parseInt(args[0]);

        if (0 <= number && number < 31) {
            for (int i = 0; i <= number; i++) {

                System.out.println("2 raised to the power of " + i + " = " +" "+ (int) Math.pow(2, i));
                System.out.println((2*i)*i);
            }
        } else {
            System.out.println("Please enter the number between 0 to 30.");
        }
    }
}