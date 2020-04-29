package Lesson5.Lesson5Dz;

import java.util.Arrays;

public class warmup {
    public static void main(String[] args) {
        int[] a = {12, 8, 9, 0, -1, 7, -100 , 20 , -60 , 66, 44, 32};
        System.out.println("a = " + Arrays.toString(a) + "  min =" + max(a));
    }

    static int max(int[] a) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (result < a[i]) {
                result = a[i];
            }
        }
        return result;
    }
}