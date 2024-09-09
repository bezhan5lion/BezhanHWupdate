package org.example.e148;

public class E148ThisKeyword {
    public static class ShoppingStore{

        private String item;
        private double price;
        private int quantity;
        double totalValue;


        public ShoppingStore(String item, double price, int quantity){
            this.item=item;
            this.price=price;
            this.quantity=quantity;
        }

        public double itemTotalPrice(){
            double totalValue=price*quantity;
            System.out.println(item+" "+"Total Value "+totalValue);
         return this.totalValue=totalValue;
        }

    }
    public static void main(String[] args){
        ShoppingStore obj1=new ShoppingStore("Blanket",49.99,2);
        ShoppingStore obj2=new ShoppingStore("Mattress",219.59,2);
        obj1.itemTotalPrice();
        obj2.itemTotalPrice();
        double totalPurchase=(obj1.totalValue+obj2.totalValue);
        System.out.println("You purchased "+totalPurchase+" Today");

    }
}
