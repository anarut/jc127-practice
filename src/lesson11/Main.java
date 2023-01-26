package lesson11;

public class Main {

    public static void main(String[] args) {
        String[] a = {"2", "3"};
        test1(a);
        test2(4, a);
        test2(4);
        test2(4, "2");
        test2(4, "2", "3");
        test2(4, "2", "3", "4");
    }


    public static void test1(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }

    public static void test2(int a, String... args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
