package com.darian.BaTJ_face_Question._12_autowiredDemo;

/**
 * <br>
 * <br>Darian
 **/
public class DemoController  {

    private Demo demo;

    // set 注入
    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public void doTest(){
        // TODO demo.do();
    }
}
