package com.darian.BaTJ_face_Question._05_partternDemo.fileUp_adapter;

/**
 * 我只关心的上传功能，
 * 我不想传一些
 * 不同 SDK 时，不同的参数。
 **/
public class CloudService {

    CloudSDK cloudSDK;

    public CloudService(String cloudStrategy) {
        this.cloudSDK = CloudFactory.create(cloudStrategy);
    }

    public void uploadFile(String fileName) {
        cloudSDK.putObject(fileName);
    }
}
