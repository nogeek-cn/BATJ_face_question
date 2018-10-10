package com.darian.BaTJ_face_Question.ReferecceDemo;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * <br>
 * <br>Darian
 **/
public class PhantomReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue queue = new ReferenceQueue();
        Object phamtomObj = new Object();
        PhantomReference phantomReference = new PhantomReference(phamtomObj, queue);
        System.out.println(phantomReference.get());
        phamtomObj = null;
        System.gc();
        System.out.println(phantomReference.get());
        Thread.sleep(1000);
        System.out.println(queue.poll());
    }
}
