package org.example.e162;
class Animal{
    String type;
    Animal(String type){
        this.type=type;
    }
    public void eat(){
        System.out.println("I am an animal eating");
    }
    protected void sleep(){
        System.out.println("I am an animal sleeping");
    }
    void makeSound(){
        System.out.println("I am an animal making sound");
    }
    private void roam(){
        System.out.println("I am an animal roaming");
    }
}
class Cat extends Animal{

    Cat() {
        super("Cat");
    }

    @Override
   protected void sleep(){
        System.out.println("Cat sleeps a lot");
    }
    @Override
    public void eat(){
        System.out.println("Cat eats");
    }
    @Override
    void makeSound(){
        System.out.println("Cat makes a sound");
    }

}
class Kitten1 extends Cat{
    protected void sleep(){
        System.out.println("kitten1 sleeps a lot");
    }
@Override
public void eat(){
    System.out.println("kitten1 eats milk");
    }
}
class Kitten2 extends Cat{
    protected void sleep(){
        System.out.println("kitten2 sleeps a lot");
    }
    @Override
    public void eat(){
        System.out.println("kitten2 eats snacks");
    }
}
class Kitten3 extends Cat{
    protected void sleep(){
        System.out.println("kitten3 sleeps a lot");
    }
    @Override
    public void eat(){
        System.out.println("kitten3 eats everything");
    }
}

public class E162MethodOverriding {
    public static void main(String[] args) {

        Cat cat=new Cat();
        Kitten1 k1=new Kitten1();
        Kitten2 k2=new Kitten2();
        Kitten3 k3=new Kitten3();

        Animal [] arr={cat,k1,k2,k3};

        for(Animal ani : arr){
            ani.eat();
            ani.sleep();
        }
        cat.makeSound();
    }
}
