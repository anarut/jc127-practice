package lesson19;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadUtil {


    volatile int x;

    AtomicInteger x1;


    public static void getThreadInfo(Thread thread) {
        final String formatted = "%s - %s (%s) %s %s"
                .formatted(
                        thread.getName(),
                        thread.getThreadGroup() == null ? "None" : thread.getThreadGroup().getName(),
                        thread.getPriority(),
                        thread.getState(),
                        thread.isDaemon());
        System.out.println(formatted);
    }
}
