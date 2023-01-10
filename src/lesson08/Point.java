package lesson08;

public class Point {

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
}
