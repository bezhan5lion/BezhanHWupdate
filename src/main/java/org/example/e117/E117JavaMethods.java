package org.example.e117;

public class E117JavaMethods {
    // Create Method sumEvenToX
    public static int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        // Call Method from main with various arguments
        System.out.println("sumEvenToX(5) ==> " + sumEvenToX(5));  // 6
        System.out.println("sumEvenToX(8) ==> " + sumEvenToX(8));  // 20
    }
}
