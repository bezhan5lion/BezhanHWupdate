package org.example.e143;

import org.example.e87.Car;

public class E143Constructor {

    public static class Car {
        private String make;
        private String model;
        private int numberOfDoors;
        private int topSpeed;
        private double price;

        public Car(String make, String model, int numberOfDoors, int topSpeed, double price){
        this.make=make;
        this.model=model;
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
        public Car(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = 4;
        this.topSpeed = topSpeed;
        this.price = price;
    }
        public Car(int numberOfDoors, int topSpeed, double price){
        this.make="unknown";
        this.model="unknown";
        this.numberOfDoors=numberOfDoors;
        this.topSpeed=topSpeed;
        this.price=price;
    }
        public Car(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = 90;
        this.price = 0.0;
    }
        public void display(){
        System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
    }
    }
    public static void main(String[] strings) {

        Car car1=new Car("Toyota","Prius",4,120,30000.0);
        Car car2=new Car("Toyota","Prius",120,30000.0);
        Car car3=new Car(4,120,30000.0);
        Car car4=new Car("Toyota","Prius",4);

        car1.display(); car2.display();car3.display();car4.display();
    }
}


