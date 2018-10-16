package com.darian.BaTJ_face_Question._23_ThreadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * <br>
 * <br>Darian
 **/
public class TestDemo {

    // 构建一个只有一个线程的线程池。
    static  ExecutorService executorService = Executors.newSingleThreadExecutor();
    // 返回一个固定线程数量的线程池。
//    ExecutorService executorServicce1 = Executors.newFixedThreadPool(1);
    // 返回一个 不限制大小的线程池 （Integer.MaxValue）,
    // 但是创建的这些线程，它会有一个回收机制，空闲 60 秒后，会自动被回收。
//    ExecutorService executorService2 = Executors.newCachedThreadPool();
    // 是可以延时执行的，我们可以通过它做一些定时的调度。
//    ExecutorService executorService3 = Executors.newSingleThreadScheduledExecutor();


    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("1");
        });
        executorService.execute(t1);
    }
}
