package lesson10;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedDeque;

public class QueueMain {

    public static void main(String[] args) {
//        Deque<String> objects1 = new ArrayDeque<>();
//        Deque<String> objects2 = new LinkedList<>();

        todo(new ArrayDeque<>());
        todo(new LinkedList<>());
        todo(new ConcurrentLinkedDeque<>());

    }

    private static void todo(Deque<String> objects) {
        objects.push("Minsk");
        objects.push("Brest");
        objects.push("Mogilev");

        System.out.println(objects);
        objects.push("Vitebsk");
        System.out.println(objects);
        String pop = objects.pop();
        System.out.println(objects);
        objects.add("Moscow");
        objects.addLast("New York");
        objects.offer("Oslo");
        objects.offerLast("Berlin");
        objects.offerFirst("Paris");
        System.out.println(objects);

        System.out.println(objects.size());
        System.out.println(objects.isEmpty());
    }
}
