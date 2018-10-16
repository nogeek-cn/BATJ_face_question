package com.darian.BaTJ_face_Question._19_ThreadStopDemo;

import java.util.concurrent.TimeUnit;

/**
 * <br>
 * <br>Darian
 **/
public class InterruptedDemo {
    private static int i;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() ->{
            // 没有被终端的话
            while (Thread.currentThread().isInterrupted()){
                i++;
            }
            System.out.println("num = " + i);
        });

        thread.start();
        TimeUnit.SECONDS.sleep(2);
        thread.interrupt(); // interrupt = true;
    }
}
