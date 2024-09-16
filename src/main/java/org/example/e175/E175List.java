package org.example.e175;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class E175List {
    public static void main(String[] args){
        ArrayList<Integer>productA=new ArrayList<>();
        productA.add(111);
        productA.add(111);
        productA.add(111);
        ArrayList<Integer>productB=new ArrayList<>();
        productB.add(999);
        productB.add(999);
        productB.add(999);

        productA.forEach(x-> System.out.println(x));
        productB.forEach(x-> System.out.println(x));

    }

}
