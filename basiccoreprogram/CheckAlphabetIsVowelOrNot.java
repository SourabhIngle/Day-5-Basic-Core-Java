package com.basiccoreprogram;

import java.util.Scanner;

public class CheckAlphabetIsVowelOrNot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet :");
        char alphabet = sc.next().toLowerCase().charAt(0);

        char lowerCaseAlphabet = alphabet;
        switch (lowerCaseAlphabet) {
            case 'a':
                System.out.println("This is an Vowel");
                break;
            case 'e':
                System.out.println("This is an Vowel");
                break;
            case 'i':
                System.out.println("This is an Vowel");
                break;
            case 'o':
                System.out.println("This is an Vowel");
                break;
            case 'u':
                System.out.println("This is an Vowel");
                break;
            default:
                System.out.println("This is a Consonant");
        }

    }
}
