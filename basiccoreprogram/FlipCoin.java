package com.basiccoreprogram;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter how many times you want to flip a coin.");
        int numberOfFlipCoin = scan.nextInt();
        int countTails = 0;
        int countHeads = 0;

        for (int i = 0; i < numberOfFlipCoin; i++) {
            float random = (float) Math.random();
            if (random < 0.5) {
                countTails++;
            } else {
                countHeads++;
            }
        }

        System.out.println("Number of time tails is "+ countTails);
        System.out.println("Number of time heads is "+ countHeads);

        int tailsPercentage = countTails * 100 / numberOfFlipCoin;
        System.out.println("Percentage of tails is = " + tailsPercentage + "%");

        int headsPercentage = 100 - tailsPercentage;
        System.out.print("Percentage of heads is = " + headsPercentage + "%");


    }
}
