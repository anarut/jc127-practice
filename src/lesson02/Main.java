package lesson02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        //abc
        int a = x / 100;
        int b = x / 10 % 10;
        int c = x % 10;

//        sum = x / 100 + x / 10 % 10 + x % 10;
        int sum = a + b + c;
        int multiply = a * b * c;

        System.out.println("Сумма цифр: " + sum);
        System.out.println("Произведение цифр: " + multiply);
    }
}
