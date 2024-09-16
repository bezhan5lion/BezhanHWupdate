package org.example.e179;

import java.util.LinkedList;

public class E179List {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        int num = 50;
        for (int i = 0; i < 50; i++) {
            num++;
            if (num % 3 ==0) {
                numbers.add(num);
            }
        }
        System.out.println(numbers);
    }
}