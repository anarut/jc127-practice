package lesson22;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        if (new Random().nextBoolean()) {
            final Singleton instance1 = Singleton.getInstance();
            final Singleton instance2 = Singleton.getInstance();

            System.out.println(instance1);
            System.out.println(instance2);
        }
    }
}
