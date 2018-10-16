package com.darian.BaTJ_face_Question._07_classLoaderDemo;

/**
 * 父类
 **/
public class Test {
    static {
        System.out.println("Test类的静态块-1");
    }
    static Simple simple = new Simple("Test类 静态成员变量 Simple 初始化");
    Simple simple1 = new Simple("Test类 sample 普通成员变量初始化：");

    static {
        System.out.println("Test类的静态块-2");
    }
    Test(){
        System.out.println("Test类的无参数构造");
    }
    Simple simple2 = new Simple("Test类 sample2 普通成员变量初始化：");
}
