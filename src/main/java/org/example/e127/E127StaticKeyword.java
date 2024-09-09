package org.example.e127;

public class E127StaticKeyword {
    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Programming is amazing.");
    }

    // Static method
    public static void staticMethod() {
        System.out.println("Java is awesome.");
    }

    public static void main(String[] args) {
        // Creating an instance to call the non-static method
        E127StaticKeyword demo = new E127StaticKeyword();
        demo.nonStaticMethod();  // Calling the non-static method

        // Calling the static method
        E127StaticKeyword.staticMethod();  // Static method can be called using the class name
    }
}