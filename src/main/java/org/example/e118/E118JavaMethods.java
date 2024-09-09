package org.example.e118;

public class E118JavaMethods {

    public static String spaceOut(String s){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i)).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // Students will write the code here.
        System.out.println(spaceOut("hello"));
        System.out.println(spaceOut("technology"));

    }
}

