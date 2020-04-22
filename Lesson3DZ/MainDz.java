package lesson3.Lesson3DZ;

import java.util.Scanner;

public class MainDz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = 0;
        boolean fl = true;
        while (fl) {
            System.out.println("Введите количество чисел.");
            System.out.print("> ");
            int quantit = scanner.nextInt();
            if (quantit >= 1) {
               fl = false;
                quantity = quantit;
            }
        }
//int min = Integer.MAX_VALUE
        System.out.println("Введите числа , каждое число в новой строке.");
        System.out.print("> ");
        int max = scanner.nextInt();
        int min = max;
        int zero = 0;
        if (max == 0){
            zero = 1;
        }
        for(int i = 2; i <= quantity ; i += 1 ){
            System.out.print("> ");
            int line = scanner.nextInt();
            if (line > max){
                max = line;
            }else if (line < min){
                min = line;
            }
            if (line == 0){
                zero += 1;
            }
        }
        System.out.println("максимум = " + max );
        System.out.println("минимум = " + min );
        System.out.println("нулей = " + zero );
    }
}
