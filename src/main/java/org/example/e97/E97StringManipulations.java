package org.example.e97;

import java.util.Scanner;

public class E97StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        // Prompt the user to input a browser name
        System.out.println("Please enter a browser name:");

        // Read the input string
        String intput = sc.nextLine();

        // Use conditional statements to print the message based on the input
        if (intput.equalsIgnoreCase("Chrome")){
            System.out.println("Proceed with Chrome browser");
        } else if (intput.equalsIgnoreCase("firefox")) {
            System.out.println("Proceed with Firefox browser");
        } else if (intput.equalsIgnoreCase("ie")){
            System.out.println("Proceed with IE browser");
        } else {
            System.out.println("Invalid browser");
        }
        // If the input is "Chrome", "chrome", "CHROME", or "ChRoMe", print "Proceed with Chrome browser"
        // If the input is "firefox", "FIREFOX", or "FireFOX", print "Proceed with Firefox browser"
        // If the input is "IE", "ie", or "iE", print "Proceed with IE browser"
        // For any other input, print "Invalid browser"

    }
}
