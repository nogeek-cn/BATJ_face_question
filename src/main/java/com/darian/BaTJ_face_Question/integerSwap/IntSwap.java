package com.darian.BaTJ_face_Question.integerSwap;

/**
 * <br>
 * <br>Darian
 **/
public class IntSwap {
    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println("before:a = " + a + ",b = " + b);
        swap(a, b);
        System.out.println("after：a = " +a + ",b = " + b);
    }

    public static void swap(int i1, int i2) {
        int tmp = i1;
        i1 = i2;
        i2 = tmp;
    }
}
