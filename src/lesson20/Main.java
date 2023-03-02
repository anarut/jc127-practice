package lesson20;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Main {

    public static void main(String[] args) {
        Runnable r = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " ");
        };
        final ExecutorService service = Executors.newFixedThreadPool(2);
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.submit(r);
        service.submit(r);


        final ScheduledExecutorService service1 = Executors.newScheduledThreadPool(1);
        service1.schedule(r, 5, TimeUnit.MINUTES);

        service1.shutdown();

        String name = "Vasya_it.txt";

        Callable<Integer> c = () -> {
            String fileName = name;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new Random().nextInt(100) + 1;
        };
        final Future<Integer> future = service.submit(c);

        final boolean done = future.isDone();
        final boolean cancelled = future.isCancelled();
//        future.cancel(false);
        //TODO:
        try {
            final Integer integer = future.get(5, TimeUnit.HOURS);
            System.out.println("FINALY " + integer);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        service.shutdown();
    }
}
