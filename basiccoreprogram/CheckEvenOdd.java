package com.basiccoreprogram;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check is EVEN or ODD= ");
        int number = scan.nextInt();

        if (number%2== 0) {
            System.out.println("This is an even number = " + number);
        }else{
            System.out.println("This is an odd number = "+number);
        }
    }

}
