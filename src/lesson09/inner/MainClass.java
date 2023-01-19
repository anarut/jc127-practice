package lesson09.inner;

import lesson09.Speakable;

public class MainClass {

    private int a;
    private static int b;

    public MainClass(int a) {
        this.a = a;
    }

    public static class StaticInnerClass implements Speakable {

        @Override
        public void voice() {
            System.out.println(b);
        }
    }

    public class NonStaticInnerClass implements Speakable {

        @Override
        public void voice() {
            System.out.println(a + b);
            todo();
        }

        public MainClass getParent() {
            return get();
        }
    }

    private MainClass get() {
        return this;
    }

    public void todo() {
        class NewClass {
            int x;
            int y;
            int z;

            public NewClass(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }
        }

        NewClass newClass = new NewClass(1, 2, 3);
        int x = newClass.x;
        int y = newClass.y;
    }

}

class Test {

}
