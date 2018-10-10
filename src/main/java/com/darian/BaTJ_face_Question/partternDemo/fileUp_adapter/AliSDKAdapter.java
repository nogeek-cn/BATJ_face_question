package com.darian.BaTJ_face_Question.partternDemo.fileUp_adapter;

/**
 * 阿里 上传文件的 SDK 的适配器
 **/
public class AliSDKAdapter implements CloudSDK {

    private AliSDK aliSDK;

    public AliSDKAdapter(AliSDK aliSDK) {
        this.aliSDK = aliSDK;
    }

    @Override
    public void putObject(String fileName) {
        aliSDK.setBucket();
        aliSDK.uploadFile(fileName);
    }
}
