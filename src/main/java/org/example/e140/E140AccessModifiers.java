package org.example.e140;

import java.io.PrintStream;

public class E140AccessModifiers {

    String maxLength(String [] sArr){

        String largestWord=" ";

        for (String word : sArr){
        if (word.length()> largestWord.length()){
            largestWord=word;
        }
        }
        return largestWord;
    }

    public static void main(String[] args) {

        E140AccessModifiers obj=new E140AccessModifiers();

        String [] sArr={"this is long", "this is","not","this"};

        obj.maxLength(sArr);
        System.out.println(obj.maxLength(sArr));
    }

}
