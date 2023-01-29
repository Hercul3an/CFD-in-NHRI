
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