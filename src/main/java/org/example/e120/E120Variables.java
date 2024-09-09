package org.example.e120;

public class E120Variables {
    // Declare 3 instance variables: year, school name, and batch number
        int year;
        String schoolName;
        int batchNumber;

    public static void main(String[] args) {
        // Access variables from the main method and assign specific values to them
        E120Variables s1=new E120Variables();
        s1.year = 2020;
        s1.schoolName = "syntax";
        s1.batchNumber = 6;
        // Print values of your variables in the specified format
        System.out.println("I am a student of batch "+s1.batchNumber+" studying at "+s1.schoolName+" in the year of "+s1.year);
    }
}
