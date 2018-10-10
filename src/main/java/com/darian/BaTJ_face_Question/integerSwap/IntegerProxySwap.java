package com.darian.BaTJ_face_Question.integerSwap;

import java.lang.reflect.Field;

/**
 * <br>
 * <br>Darian
 **/
public class IntegerProxySwap {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 装箱操作
        Integer a = 1, b = 2;
        System.out.println("before:a = " + a + ",b = " + b);
        swap(a, b);
        System.out.println("after：a = " + a + ",b = " + b);
    }

    public static void swap(Integer i1, Integer i2) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        // 可以绕过检查
        field.setAccessible(true);
        int tmp = i1.intValue();
//        Integer tmp = new Integer(i1.intValue());
//        field.set(i1, i2.intValue());   // 涉及到了装箱  i1 -> Integer.valueOf(i2.intValue()).intValue();
//        field.set(i2, tmp);        // i2  -> Integer.valuof(tmp).intValue();
        field.setInt(i1, i2.intValue());
        field.setInt(i2, tmp);
        System.out.println("tmp：" + tmp + ",_tmp:" + Integer.valueOf(tmp));
    }
}
