package org.example.e194;

import java.util.HashMap;
import java.util.Map;

public class E194Map {
    public static void main(String[] args) {

        HashMap<Integer,String>studentInfo=new HashMap<>();

        studentInfo.put(101,"John");
        studentInfo.put(102,"Emily");
        studentInfo.put(103,"Michael");
        studentInfo.put(104,"Sarah");
        studentInfo.put(105,"David");

        System.out.println("Student IDs:");
        for (Map.Entry<Integer,String> entry : studentInfo.entrySet()){
            System.out.println("Student ID: "+entry.getKey());
        }
        System.out.println();
        System.out.println("Student Names:");
        for (Map.Entry<Integer,String> entry : studentInfo.entrySet()){
            System.out.println("Student Name: "+entry.getValue());
        }
        System.out.println();
        System.out.println("Student Records:");
        for (Map.Entry<Integer,String> entry : studentInfo.entrySet()){
            System.out.println("Student ID: "+entry.getKey()+", Student Name: "+entry.getValue());
        }

    }

}
