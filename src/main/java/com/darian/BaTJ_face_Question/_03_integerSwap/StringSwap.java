package com.darian.BaTJ_face_Question._03_integerSwap;

import java.lang.reflect.Field;

/**
 * <br>
 * <br>Darian
 **/
public class StringSwap {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str1 = "aaa";
        String str2 = "bbb";
        System.out.println("before\n    " + "str1=" + str1 + ";str2=" + str2);
        String overrideSet = "Stringbefore";
        String overrideSetReturn = swap(str1, str2, overrideSet);
        System.out.println(overrideSetReturn);
        System.out.println("after\n    " + "str1=" + str1 + ";str2=" + str2);
        System.out.println();
        System.out.println("(overrideSet == overrideSetReturn):"+ (overrideSet == overrideSetReturn));
    }

    public static String swap(String str1, String str2, String overrideSet) throws NoSuchFieldException, IllegalAccessException {
        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);
        String tmp = new String(str1);
        field.set(str1, str2.toCharArray());
        field.set(str2, tmp.toCharArray());
        overrideSet = "Stringbefore";
        return overrideSet;
    }
}
