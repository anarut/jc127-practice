package lesson15;

import lesson08.Point;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class MainReference {

    public static final int T = 10;

    interface A {
         Point apply(int a, int b);
    }

    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public Point apply(int a, int b) {
                return new Point(a, b);
            }
        };

        A a2 = (a, b) -> new Point(a, b);
        A a3 = Point::new;

        Point apply = a3.apply(6, 7);

        Supplier<Integer> s = () -> new Random().nextInt(5);
        Function<Integer, Integer> f = bound -> new Random().nextInt(bound);
        Integer integer = s.get();
        f.apply(T);

        Function<Integer, Boolean> k = a -> null;

        Boolean apply1 = k.apply(5);


        Function<Integer, Integer> f2 = a -> a + 5;
        UnaryOperator<Integer> f3 = a -> a + 5;
    }
}
