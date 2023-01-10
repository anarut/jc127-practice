package lesson08;

public class MainClass {

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.getX() + " " + p.getX());  // -100 ; 100
//        p.setY(-111111);
        Point point = new Point(5, 6);

        Vector vector = new Vector(new Point(1, 1), new Point(4,3 ));
        Vector vector1 = new Vector(point);

        System.out.println(p);
        System.out.println(point);
        System.out.println(vector);
        System.out.println(vector1);
        System.out.println(vector.getEnd());


    }
}
