package lesson08;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String s = "test";

        Pattern compile = Pattern.compile(s);
        Pattern compile1 = Pattern.compile(".*" + s + ".*");

        boolean test = "tester".matches("test");
        System.out.println(test);

        test = "tester".matches(".*" + s + ".*");
        System.out.println(test);

    }
}
