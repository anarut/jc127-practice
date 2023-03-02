package lesson20.ex;

public class Store {

    public int i;
    public int max;

    public Store(int i, int max) {
        this.i = i;
        this.max = max;
    }

    public synchronized void add() {
        while (i == max) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i++;
        System.out.println(Thread.currentThread().getName() + " --- TOTAL:" + i);
        notifyAll();
    }

    public synchronized void remove() {
        while (i == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i--;
        System.out.println(Thread.currentThread().getName() + " --- TOTAL:" + i);
        notifyAll();
    }
}
