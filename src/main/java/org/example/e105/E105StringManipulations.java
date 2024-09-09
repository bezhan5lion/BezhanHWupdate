package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("In:");

        String input = sc.nextLine();//string user enters


        for (int i = 0; i < input.length(); i++) {
            char v = input.charAt(i);
            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'A' || v == 'E' || v == 'O' || v == 'I' || v == 'U') {
                System.out.print(v);
            }
        }
        System.out.println();
    }
}

