# Concurrency

Runnable: no exception
```java
@FunctionalInterface
public interface Runnable {
    void run()
}
```

- Thread.MIN_PRIORITY = 1
- Tread.MAX_PRIORITY = 10

ExecutorService
- execute(Runnable command)
- Future submit(Runnable)
- 

Callable: callback

