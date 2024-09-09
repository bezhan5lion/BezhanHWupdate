package org.example.e128;

public class E128StaticKeyword {

    public static String mixString(String a, String b) {

        String str1;
        String str2;
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            char s1 = a.charAt(i);
            char b1 = b.charAt(i);
            str1 = String.valueOf(s1).toString();
            str2 = String.valueOf(b1).toString();
            result = str1.concat(str2);
            System.out.print(result);
        }
        return result;
    }

    public static void main(String[] args) {
        E128StaticKeyword obj = new E128StaticKeyword();
        obj.mixString("12345", "abcde");
        System.out.println();


    }
}