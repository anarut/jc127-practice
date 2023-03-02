package lesson20;

import lesson08.Point;

import java.util.Random;

public class ThreadLocalEx {

    class A {
        int x;
    }

    public static ThreadLocal<Integer> x = new ThreadLocal<Integer>();

    public static void main(String[] args) {
        final ThreadLocalEx threadLocalEx = new ThreadLocalEx();

        new Thread(threadLocalEx::todo6).start();
        new Thread(threadLocalEx::todo6).start();
        new Thread(threadLocalEx::todo6).start();
        new Thread(threadLocalEx::todo6).start();
    }

    public void todo1() {
        final Integer integer = x.get();
        //TODO: x?
        System.out.println(Thread.currentThread().getName() + " --> " + integer);

    }

    public void todo2() {
        todo1();
    }

    public void todo3() {
        x.set(x.get() - 5);
        todo2();
    }

    public void todo4() {
        todo3();
    }

    public void todo5() {
        todo4();
    }

    public void todo6() {
        //TODO:
        Integer r = new Random().nextInt(100);
        x.set(r);
        A a = new A();
        a.x = r;
        System.out.println(Thread.currentThread().getName() + " --> " + r);

        todo5();
    }
}
