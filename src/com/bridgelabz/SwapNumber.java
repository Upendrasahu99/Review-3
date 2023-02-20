//Write a program to swap two numbers without using 3rd variable in java.

package com.bridgelabz;

public class SwapNumber {
    public static void main(String[] args) {
        int a= 30;
        int b= 10;
        System.out.println("Before swap value of variable a = " + a + " and b ");
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swap value of variable a = " + a + " and b = " + b);
    }
}
