package lesson4.Lesson4Dz;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число.");
            System.out.print("> ");
            int number = scanner.nextInt();
            System.out.println(chet(number));
        }
    }
    private static boolean  chet(int in){
        boolean res = (in % 2 == 0);
        return res;
    }
}
