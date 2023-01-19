package lesson09.inner;

import lesson08.animals.Animal;
import lesson09.Speakable;

public class Main {

    public static void main(String[] args) {
        MainClass.StaticInnerClass staticInnerClass =
                new MainClass.StaticInnerClass();

        MainClass mainClass = new MainClass(5);
        MainClass.NonStaticInnerClass nonStaticInnerClass =
                mainClass.new NonStaticInnerClass();

        MainClass.NonStaticInnerClass nonStaticInnerClass1 =
                new MainClass(55).new NonStaticInnerClass();

        MainClass parent = nonStaticInnerClass1.getParent();


        MainClass mainClass1 = new MainClass(99) {
            @Override
            public void todo() {
                System.out.println("my todo");
            }
        };

        Animal animal = new Animal(1,2, true) {

            @Override
            public void eat() {
                System.out.println("");
            }

            @Override
            public void voice() {
                System.out.println("");
            }

            @Override
            public void sleep() {
                System.out.println("");
            }
        };

        Speakable speakable = new Speakable() {
            @Override
            public void voice() {
                System.out.println("ololo");
            }
        };

        System.out.println();
    }
}
