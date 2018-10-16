package com.darian.BaTJ_face_Question._19_ThreadStopDemo;

import java.util.concurrent.TimeUnit;

/**
 * <br>
 * <br>Darian
 **/
public class ThreadStopBoolean {
    private volatile static boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            while (!stop) {
            }
        });
        thread.start();
        TimeUnit.SECONDS.sleep(2);
        stop = true;
    }
}
