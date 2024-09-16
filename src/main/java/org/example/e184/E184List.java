package org.example.e184;


import java.util.ArrayList;
import java.util.List;

public class E184List {

    public static List<String> removeCountriesStartingWithA(List<String> countries) {
        // Use removeIf() to remove all countries that start with 'A'
        countries.removeIf(country -> country.startsWith("A"));
        return countries; // Return the updated list
    }

    public static void main(String[] args) {
        List<String>countryList=new ArrayList<>();
        countryList.add("USA");
        countryList.add("Argentina");
        countryList.add("Kazakhstan");
        countryList.add("Australia");
        countryList.add("Pakistan");
        countryList.add("Russia");

        List<String>updateList =removeCountriesStartingWithA(countryList);
        System.out.println(updateList);

    }
}
