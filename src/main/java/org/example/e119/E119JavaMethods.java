package org.example.e119;

public class E119JavaMethods {

    public static String censerLetter(String str, char symbol){
        str=str.replace(symbol,'*');
        return str;
    }
    public static void main(String[] args) {

        // Students will write the code here.
        E119JavaMethods str=new E119JavaMethods();
        String newStr;
        newStr=str.censerLetter("computer science",'e');
        System.out.println(newStr);
        newStr=censerLetter("trick or treat",'t');
        System.out.println(newStr);
    }

}
