package org.example.e166;
interface Controllable{
    public void turnOn();
}
interface Configurable {
    public void configure();
}
class SmartHomeDevice implements Controllable, Configurable{
    public void turnOn(){
        System.out.println("Turning on Smart Home Device");
    }
    public void configure(){
        System.out.println("Configuring Smart Home Device settings");
    }
}
public class E166MultipleInterface {

    public static void main(String[] args) {
        SmartHomeDevice shd=new SmartHomeDevice();
        shd.turnOn();
        shd.configure();
    }
}

