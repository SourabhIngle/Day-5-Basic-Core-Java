package com.functionalprograms;

import java.util.Scanner;

public class SumOfThreeZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size = ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter "+ i + " element");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {

                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " = 0");
                    }

                }
            }
        }

    }
}
