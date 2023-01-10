package lesson08;

public class Vector {

    private Point start;
    private Point end;

    public Vector(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Vector(Point end) {
        this.start = new Point();
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    //    int x1;
//    int y1;
//    int x2;
//    int y2;


    @Override
    public String toString() {
        return "{" + start + ", " + end + '}';
    }
}
