package lesson03;

import java.util.Scanner;

public class GuessNumber {

    static int i = 0;
    public static void main(String[] args) {
        final int result = (int) (Math.random() * 1000000 + 1);

        guessNumber(result);
    }


    private static void guessNumber(int r) {
//        System.out.println(++i);
        System.out.println("Введите число от 1 до 100:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        if (r == x) {
            System.out.println("угадали");
        } else {
            if (r > x) {
                System.out.println("нужно больше");
            } else {
                System.out.println("нужно меньше");
            }
            guessNumber(r);
            // вернуть в начало
        }
    }
}
