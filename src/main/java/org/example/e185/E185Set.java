package org.example.e185;

import java.util.HashSet;

public class E185Set {
    public static void main(String[] args) {

        HashSet<Integer>customerID=new HashSet<>();
        customerID.add(1001);
        customerID.add(1002);
        customerID.add(1001);
        customerID.add(1003);
        customerID.add(1002);
        customerID.add(1004);

        customerID.forEach(x-> System.out.println(x));
}
}

