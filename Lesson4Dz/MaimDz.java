package lesson4.Lesson4Dz;

import java.util.Scanner;

public class MaimDz {
    public static void main(String[] args) {
            final double max = 10.;
            int WNum = rnd(max);
            boolean fl = true;
            while (fl) {
                System.out.println("Введите число.");
                System.out.print("> ");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                if (WNum == number) {
                    fl = false;
                }else if (WNum > number){
                    System.out.println("Ваше число меньше.");
                }else {
                    System.out.println("Ваше число больше.");
                }
            }
            System.out.println("Поздравляю , вы угадали число!");
    }
    public static int rnd(final double max)
    {
        double ran = Math.random();
        return (int)(ran * max - ((ran * max)%1));
    }
    }



