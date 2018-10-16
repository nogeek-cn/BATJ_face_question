package com.darian.BaTJ_face_Question._05_partternDemo.fileUp_adapter;

/**
 * 亚马逊 上传文件的 SDK 的适配器
 **/
public class AWSDKAdapter implements CloudSDK{

    private AWSSDK awssdk;

    public AWSDKAdapter(AWSSDK awssdk) {
        this.awssdk = awssdk;
    }

    @Override
    public void putObject(String fileName) {
        awssdk.putObject(fileName);
    }
}
