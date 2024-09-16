package org.example.e182;


import java.util.LinkedList;

public class E182List {
    public static void main(String[] args) {
        // Step 1: Initialize a LinkedList to store prime numbers
        LinkedList<Integer> primeNumbers = new LinkedList<>();

        // Step 3: Loop through numbers from 1 to 100 and check if they are prime
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i); // If prime, add to LinkedList
            }
        }

        // Step 4: Print the final LinkedList of prime numbers
        System.out.println(primeNumbers);
    }

    // Step 2: Method to check if a number is prime
    public static boolean isPrime(int num) {
        // A prime number is greater than 1
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // If divisible, it's not prime
                return false;
            }
        }

        return true; // If no divisors are found, the number is prime
    }
}
