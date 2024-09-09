package org.example.e123;

public class E123Variables {
    // Instance variables
    int myInt;
    String myString;
    double myDouble;
    boolean myBoolean;
    float myFloat;

    public static void main(String[] args) {
        // Creating an object of DefaultValues class
        E123Variables obj = new E123Variables();

        // Printing default values of instance variables
        System.out.println(obj.myInt);      // Default value of int: 0
        System.out.println(obj.myString);   // Default value of String: null
        System.out.println(obj.myDouble);   // Default value of double: 0.0
        System.out.println(obj.myBoolean);  // Default value of boolean: false
        System.out.println(obj.myFloat);    // Default value of float: 0.0
    }
}