// Nth even fibonacci Number.

package com.bridgelabz;

import java.util.Scanner;

public class NFibonacciNUmber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = 0;
        int a2 = 1;
        int i = 1;
        int count = 0;
        System.out.println("Enter the number you want to know Fibonacci number");
        int n = scanner.nextInt();
        while (i > 0) {
            if (a1 % 2 == 0) {
                count++;
                if (count == n) {
                    System.out.println(n + "th even Fibonacci number is " + a1);
                    break;
                }
            }
            int a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            i++;
        }
    }
}
