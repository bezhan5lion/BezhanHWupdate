package org.example.e193;


import org.hamcrest.core.Is;

import java.util.HashMap;
import java.util.Map;

public class E193Map {

    public static void main(String[] args) {

        HashMap<Integer,String>bookInfo=new HashMap<>();

        bookInfo.put(101,"The Catcher in the Rye");
        bookInfo.put(102,"To Kill a Mockingbird");
        bookInfo.put(103,"1984");
        bookInfo.put(104,"The Great Gatsby");
        bookInfo.put(105,"Moby Dick");

        System.out.println("Initial number of books in catalog: "+bookInfo.size());
        System.out.println("Is the catalog empty? "+bookInfo.isEmpty());
        System.out.println("Is book with ID 102 available? "+bookInfo.containsKey(102));
        System.out.println("Is the book \"1984\" available? "+bookInfo.containsValue("1984"));
        bookInfo.remove(105);
        System.out.println("Updated catalog after removing ID 105:");
        for (Map.Entry<Integer,String> entry : bookInfo.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
        bookInfo.clear();
        boolean isempty=bookInfo.isEmpty();
        System.out.println("Is the catalog empty after clearing? "+isempty);


    }

}