package lesson09;

import java.util.Random;

public class ClassB {

    public void methodB() {
        System.out.println("Hello +1");
    }

    public int anotherMethodB() {
        return new Random().nextInt(100);
    }

    public int anotherMethodB3() {
        return new Random().nextInt(100);
    }
}
