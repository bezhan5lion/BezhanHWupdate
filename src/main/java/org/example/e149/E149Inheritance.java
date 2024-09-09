package org.example.e149;

public class E149Inheritance {
    public static class Vehicle{
        String make;
        int year;

        public void displayInfo(){
            System.out.println("Vehicle: "+make+", Year: "+year);
        }
    }
    public static class Car extends Vehicle{
        String model;

    public void displayCarInfo(){
        displayInfo();
        System.out.println("Model: "+model);
    }
    }

    public static void main(String[] args) {
        Car car1=new Car();
        car1.make="Toyota";
        car1.year=2020;
        car1.model="Corolla";
        car1.displayCarInfo();
    }
}
