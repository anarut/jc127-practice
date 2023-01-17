package lesson09;

import lesson08.Point;
import lesson08.Vector;

public interface Mouse {

    int a = 4;

    void btn1();

    void btn2();

    void wheelClick();

    void scrollUp();

    void scrollDown();

    void move(Vector vector);

    default int method(int a) {
        System.out.println("todo");
        return 1;
    }
}
