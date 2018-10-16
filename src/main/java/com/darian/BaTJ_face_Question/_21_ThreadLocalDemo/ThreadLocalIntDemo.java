package com.darian.BaTJ_face_Question._21_ThreadLocalDemo;

/**
 * <br>
 * <br>Darian
 **/
public class ThreadLocalIntDemo {
    private static int num = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                num += 5;
                System.out.println(Thread.currentThread().getName() + "-->>" + num);
            }, "Thread-" + i).start();
        }
    }
}
