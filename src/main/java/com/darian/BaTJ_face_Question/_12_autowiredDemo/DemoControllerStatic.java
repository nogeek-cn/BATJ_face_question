package com.darian.BaTJ_face_Question._12_autowiredDemo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br>
 * <br>Darian
 **/
public class DemoControllerStatic {
    private Demo demo;

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public void dotest(){
        // TODO
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        context.getBean("demo");
        context.getBean("demo");
    }
}
