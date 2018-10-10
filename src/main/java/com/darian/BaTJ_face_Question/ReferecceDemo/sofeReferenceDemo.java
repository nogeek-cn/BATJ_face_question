package com.darian.BaTJ_face_Question.ReferecceDemo;

import java.lang.ref.SoftReference;

/**
 * <br>
 * <br>Darian
 **/
public class sofeReferenceDemo {
    public static void main(String[] args) {
        Object softRef = new Object();
        SoftReference softReference = new SoftReference(softRef);
        softRef =null;
        System.out.println(softReference.get());
        softReference =null;
        System.out.println(softReference.get());
    }
}
