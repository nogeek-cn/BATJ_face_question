package com.darian.BaTJ_face_Question._07_classLoaderDemo;

/**
 * <br>
 * <br>Darian
 **/
public class SingtonDemo {

    private static SingtonDemo instance = new SingtonDemo();

    public static int count1;

    public static int count2 = 0;

    private SingtonDemo() {
        count1++;
        count2++;
    }

    public static SingtonDemo getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingtonDemo.getInstance();
        System.out.println("count1= " + count1);
        System.out.println("count2= " + count2);

    }
}
