package org.example.e152;

class Building {
    String location;

    Building(String location) {
        System.out.println(location);
    }

    Building() {
        super();
    }
}

class House extends Building {
    House(String location) {
        System.out.println(super.location = location);
    }
}

public class E152SuperKeyword {
    public static void main(String[] args) {
        House obj = new House("Vienna");

    }
}

