package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("In:");

        String input= sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            if (i < input.length()-1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
