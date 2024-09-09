package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("In:");

        String [] names = new String[5];

        for (int i = 0; i <names.length; i++) {
            names[i]= sc.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].substring(0,3));
        }
    }
}


