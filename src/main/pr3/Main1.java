package main.pr3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Stream;

public class Main1 {
    private static final Lock lock = new ReentrantLock();
    private static Map<Integer, String> hashMap = new HashMap<Integer, String>();

    synchronized static void go(int i){
        hashMap.put(i, "string"+i);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread one = new Thread(() -> {
            for (int i = 0; i <= 6; i++) {
                lock.lock();
                go(i);

                lock.unlock();
            }
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i <= 10; i++) {
                lock.lock();
                go(i);
                lock.unlock();

            }
        });

        one.start();
        two.start();
        Thread.sleep(3000);
        System.out.println(hashMap);
    }

}
