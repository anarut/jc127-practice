package lesson02;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        System.out.print("Введите координаты точки A: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Введите координаты точки B: ");
        int y = scanner.nextInt();

        int l = Math.abs(y - x);
        System.out.println("Длина отрезка AB: " + l);

        int bytes = 5;
    }
}
