package lesson17;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] words = {"America", "Belarus", "Norway", "Sweden", "", "I"};
        Stream<String> stream = Arrays.stream(words);

//        Stream<char[]> stream1 = stream.map(s -> s.toCharArray());
        IntStream objectStream = stream.flatMapToInt(s -> s.chars());

        IntStream objectStream2 = stream.flatMapToInt(s ->
                Arrays.stream(Stream.of(s.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray()
                )
        );
        String s = "";

        int[] ints = Stream.of(s.split(""))
                .mapToInt(Integer::parseInt)
                .toArray();


    }
}
