package com.darian.BaTJ_face_Question._21_ThreadLocalDemo;

/**
 * <br>
 * <br>Darian
 **/
public class ThreadLocalIntegerDemo {
    private static ThreadLocal<Integer> num = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                int localNum = num.get().intValue() + 5;
                System.out.println(Thread.currentThread().getName() + "-->>" + localNum);
            }, "Thread-" + i).start();
        }
    }
}
