package org.example.e141;

public class E141AccessModifiers {
    public static int maxValu(int[]nums){
        int max = 0;

        for (int i : nums) {
            if (i > max){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
    int [] nums = {1,2,3,4,22,8,};

    int max = maxValu(nums);
        System.out.println(max);


    }
}
