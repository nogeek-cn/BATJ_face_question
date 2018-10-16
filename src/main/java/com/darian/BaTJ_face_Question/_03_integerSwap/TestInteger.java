package com.darian.BaTJ_face_Question._03_integerSwap;

/**
 * <br>
 * <br>Darian
 **/
public class TestInteger {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        // 比较内存地址
        System.out.println("（自动包装1）\n   a == b : " + (a == b));
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(1);
        System.out.println("（new Integer(1)）\n    i1 == i2 : " + (i1 == i2));
        Integer m1 = 129;
        Integer m2 = 129;
        System.out.println("（自动包装129）\n     m1 == m2 : " + (m1 == m2));
        Integer n1 = new Integer(129);
        Integer n2 = new Integer(129);
        System.out.println("（new Integer(129)）\n    n1 == n2 : " + (n1 == n2));
    }
}
