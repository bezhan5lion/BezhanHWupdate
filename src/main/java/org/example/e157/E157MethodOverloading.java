package org.example.e157;
class TransactionCalculator{

    int calculateProfit(int trans1, int trans2){
        int result=trans1-trans2;

        return result;
    }

    int calculateProfit(int trans1, int trans2, int trans3){
        int result=trans1-trans2-trans3;

        return result;
    }
    int calculateProfit(int trans1, int trans2, int trans3, int trans4) {
        int result = trans1 - trans2 - trans3-trans4;

        return result;
    }
}

public class E157MethodOverloading {
    public static void main(String[] args) {

        TransactionCalculator obj=new TransactionCalculator();
        int resut1=obj.calculateProfit(100,20,30,10);
        int resut2=obj.calculateProfit(80,30,20);
        int resut3=obj.calculateProfit(50,30);
        System.out.println(resut1);
        System.out.println(resut2);
        System.out.println(resut3);
    }
}



