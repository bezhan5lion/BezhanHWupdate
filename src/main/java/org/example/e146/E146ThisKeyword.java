package org.example.e146;

public class E146ThisKeyword {
    public static class Employee {
        private String name;
        private String lastName;
        private int employeeID;
        private String startDate;
        private int salary;

        public Employee() {
            this.name = name;
            this.lastName = lastName;
            this.employeeID = employeeID;
            this.startDate = startDate;
            this.salary = salary;
        }

        public Employee(String name, String lastName, int employeeID, String startDate, int salary) {
            this.name = name;
            this.lastName = lastName;
            this.employeeID = employeeID;
            this.startDate = startDate;
            this.salary = salary;
        }

        public void printDetails() {
            System.out.println(name + " " + lastName + " " + employeeID + " " + startDate + " " + salary);
        }
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.printDetails();
        Employee emp2 = new Employee("Joe", "Smith", 12345, "01/01/1970", 35000);
        emp2.printDetails();
    }
}
