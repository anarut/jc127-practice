package lesson10;

import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {
        DayOfWeek monday = DayOfWeek.MONDAY;
    }

    class A { }

    class B extends A { }

    class C extends A { }

    class Bouquet {

        A[] flowers;

        public Bouquet(int size) {
            flowers = new A[size];
        }

        //add()

        int price() {
            // flowers
            return 0;
        }


    }
}
