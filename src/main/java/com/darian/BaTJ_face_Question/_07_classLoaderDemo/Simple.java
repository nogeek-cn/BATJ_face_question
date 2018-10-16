package com.darian.BaTJ_face_Question._07_classLoaderDemo;

/**
 * 实体类
 **/
public class Simple {
    public Simple() {
        System.out.println("Simple类的无参构造");
    }

    public Simple(String s) {
        System.out.println("Simple 类的带参数的构造方法，参数为：" + s);
    }
}
