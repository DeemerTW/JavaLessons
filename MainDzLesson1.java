package lesson1;

public class MainDzLesson1 {
    public static void main(String[] args) {
        boolean zero = false;
        int x1 = 683;
        int x2 = 333;
        double x3 = 66.6;
        if (x3 != 0) {
            if (x1 != 0) {
                double res = x3 * (x1 - x2) / (x1 / x3);
                System.out.println("result = " + res);
            } else {
                zero = true;
            }
        } else {
            zero = true;
        }
        if (zero == true){
            System.out.println("/ by zero");
        }
    }
}