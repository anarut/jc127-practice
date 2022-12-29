package lesson04;

/**
 * Создайте программу, выводящую на экран первые 15 элементов последовательности.
 * Пример:
 * 3 9 27 81 243 ...
 */
public class Main {

    public static void main(String[] args) {
        for (int i = 0, a = 3; i < 15; i++, a *= 3) {
            System.out.print(a + " ");
        }

        System.out.println();
        int n = 7;
        int f = 1;
        for (int i = n; i > 1; i--) {
            f *= i;
        }
        System.out.println(f);
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println(factorial(0));

        int a = 0;
        int b = 1;
        System.out.print(a);
        while (b < 100) {
            System.out.print(" " + b);
            int fib = a + b;
            a = b;
            b = fib;

        }
        System.out.println();

        System.out.println(fibbonachi(0));
        System.out.println(fibbonachi(4));
        System.out.println(fibbonachi(10));
        System.out.println(fibbonachi(20));
        System.out.println(fibbonachi(100));

    }

    public static int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n;
        }
        return 1;
    }

    public static int fibbonachi(int n) {
        if (n > 1) {
            return fibbonachi(n - 2) + fibbonachi(n - 1);
        }
//        if (n == 0) {
//            return 0;
//        } else if (n == 1) {
//            return 1;
//        }
        return n;
    }
}
