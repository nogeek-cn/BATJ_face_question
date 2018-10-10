package com.darian.BaTJ_face_Question.integerSwap;

import java.lang.reflect.Field;

/**
 * <br>
 * <br>Darian
 **/
public class Integer129Swap {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer a = 129;
        Integer b = 130;
        System.out.println("before\n    " + "a=" + a + ";b=" + b);
        swap(a, b);
        System.out.println("after\n    " + "a=" + a + ";b=" + b);
    }
    public static void swap(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        int tmp = a;
        field.set(a, b);
        field.set(b,tmp);

    }
}
