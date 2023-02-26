package lesson19;

public class ThreadMain {

    static class Counter {
        int i = 0;

        void inc() {
            i = i + 1;
        }

        public int get() {
            return i;
        }

        public synchronized void todo() {
            //todo:
            inc();
            System.out.println("count: " + get() + " " + Thread.currentThread());
            //todo:
        }
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                counter.todo();
//                synchronized (Counter.class) {
//                    counter.inc();
//                    System.out.println("count: " + counter.get() + " " + Thread.currentThread());
//                }
                System.out.println();
            }
        };

        new Thread(r).start();
        new Thread(r).start();
        new Thread(r).start();
//        System.out.println("TOTAL: " + counter.get());
    }
}
