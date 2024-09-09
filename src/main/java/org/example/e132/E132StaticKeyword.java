package org.example.e132;

public class E132StaticKeyword {
    public static void main(String[] args) {

         int [][] numbers={
                {1,2,3,4},
                {4,5,6,7},
                {1,3,5,7}
        };
        int [][] newNum= reduce10(numbers);
        for (int i = 0; i < newNum.length; i++) {
            for (int j = 0; j < newNum[i].length; j++) {

                System.out.print(newNum[i][j]+" ");
            }

            System.out.println();
        }
    }
    public static int[][] reduce10(int[][]numbers){
        int [][] newNum = new int[numbers.length][numbers[0].length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                newNum[i][j] = numbers[i][j]-10;
            }
        }
        return newNum;
    }
}

