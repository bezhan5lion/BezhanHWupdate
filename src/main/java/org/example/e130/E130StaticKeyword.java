package org.example.e130;

public class E130StaticKeyword {

    void mystry(int []intarr){
        for (int i = 0; i < intarr.length; i++) {
            if (intarr[i] % 2 == 0) {
                int evenDiv = intarr[i] / 2;
                System.out.print(evenDiv + " ");
            } else if (intarr[i] == 1) {
                System.out.print(i + " ");
            }else {
                int oddMul=intarr[i]*10;
                System.out.print(oddMul+" ");
            }
        }
    }

    public static void main(String[] args) {

    E130StaticKeyword obj=new E130StaticKeyword();
    int [] myArr={20,1,3,4,100};

    obj.mystry(myArr);
    }
}
