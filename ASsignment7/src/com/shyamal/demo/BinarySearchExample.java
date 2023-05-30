package com.shyamal.demo;
import java.util.*;

 
public class BinarySearchExample {
    public static void main(String[] args) {
        int data[] = {10, 20, 30, 54, 10};

        // Accept user input for the target value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        scanner.close();

        int low = 0;
        int high = data.length - 1;
        int position = -1; // Initialize position to -1

        while (low <= high) {
            int mid = (low + high) / 2;

            if (data[mid] == target) {
                position = mid; // Update position when target value is found
                break;
            } else if (data[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (position != -1) {
            System.out.println("Target value found at position: " + position);
        } else {
            System.out.println("Target value not found in the array.");
        }
    }
}
