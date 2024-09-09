package org.example.e160;


public class E160MethodOverloading {

    // Private Instance Method 1: Display Account Info
    private void displayInfo() {
        System.out.println("private displayInfo method");
    }

    // Private Instance Method 2: Display Account Info with Balance
    private void displayInfo(int balance) {
        System.out.println("private displayInfo method with balance: " + balance);
    }

    // Static Method 1: Display General Bank Info
    public static void displayBankInfo() {
        System.out.println("static method without parameter");
    }

    // Static Method 2: Display General Bank Info with Number of Branches
    public static void displayBankInfo(int branches) {
        System.out.println("static method with int parameter: " + branches);
    }

    // Main Method to test overloading
    public static void main(String[] args) {
        // Create an object of BankAccount class
        E160MethodOverloading account = new E160MethodOverloading();

        // Call private instance methods
        account.displayInfo();
        account.displayInfo(5000);

        // Call static methods
        E160MethodOverloading.displayBankInfo();
        E160MethodOverloading.displayBankInfo(20);
    }
}
