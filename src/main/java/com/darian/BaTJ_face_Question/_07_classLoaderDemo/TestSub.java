package com.darian.BaTJ_face_Question._07_classLoaderDemo;

/**
 * 子类
 **/
public class TestSub extends Test {
    static Simple simple = new Simple("TestSub类 静态成员变量 Simple 初始化");

    TestSub(){
        System.out.println("子类 TestSub 默认构造方法被调用");
    }

    Simple simple1 = new Simple("TestSub类 普通成员变量 Simple 初始化");
    static {
        System.out.println("子类 TestSub 静态块开始执行");
    }

    public static void main(String[] args) {
        Test test = new Test();
    }
}
