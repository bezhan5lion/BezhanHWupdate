package org.example.e155;

class Company {

    Company() {
        System.out.println("Company Established");
    }
}
    class Department extends Company{

        Department(){
            System.out.println("Department Created");
        }
    }
     class Employee extends Department{

        Employee(){
            System.out.println("Employee Hired");
        }
    }
public class E155SuperKeyword {

    public static void main(String[] args) {

        Employee emp=new Employee();
    }
}

