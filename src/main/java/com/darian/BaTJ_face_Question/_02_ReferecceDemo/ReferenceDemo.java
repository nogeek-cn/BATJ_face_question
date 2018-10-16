package com.darian.BaTJ_face_Question._02_ReferecceDemo;

/**
 * <br>
 * <br>Darian
 **/
public class ReferenceDemo {

    static Object strongRef = new Object();

    public static void main(String[] args) {
        Object obj = strongRef;
        strongRef = null;
        System.gc();
        System.out.println("gc 之后：" + obj);
        obj = null;
        System.gc();
        System.out.println("obj=null ;gc之后" + obj);

    }
}
