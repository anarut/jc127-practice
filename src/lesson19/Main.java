package lesson19;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            System.out.println("hello world from " + Thread.currentThread().getName());
            ThreadUtil.getThreadInfo(Thread.currentThread());
            if (!Thread.currentThread().isInterrupted()) {
                //TODO:
            }
        };
        final Thread thread = new Thread(r);
        final Thread thread1 = new Thread(r);
        final Thread thread2 = new Thread(r);
        System.out.println(thread);

        final Thread currentThread = Thread.currentThread();
        System.out.println(currentThread);
        ThreadUtil.getThreadInfo(Thread.currentThread());
        ThreadUtil.getThreadInfo(thread);

        thread.start();
        thread1.start();
        thread2.start();
        ThreadUtil.getThreadInfo(thread);
        Thread.sleep(1000L); // sleep for main thread
        ThreadUtil.getThreadInfo(thread);

        new CustomThread().run();
        new CustomThread().start();
//        thread.start();

        thread.interrupt();
        thread.isInterrupted();
    }
}
