//Count of smaller elements

package com.bridgelabz;

public class CountElement {
    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 8, 3, 6, 3, 8, 3, 6, 4, 7, 4, 9, 6, 3, 5, 4};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == smallest) {
                count++;
            }
        }
        System.out.println("Smaller element come " + count + " time");
    }
}
