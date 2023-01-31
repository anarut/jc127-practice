package lesson13;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String str = "Для хранения наборов данных в Java предназначены массивы. Однако их не всегда удобно использовать, прежде всего потому, что они имеют фиксированную длину. Эту проблему в Java решают коллекции. Однако суть не только в гибких по размеру наборах объектов, но в и том, что классы коллекций реализуют различные алгоритмы и структуры данных (стек, очередь, дерево и ряд других).";
        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char symbol : chars) {
            if ((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')
            || (symbol >= 'а' && symbol <= 'я') || (symbol >= 'А' && symbol <= 'Я')) {
                if (map.containsKey(symbol)) {
                    Integer currentValue = map.get(symbol);
//                    map.put(symbol, currentValue + 1);
                } else {
                    map.put(symbol, new Random().nextBoolean() ? 10 : 5);
                }
            }
        }

        System.out.println(map);

        Map<Integer, List<Character>> map2;
        Character max = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (max == null || map.get(max) < entry.getValue()) {
                max = entry.getKey();
            }
        }

        System.out.println(max);

        Map<String, List<Integer>> map3;
    }
}
