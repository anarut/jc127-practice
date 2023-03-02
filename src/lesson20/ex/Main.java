package lesson20.ex;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(0, 5);
        Producer producer1 = new Producer(store);
        Producer producer2 = new Producer(store);
        Producer producer3 = new Producer(store);
        Consumer consumer1 = new Consumer(store);
        Consumer consumer2 = new Consumer(store);
        Consumer consumer3 = new Consumer(store);
        Consumer consumer4 = new Consumer(store);
        final List<Runnable> rList = List.of(producer1, producer2, producer3,
                consumer1, consumer2, consumer3, consumer4);

        rList.forEach(runnable -> {
            new Thread(runnable).start();
        });

    }
}
