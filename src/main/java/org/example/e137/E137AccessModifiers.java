package org.example.e137;

import java.security.PublicKey;

public class E137AccessModifiers {

   private String nmae;
   public String city;
   String nameOfTheSchool;
   protected int batchNumber;

   void printInfo(String name, String city, String nameOfTheSchool, int batchNumber){
       System.out.println("My name is "+name+" and I live in "+city+". I study at "+nameOfTheSchool+" in batch "+batchNumber);
   };
    public static void main(String[] args) {

        E137AccessModifiers obj=new E137AccessModifiers();

        obj.printInfo("John","Miami","Syntax",9);

    }
}

