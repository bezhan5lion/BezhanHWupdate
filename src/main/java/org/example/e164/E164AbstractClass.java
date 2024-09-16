package org.example.e164;
  abstract class Vehicle{
   void startEngine(){

    }
    public void stopEngine(){
        System.out.println("Vehicle engine stopped");
    }
}
class Car extends Vehicle {

    public void startEngine(){
        System.out.println("Car engine started");
    }
public void startEngine(String keyType){
        System.out.println("Car engine started with a "+keyType);
    }
}

public class E164AbstractClass {
    public static void main(String[] args){
        Car c=new Car();
        c.startEngine();
        c.startEngine("smart key");
        c.stopEngine();
    }
}


