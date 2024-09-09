package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("In:");

        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {

            System.out.println(input.charAt(i));
        }

    }
}
