package ocp.chap7Concurrency;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ScheduledTask {
    public static void main(String... args) {
        ScheduledExecutorService exec = Executors.newSingleThreadScheduledExecutor();
        exec.schedule(() -> System.out.println("Hello"), 3, TimeUnit.SECONDS);
    }
}