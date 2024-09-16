package org.example.e171;
class Employee{
    private String empName = "John";
    private int empAge = 30;

    String getEmpName(){
        return empName;
    }
    int getEmpAge(){
        return empAge;
    }
}

public class E171Encapsulation {
    public static void main(String[] args){
    Employee e=new Employee();

        System.out.println("Employee Name: "+e.getEmpName());
        System.out.println("Employee Age: "+e.getEmpAge());
    }
}



