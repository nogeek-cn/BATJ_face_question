package com.darian.BaTJ_face_Question._21_ThreadLocalDemo;

/**
 * <br>
 * <br>Darian
 **/
public class ThreadLocalDemo {
    static Index index = new Index();
    private static ThreadLocal<Index> num = new ThreadLocal<Index>() {
        @Override
        protected Index initialValue() {
//            return new Index();
            return index;
        }
    };

    static class Index {
        int num;

        public void incr() {
            num++;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                Index index = num.get(); // Index 对象
                index.incr();
                System.out.println(Thread.currentThread().getName() + "-->>" + num.get().num);
            }, "Thread-" + i).start();
        }
    }
}
