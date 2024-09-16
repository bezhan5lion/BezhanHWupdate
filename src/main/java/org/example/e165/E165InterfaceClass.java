package org.example.e165;
interface ElectronicDevice{
    void turnOn();
    void turnOff();

}
class Smartphone implements ElectronicDevice{
    @Override
    public void turnOn(){
        System.out.println("Smartphone is turning on");
    }
    public void turnOff() {
        System.out.println("Smartphone is turning off");
    }

}
class Laptop implements ElectronicDevice{
    public void turnOn(){
        System.out.println("Laptop is turning on");
    }
    public void turnOff(){
        System.out.println("Laptop is turning off");
    }
}

public class E165InterfaceClass {

    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        Laptop lp=new Laptop();

        sp.turnOn();
        sp.turnOff();
        lp.turnOn();
        lp.turnOff();
    }

}