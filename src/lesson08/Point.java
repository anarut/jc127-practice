package lesson08;

import java.util.Objects;

public class Point implements Comparable<Point> {

    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        if (!validateCoordinate(y)) {
            this.y = y;
        }
    }

    public int getX() {
        return x;
    }

//    public void setX(int x) {
//        this.x = x;
//    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (validateCoordinate(y)) {
            System.out.println("ERROR");
        } else {
            this.y = y;
        }
    }

    private boolean validateCoordinate(int a) {
        return a > 1000 || a < -1000;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return getX() == point.getX() && getY() == point.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public int compareTo(Point o) {
//        int compare = Integer.compare(this.x, o.x);
//        return compare == 0 ? Integer.compare(this.y, o.y) : compare;

        if (this.x == o.x) {
            return Integer.compare(this.y, o.y);
//            if (this.y == o.y) {
//                return 0;
//            } else if (this.y > o .y) {
//                return 1;
//            } else {
//                return -1;
//            }
        } else if (this.x > o .x) {
            return 1;
        } else {
            return -1;
        }
    }
}
