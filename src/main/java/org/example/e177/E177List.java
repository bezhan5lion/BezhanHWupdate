package org.example.e177;

import java.util.ArrayList;
import java.util.Scanner;

public class E177List {
    public static void main(String[] args){
        ArrayList<String> chatMessages = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            String message = sc.nextLine();
            chatMessages.add(message);
        }
        chatMessages.remove(4);
        chatMessages.remove(2);
        chatMessages.remove(0);

        System.out.println("Remaining messages:");

        for (String message : chatMessages) {
            System.out.print(message+" ");
        }
    }

}
