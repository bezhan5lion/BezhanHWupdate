package org.example.e161;
class Employee{
    public void work(){
        System.out.println("I am an Employee working");
    }
    protected void takeBreak(){
        System.out.println("I am an Employee taking a break");
    }
    void attendingMeeting(){
        System.out.println("I am an Employee attending a meeting");
    }
    private void submitReport(){
        System.out.println("I am an Employee submitting a report");
    }
    public void hello(){
        System.out.println("method in Employee class");
    }
    static class Manager extends Employee{
        @Override
        public void work(){
            System.out.println("I am a Manager working");
        }
        @Override
        protected void takeBreak(){
            System.out.println("I am a Manager taking a break");
        }
        @Override
        void attendingMeeting(){
            System.out.println("I am a Manager attending a meeting");
        }
        @Override
        public void hello(){
            System.out.println("method in Manager class");
        }
    }
    static class Developer extends Employee{
        @Override
        public void work(){
            System.out.println("I am a Developer working");
        }
        protected void takeBreak(){
            System.out.println("I am a Developer taking a break");
        }
        @Override
        void attendingMeeting(){
            System.out.println("I am a Developer attending a meeting");
        }
        @Override
        public void hello(){
            System.out.println("method in Developer class");
        }
    }
    static class Intern extends Employee{
        @Override
        public void work(){
            System.out.println("I am an Intern working");
        }
        protected void takeBreak(){
            System.out.println("I am an Intern taking a break");
        }
        @Override
        void attendingMeeting(){
            System.out.println("I am an Intern attending a meeting");
        }
        @Override
        public void hello(){
            System.out.println("method in Intern class");
        }
    }
}

public class E161MethodOverriding {
    public static void main(String[] args) {

        Employee.Manager mgr=new Employee.Manager();
        Employee.Developer dev=new Employee.Developer();
        Employee.Intern Intern=new Employee.Intern();

        Employee[] employees = {mgr, dev, Intern};

        for (Employee emp : employees){
            emp.hello();
        }
        dev.work();
        dev.takeBreak();
        dev.attendingMeeting();
    }
}



