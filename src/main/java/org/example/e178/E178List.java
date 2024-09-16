package org.example.e178;

import java.util.ArrayList;
import java.util.Scanner;

public class E178List {
    public static void main(String[] args) {
        ArrayList<String>groceryItems=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter 5 grocery items:");
        for (int i = 0; i < 5; i++) {
            String items=scanner.nextLine();
            groceryItems.add(items);

            if (!groceryItems.contains(items)) {
                groceryItems.add(items);
            }
        }
        System.out.println("\nUnique grocery items:");
        for (String items : groceryItems) {
            System.out.print(items + " ");
        }
}
}

