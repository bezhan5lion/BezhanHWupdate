package org.example.e101;

import java.util.Scanner;

public class E101StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("In: ");

        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i+=2) {

            char l = input.charAt(i);
            System.out.print(l);
        }
        System.out.println();
    }
}
