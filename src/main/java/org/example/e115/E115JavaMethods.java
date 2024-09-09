package org.example.e115;

import java.util.Locale;

public class E115JavaMethods {
    public static void main(String[] args) {
        // Call the convertToUpper method and print the result
        System.out.println(convertToUpper("test"));
    }

    // Create method convertToUpper with a string parameter
    public static String convertToUpper(String word){
        String newUppercase=word.toUpperCase();
        return newUppercase;
    }
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}
