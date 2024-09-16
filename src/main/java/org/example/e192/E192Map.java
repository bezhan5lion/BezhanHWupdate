package org.example.e192;

import java.util.Map;
import java.util.TreeMap;

public class E192Map {
    public static void main(String[] args){

        TreeMap<String, String>productInfo=new TreeMap<>();

        productInfo.put("1 item","apple");
        productInfo.put("2 item","banana");
        productInfo.put("3 item","pear");
        productInfo.put("4 item","tomato");
        productInfo.put("5 item","mango");
        productInfo.put("6 item","kiwi");

        for (Map.Entry<String, String> entry : productInfo.entrySet()){
            System.out.println("Key is "+ entry.getKey()+" and value is "+ entry.getValue());
        }

    }

}