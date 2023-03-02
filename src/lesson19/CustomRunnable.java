package lesson19;

public class CustomRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("hello world from " + Thread.currentThread().getName());
        ThreadUtil.getThreadInfo(Thread.currentThread());
    }
}
