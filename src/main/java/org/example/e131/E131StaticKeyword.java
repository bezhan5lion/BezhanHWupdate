package org.example.e131;


import java.io.PrintStream;

public class E131StaticKeyword {
    String str="";

    public String thirdLetter(String s) {

        for (int i = 0; i < s.length(); i+=3) {
            char ns=s.charAt(i);
            str+=ns;
        }
        return  str;
    }

    String str2="";
    public String thirdLetter2(String s2) {

        for (int i = 0; i < s2.length(); i+=3) {
            char ns=s2.charAt(i);
            str2+=ns;
        }
        return  str2;
    }
    public static void main(String[] args) {

        E131StaticKeyword obj = new E131StaticKeyword();
        obj.thirdLetter("hello there");
        System.out.println(obj.str);
        obj.thirdLetter2("technology");
        System.out.println(obj.str2);

    }
}