package org.example;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", you've been drafted for military service";

        // Create Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt for and read the user's name
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt for and read the user's age
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Check if age is within the specified range
        if (age >= 18 && age <= 28)
            // Display the message
            System.out.println(name + militaryCommissar);

        // Close the scanner
        scanner.close();
    }
}