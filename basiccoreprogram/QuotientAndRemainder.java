package com.basiccoreprogram;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number for which you want to Remainder and Quotient (Enter Dividend)= ");
        int dividend = scan.nextInt();
        System.out.print("Enter Divisor");
        int divisor = scan.nextInt();
        int remainder = dividend%divisor;
        System.out.println("Remainder is "+remainder);
        int  quotient = dividend/divisor;
        System.out.println("Quotient is " + quotient);
    }
}
