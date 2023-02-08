package lesson15;

public class Main {

    @FunctionalInterface
    interface Combinable {
        int combine(int a, int b);

        default int max(int a, int b) {
            return Math.max(a, b);
        };
    }

    public static void main(String[] args) {
        Combinable c = new Combinable() {
            int result = 0;
            @Override
            public int combine(int a, int b) {
                result += a + b;
                return result;
            }
        };

        System.out.println(c.combine(5, 7));

        Combinable c1 = (a1, b1) -> {
            int a11 = a1;
            int b11 = b1;
            return a11 + b11;
        };

        Combinable c2 = (a1, b1) -> a1 + b1;
        int combine = c2.combine(3, 3);

        Combinable c3 = (a1, b1) -> a1 * b1;
        Combinable c4 = (a1, b1) -> a1 - b1;


        int combine1 = c3.combine(5, 8);

        int combine2 = c3.combine(9, 4);

        int combine3 = c3.combine(7, 1);

        if (c1.combine(1, 2) > 5) {
            c2.combine(2, 2);
        } else {
            c3.combine(3,5);
        }

        Combinable c5 = (a, b) -> a + b;
        Combinable c6 = Integer::sum;

        Main main = new Main();
        int length = main.length(3, 4);
        System.out.println(length);

        Combinable c7 = main::length;
        System.out.println(c7.combine(6, 8));

    }



    public int length(int x, int y) {
        return (int) Math.sqrt(x * x + y * y);
    }

    interface A {
        String nextDay(int day, int month, int year);
    }

}
