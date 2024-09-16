package org.example.e191;

import java.util.LinkedHashMap;
import java.util.Map;

public class E191Map {

    public static void main(String[] args) {

        LinkedHashMap<String, Double>productInfo=new LinkedHashMap<>();

        productInfo.put("Laptop", 1200.99);
        productInfo.put("Smartphone", 799.99);
        productInfo.put("Tablet", 499.99);
        productInfo.put("Smartwatch", 199.99);
        productInfo.put("Headphones", 149.99);


        System.out.println("Product Catalog:");
        for (Map.Entry<String, Double> entry : productInfo.entrySet()) {
            // Printing product name and price
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }



}
