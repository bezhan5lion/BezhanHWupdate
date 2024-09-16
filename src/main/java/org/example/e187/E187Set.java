package org.example.e187;

import java.util.HashSet;

public class E187Set {

    public static void main(String[] args) {

        HashSet<String>colors=new HashSet<>();

        colors.add("Red");
        colors.add("Pink");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");

        System.out.println("Original Hash Set: "+colors);
        int setSize=colors.size();
        System.out.println("Size of the Hash Set: "+setSize);
    }

}
