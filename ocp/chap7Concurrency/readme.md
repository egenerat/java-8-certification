# Concurrency

### Runnable
cannot throw exception, no return value
```java
@FunctionalInterface
public interface Runnable {
    void run();
}
```

### Callable
```java
@FunctionalInterface
public interface Callable<V> {
    V call() throws Exception;
}
```

- Thread.MIN_PRIORITY = 1
- Tread.MAX_PRIORITY = 10

ExecutorService
- execute(Runnable command)
- Future submit(Runnable)
- 

Callable: callback

