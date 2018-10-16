package com.darian.BaTJ_face_Question._12_autowiredDemo;

/**
 * <br>
 * <br>Darian
 **/
public class DemoControllerConstor {
    private Demo demo;
    private Demo demo2;

    // 构造注入
    public DemoControllerConstor(Demo demo, Demo demo2) {
        this.demo = demo;
        this.demo2 = demo2;
    }

    public void doTest(){
        // TODO demo.do();
    }
}
