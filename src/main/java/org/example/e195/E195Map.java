package org.example.e195;


import java.util.*;

public class E195Map {

    public static void main(String[] args) {

        Map<String, List<String>>studentDetails=new HashMap<>();
        // Create a Map to store students grouped by subject
        studentDetails.put("Mathematics",Arrays.asList("Alice","Bob"));
        studentDetails.put("Science", Arrays.asList("Charlie","David"));
        studentDetails.put("History",Arrays.asList("Eve","Frank"));

        System.out.println("From Map (Students by Subject):");
        for (Map.Entry<String,List<String>> entry : studentDetails.entrySet()){
            System.out.println("Subject: "+entry.getKey()+" Students: "+entry.getValue());
        }
    }
    }
