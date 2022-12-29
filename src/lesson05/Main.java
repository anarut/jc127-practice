package lesson05;

public class Main {

    public int a;
    protected int b;
    int c;
    private int d;


    public static final double PI = Math.random();

    public static void main(String[] args) {
        Main main = new Main();
        int a = main.a;
        int d = main.d;
        int c = main.c;
        int b = main.b;

        double pi = main.PI;

        System.out.println(new Main().PI);
        System.out.println(new Main().PI);
        System.out.println(new Main().PI);

//        Main.PI = 3.14;
        System.out.println(Main.PI);
        System.out.println(Main.PI);
        System.out.println(Main.PI);
    }
}
