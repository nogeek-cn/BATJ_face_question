package com.darian.BaTJ_face_Question._02_ReferecceDemo;

import java.lang.ref.WeakReference;

/**
 * <br>
 * <br>Darian
 **/
public class WeakReferenceDemo {
    public static void main(String[] args) {
        String str = "darian11";
        WeakReference weakReference = new WeakReference(str);
        str = null;
        System.gc();
        System.out.println("after gc:"+ weakReference.get());
    }
}
