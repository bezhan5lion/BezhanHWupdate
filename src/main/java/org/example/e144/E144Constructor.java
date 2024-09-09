package org.example.e144;

public class E144Constructor {
    public static class StoreProduct {
        private String name;
        private double price;
        private String category;
        private boolean hasExpiration;
        private int stock;

        public StoreProduct(String name, double price, String category, boolean hasExpiration, int stock) {
            this.name = name;
            this.price = price;
            this.category = category;
            this.hasExpiration = hasExpiration;
            this.stock = stock;
        }

        public StoreProduct(String name, double price, int stock) {
            this.name = name;
            this.price = price;
            this.category = "misc";
            this.hasExpiration = false;
            this.stock = stock;
        }

        public StoreProduct(String name, double price) {
            this.name = name;
            this.price = price;
            this.category = "misc";
            this.hasExpiration = false;
            this.stock = 0;
        }

        void display() {
            System.out.println(name + " " + price + " " + category + " " + hasExpiration + " " + stock);
        }
    }
        public static void main(String[] args) {

            StoreProduct obj1 = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
            StoreProduct obj2 = new StoreProduct("Paper Towels", 2.0, 24);
            StoreProduct obj3 = new StoreProduct("Paper Towels", 2.0);
            obj1.display();
            obj2.display();
            obj3.display();

    }
}
