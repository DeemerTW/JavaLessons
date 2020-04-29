package Lesson5.Lesson5Dz;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a ={"s", "d", "f", "g", "h", "j", "k", "l", "v"};
        String[] b ={"s", "d", "f", "g", "h", "j", "k", "l", "v"};
        String text = "Ложь!";
        if (rav(a, b)){
            text = "Правда!";
        }
        System.out.println(" a = " + Arrays.toString(a) +"  b = " + Arrays.toString(b) + " равны: " + text);
    }
    static boolean rav(String[] a, String[] b ){
        int count = 0;
        boolean flag = true;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i].equals(b[i])) {
                } else {
                    flag = false;
                }
            }
        }else {
            flag = false;
        }
        return flag;
    }
}
