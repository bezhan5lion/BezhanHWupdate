package org.example.e129;

public class E129StaticKeyword {

    static String country;
    static String continent;
    void countryAndContinent(String country,String continent){
        System.out.println(country+" located on "+continent+" continent");
    };
    public static void main(String[] args) {

        E129StaticKeyword obj=new E129StaticKeyword();
        obj.countryAndContinent("Morocco","Africa");
    }
}
