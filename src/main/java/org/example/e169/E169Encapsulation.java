package org.example.e169;
class Employee{
    private String empName;
    private int empAge;

    public String getempName() {
        return empName;
    }
    public void setempName(String empName) {
        this.empName=empName;
    }
    public int getempAge(){
        return empAge;
    }
    public void setempAge(int empAge){
        this.empAge=empAge;
    }
}

public class E169Encapsulation {
    public static void main(String[] args){
    Employee emp=new Employee();

    emp.setempName("John");
    emp.setempAge(30);
        System.out.println("Employee Name: "+emp.getempName());
        System.out.println("Employee Age: "+emp.getempAge());
    }
}
