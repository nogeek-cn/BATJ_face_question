package com.darian.BaTJ_face_Question._05_partternDemo.fileUp_adapter;

/**
 * 阿里上传文件的 SDK
 **/
public class AliSDK {

    public void setBucket() {
        System.out.println("ali oss first set bucket");
    }

    public void uploadFile(String fileName) {
        System.out.println("user ali oss upload file:" + fileName);
    }
}
