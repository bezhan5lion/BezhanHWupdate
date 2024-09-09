package org.example.e138;

class AnotherClass{
       private static String privateMethod(){
              return "Private";
       }

       static String defaultMethode(){
              return "default";
       }
       protected static String protectedMethod(){
              return "protected";
       }
       public static String purblicMethod(){
              return "public";
       }
}

public class E138AccessModifiers {

       public static void main(String[] args) {

              AnotherClass obj=new AnotherClass();

              System.out.println(AnotherClass.defaultMethode());
              System.out.println(AnotherClass.protectedMethod());
              System.out.println(AnotherClass.purblicMethod());

       }
}
