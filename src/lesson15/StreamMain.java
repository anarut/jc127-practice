package lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        Stream<Integer> integerStream =
                Stream.of(1, 2, 3, 24, 25, 6, 27, 9, 40, 330, 400, 0, 75, 6, 4, 4, 4);

        Integer[] a = {1, 2, 3, 24, 25, 6, 27, 9, 40, 330, 400, 0, 75, 6, 4, 4, 4};
        Stream<Integer> stream = Arrays.stream(a);
        List<Integer> objects = new ArrayList<>();
        Stream<Integer> stream1 = objects.stream();

        long count = integerStream
                .distinct()
                .sorted()
                .map(k -> k * k)
                .map(String::valueOf)
                .filter(k -> k.length() < 3)
                .count();

        System.out.println(count);


        String collect = stream
                .distinct()
                .sorted()
                .map(k -> k * k)
                .map(String::valueOf)
                .filter(k -> k.length() < 3)
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(collect);
    }
}
