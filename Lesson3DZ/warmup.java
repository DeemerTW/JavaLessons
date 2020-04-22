package lesson3.Lesson3DZ;

import java.util.Scanner;

public class warmup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Введите натуральное ЧИСЛО!");
        System.out.print("> ");
        int line = scanner.nextInt();
        if ( (line % 5) == 0 ){
            System.out.println("Число делится на 5 без остатка .");
        }else{
            System.out.println("Число не делится на 5 без остатка .");
        }

    }
}
