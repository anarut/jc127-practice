package lesson14;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(11);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.add(9);
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.print(next + " ");
        }
        System.out.println();
        ListIterator<Integer> integerListIterator = numbers.listIterator();

        numbers.forEach(integer -> System.out.print(integer + " "));


        Collection<String> s = new ArrayDeque<>();
        s = new ArrayList<>();
        s = new TreeSet<>();
        Deque<String> s01 = (Deque<String>) s;
        ArrayDeque<String> s02 = (ArrayDeque<String>) s;
        Deque<String> s1 = new ArrayDeque<>();
        ArrayDeque<String> s2 = new ArrayDeque<>();
        Queue<String> s3 = new ArrayDeque<>();

    }

    public static void todo(Deque<String> args) {
        args.iterator();
    }
}
