package org.example.e106;

import java.util.Locale;

public class E106StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Hello");

        sb.append(" World");
        String sb2=sb.toString();
        System.out.println(sb2.toUpperCase());

    }
}
