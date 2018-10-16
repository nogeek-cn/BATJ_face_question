package com.darian.BaTJ_face_Question._05_partternDemo.fileUp_adapter;

/**
 * 测试
 **/
public class DemoTest {
    public static void main(String[] args) {

        CloudController cloudController = new CloudController(new CloudService("AWSSDK"));
//        CloudController cloudController = new CloudController(new CloudService("AliSDK"));
        cloudController.storeFileToCloud();
    }
}
