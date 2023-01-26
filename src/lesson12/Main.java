package lesson12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add(1, "White");

        List<String> col = List.of("Purple", "Red", "Brown");
//        col.add("Yellow");
        colors.addAll(col);

        System.out.println(colors);

        System.out.println(colors instanceof Queue);
    }
}
