package lesson13;

import lesson08.Point;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        int l1 = o1.getX() * o1.getX() + o1.getY() * o1.getY();
        int l2 = o2.getX() * o2.getX() + o2.getY() * o2.getY();
        return Integer.compare(l1, l2);
    }
}
