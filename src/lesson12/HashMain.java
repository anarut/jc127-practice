package lesson12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMain {

    public static void main(String[] args) {
        Set<String> gadgets = new HashSet<>();
        gadgets.add("Phone");
        gadgets.add("PC");
        gadgets.add("Laptop");
        gadgets.add("pc");
        gadgets.add("Speaker");
        gadgets.add("PC");
        gadgets.remove("Laptop");

        Set<Object> of = Set.of();

        System.out.println(gadgets);


        Map<String, String> map = new HashMap<>();
        map.put("test", "Hello");
        map.put("hast", "Good guy");
        map.put("test", "Igor");
        map.putIfAbsent("test", "bye");
        map.put("1", "Igor");

        System.out.println(map);
        Set<String> strings = map.keySet();
        System.out.println(strings);
        System.out.println(map.values());

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries) {
            String value = entry.getValue();
            String key = entry.getKey();
        }

    }
}
