package org.example.e180;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;


public class E180List {
    public static void main(String[] args){

        LinkedList<Integer> employeeAges = new LinkedList<>();

        // Step 2: Add 10 employee ages to the LinkedList
        employeeAges.add(20);
        employeeAges.add(55);
        employeeAges.add(35);
        employeeAges.add(30);
        employeeAges.add(45);
        employeeAges.add(50);
        employeeAges.add(25);
        employeeAges.add(40);
        employeeAges.add(65);
        employeeAges.add(60);

        // Step 3: Filter out ages that are not between 25 and 60
        employeeAges.removeIf(age -> age <= 25 || age > 60);

        // Step 4: Sort the remaining ages in ascending order
        Collections.sort(employeeAges);

        // Step 5: Calculate the average age
        double sum = 0;
        for (int age : employeeAges) {
            sum += age;
        }
        double averageAge = sum / employeeAges.size();

        // Step 6: Print the remaining ages and the average
        System.out.println("Remaining ages: " + employeeAges);
        System.out.println("Average age: " + averageAge);
    }
}
