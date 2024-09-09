package org.example.e95;

import java.util.Scanner;

public class E95StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        // Prompt the user to input a string value
        System.out.print("Please enter a word: ");
        String input = sc.nextLine();
        // Read the input string
        System.out.println("The first 3 letters of " + input + " is " + input.substring(0, 3));
        // Extract the first 3 letters using the substring() method
        // Print the result in the specified format
    }
}
