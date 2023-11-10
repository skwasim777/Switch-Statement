package com.example;

import java.util.Scanner;

public class PrintEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = scanner.nextInt();
        switch (n % 2) {
            case 0: {
                System.out.println("Even number");
                break;
            }
            default:
                System.out.println("Odd number");
        }
    }
}
