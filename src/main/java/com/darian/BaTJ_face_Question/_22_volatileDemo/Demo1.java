package com.darian.BaTJ_face_Question._22_volatileDemo;

/**
 * <br>
 * <br>Darian
 **/
public class Demo1 {

    // 内存可见性问题
    // 内存屏障

    public static volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            int i = 0;
            while (!stop){
                i ++;
            }
            System.out.println("i=" + i);
        }).start();

        Thread.sleep(1000);
        stop = true;
        // storestore, 加了一个内存屏障，
        // 然后就意味着，主线程的 `stop = true` 的这个操作同步到我们的主内存里边。
        // 并且让其它线程用到这个值的都做一个更新。
        // 然后上边再去 读取的时候，就能够拿到最新的值了。
    }
}
