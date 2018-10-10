package com.darian.BaTJ_face_Question.integerSwap;

import com.darian.BaTJ_face_Question.integerSwap.object.Apple;

/**
 * <br>
 * <br>Darian
 **/
public class ObjectSwap {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(2);
        System.out.println("before\n    " + "apple1=" + apple1 + ";apple2=" + apple2);
        swap(apple1, apple2);
        System.out.println("after\n    " + "apple1=" + apple1 + ";apple2=" + apple2);
    }

    public static void swap(Apple apple1, Apple apple2) {
        Integer tmp = apple1.getBigger();
        apple1.setBigger(apple2.getBigger());
        apple2.setBigger(tmp);
    }
}
