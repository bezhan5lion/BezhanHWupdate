package org.example.e163;

class StringManipulator {
    String str;

    StringManipulator(String str) {
        this.str = str;
    }

    final String recerseString() {
        StringBuilder sb = new StringBuilder(str);
        String newStr = sb.reverse().toString();
        return newStr;
    }
}

class ArrayManipulator {
    final double avgElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}

public class E163FinalKeyword {

    public static void main(String[] args) {
        StringManipulator obj = new StringManipulator("hello");

        System.out.println(obj.recerseString());
        ArrayManipulator obj2 = new ArrayManipulator();
        System.out.println(obj2.avgElements(new int[]{3, 4, 5, 6, 6}));
    }

}
