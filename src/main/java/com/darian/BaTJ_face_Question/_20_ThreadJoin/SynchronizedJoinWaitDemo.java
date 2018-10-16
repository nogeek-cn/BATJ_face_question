package com.darian.BaTJ_face_Question._20_ThreadJoin;

/**
 * <br>
 * <br>Darian
 **/
public class SynchronizedJoinWaitDemo {
    static class TestDemo {
        Object lock = new Object();

        public void doTest() throws InterruptedException {
            synchronized (lock){
                lock.wait();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("before");
        new TestDemo().doTest();
        System.out.println("after");
    }
}
