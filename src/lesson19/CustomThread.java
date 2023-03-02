package lesson19;

public class CustomThread extends Thread {


    @Override
    public void run() {
        System.out.println("I'm custom thread " + Thread.currentThread());
    }
}
