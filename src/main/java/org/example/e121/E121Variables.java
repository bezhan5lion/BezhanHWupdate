package org.example.e121;

public class E121Variables {
    // Declare 3 instance variables: integer, double, and char
    int intValue;
    double doubleValue;
    char charValue;

    public static void main(String[] args) {

        E121Variables s1=new E121Variables();

        s1.intValue = 10;
        s1.doubleValue = 10.23;
        s1.charValue = 'a';


        E121Variables s2=new E121Variables();

        s2.intValue = 100;
        s2.doubleValue = 100.23;
        s2.charValue = 'b';

        System.out.println(s1.intValue);
        System.out.println(s1.doubleValue);
        System.out.println(s1.charValue);

//
        System.out.println(s2.intValue);
        System.out.println(s2.doubleValue);
        System.out.println(s2.charValue);
//
        // Create 2 instances of the class
        // Assign values to variables for the first instance
        // Print values of the first instance
        // Assign values to variables for the second instance
        // Print values of the second instance
    }
}
