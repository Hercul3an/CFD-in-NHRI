
package me.artiya.jiradt4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * อย่าไปเรียกร้อง
 * ในสิ่ง
 * ที่เรายังไม่มั่นใจว่า
 * 'เราสมควรได้มัน'‬
 * Created by robot on 24/07/15.
 */
public interface UseCallableInsteadRunnable extends ExecutorService {
    <T> Future<T> submit(Callable<T> task);

    Future<?> submit(Runnable task);

    <T> Future<T> submit(Runnable task, T result);
}

interface Callable<V> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    V call() throws Exception;
}

interface Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.