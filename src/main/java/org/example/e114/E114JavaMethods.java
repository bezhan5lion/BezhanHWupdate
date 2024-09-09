package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        // Call the add method with arguments that add up to 30
    add(10,20);
        // Call the multiply method with arguments that multiply to 30
    multipy(5,6);
        // Call the subtract method with arguments that subtract to 20
    subtract(40,20);
    }

    // Create method multiply with two integer parameters and a print statement to display the result
    public static void multipy(int a, int b){
        int mulResult=a*b;
        System.out.println("Multiplication "+mulResult);
    }
    // Create method add with two integer parameters and a print statement to display the result
    public static void add(int a, int b){
        int addResult=a+b;
        System.out.println("Addition "+addResult);
    }
    // Create method subtract with two integer parameters and a print statement to display the result
    public static void subtract(int a, int b){
        int subResult=a-b;
        System.out.println("Subtraction "+subResult);
    }
}
