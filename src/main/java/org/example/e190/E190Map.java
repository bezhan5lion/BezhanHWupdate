package org.example.e190;

import java.util.LinkedHashMap;

public class E190Map {
    public static void main(String[] args) {
        LinkedHashMap<String, String>addresses=new LinkedHashMap<>();
        addresses.put("Street","Patrick ST");
        addresses.put("Suite","265");
        addresses.put("City","Vienna");
        addresses.put("Zip","22180");
        addresses.put("Country","United States");


        System.out.println("Address Details:");

        for (String add : addresses.values()) {
            System.out.println(add);
        }
        }

}
