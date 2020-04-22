package lesson3.Lesson3DZ;

import java.util.Scanner;

// В интернете подсмотрел
public class optional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число.");
        System.out.print("> ");
        String number = scanner.nextLine();
        int i = number.length();
        char temp = number.charAt(i-1);
        int max = Character.getNumericValue(temp);
        for (int b = i - 1; b < 0; b -= 1) {
            char c = number.charAt(b);
            int y = Character.getNumericValue(c);
            if (max < y){
                max = y;
            }
        }
        System.out.println(max);
    }
}