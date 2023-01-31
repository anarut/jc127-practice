package lesson13;

import lesson08.Point;

import java.util.Set;
import java.util.TreeSet;

public class Main2 {

    public static void main(String[] args) {
        Set<Point> set = new TreeSet<>(new PointComparator());
        set.add(new Point(1,1));
        set.add(new Point(1,2));
        set.add(new Point(-2,2));
        set.add(new Point(2,4));
        set.add(new Point(3,-2));

        System.out.println(set);

    }
}
