package org.example.e94;

public class E94StringManipulations {
    public static void main(String[] args) {
        // Create a String variable named 'given' and assign the value "I love Java classes at Syntax" to it
        String given = "I love Java classes at Syntax";

        String sub1 = given.substring(12);
        System.out.println(sub1);
        // Use the substring() method to retrieve the substring "classes at Syntax" and print it
        String sub2 = given.substring(0,11);
        System.out.println(sub2);
        // Use the substring() method to retrieve the substring "I love Java" and print it
    }
}
