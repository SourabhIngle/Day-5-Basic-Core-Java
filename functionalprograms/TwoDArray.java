package com.functionalprograms;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {

        System.out.println("Making the 2D array  ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  size rows = ");
        int rows = sc.nextInt();
        System.out.print("Enter the  size columns = ");
        int columns = sc.nextInt();

        int[][] two_D_Array = new int[rows][columns];

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                two_D_Array[a][b] = sc.nextInt();

            }
        }

        for (int a = 0; a < rows; a++) {
            for (int b = 0; b < columns; b++) {
                System.out.println(two_D_Array[a][b] + " ");
            }
            System.out.println();
        }

        System.out.println("Print in 2 Dimension Array :");
        for (int[] r : two_D_Array) {
            for (int c : r) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}