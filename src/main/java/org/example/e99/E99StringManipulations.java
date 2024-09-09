package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        // Step 3: Prompt the User for Input
        System.out.println("Please enter a string:");
        String input = scanner.nextLine();
        // Step 4: Check if the String is a Palindrome
        String str1 = input.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(str1).reverse().toString();
        boolean isPalindrome = str1.equals(rev);
        // Step 5: Print the Result
        System.out.println(isPalindrome);
        // Print "true" if the string is a palindrome, and "false" otherwise
        // Step 2: Create a Scanner object to read input from the console
    }
}
